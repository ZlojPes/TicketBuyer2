package com.ospavliuk.ticketbuyer2.model;

import java.io.*;
import java.net.*;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.concurrent.*;

public class HtmlGetterUZ {
    static CookieManager cookieManager;

    static {
        cookieManager = new CookieManager();
        CookieHandler.setDefault(cookieManager);
        System.out.println(System.currentTimeMillis());
    }

    static String getURLSource(String url) throws IOException {
        String urlParameters = "date=2018-12-29&from=2204001&time=00:00&to=2208001";
        byte[] postData = urlParameters.getBytes(StandardCharsets.UTF_8);
        int postDataLength = postData.length;
        URL urlObject = new URL(url);
        HttpURLConnection urlConnection = (HttpURLConnection) urlObject.openConnection();
        urlConnection.setRequestProperty("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:61.0) Gecko/20100101 Firefox/61.0");
        urlConnection.setRequestProperty("Referer", "https://booking.uz.gov.ua/ru/?from=2204001&to=2208001&date=2018-12-29&time=00%3A00&url=train-list");
        urlConnection.setRequestProperty("Cookie", "_gv_lang=ru; HTTPSERVERID=server4; _gv_sessid=v4htpujmjqshm682fkptk7dv90");
        urlConnection.setInstanceFollowRedirects(false);
        urlConnection.setRequestMethod("POST");
        urlConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
        urlConnection.setRequestProperty("Content-Length", String.valueOf(postDataLength));
        urlConnection.setDoOutput(true);
        try (DataOutputStream wr = new DataOutputStream(urlConnection.getOutputStream())) {
            wr.write(postData);
        }
        InputStream inputStream = urlConnection.getInputStream();
        List<HttpCookie> cookies = cookieManager.getCookieStore().getCookies();
        for (HttpCookie cookie : cookies) {
            System.out.println(cookie.getName());
            System.out.println(cookie.getPath());
            System.out.println(cookie.getMaxAge());
            System.out.println(cookie.getValue());
            System.out.println(cookie.getSecure());
            System.out.println("**********************");
        }
        return toString(inputStream);
    }

    private static String toString(InputStream inputStream) {
        ExecutorService executor = Executors.newCachedThreadPool();
        Callable<String> task = () -> {
            String inputLine;
            StringBuilder stringBuilder = new StringBuilder();
            try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, "UTF-8"))
                 ; BufferedWriter writer = new BufferedWriter(new FileWriter(new File("d:\\httpGetterOutUZ.json")))
            ) {
                while ((inputLine = bufferedReader.readLine()) != null) {
                    stringBuilder.append(inputLine);
                    writer.write(inputLine);
                    writer.newLine();
                }
            } catch (IOException e) {
                System.out.print(e.getMessage());
            }
            return stringBuilder.toString();
        };
        Future<String> future = executor.submit(task);
        String result = "Connection failed!";
        try {
            result = future.get(10, TimeUnit.SECONDS);
        } catch (TimeoutException ex) {
            System.out.print("TimeOut");
        } catch (InterruptedException e) {
            System.out.print("InterruptedException");
        } catch (ExecutionException e) {
            System.out.print("ExecutionException");
        } finally {
            future.cancel(true);
        }
        return result;
    }

    public static void main(String[] args) {
        try {
            System.out.println(getURLSource("https://booking.uz.gov.ua/ru/train_search/"));
            System.out.println(getURLSource("https://booking.uz.gov.ua/ru/train_search/"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
