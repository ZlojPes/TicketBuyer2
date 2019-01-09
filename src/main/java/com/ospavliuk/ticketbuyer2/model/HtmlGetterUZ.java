package com.ospavliuk.ticketbuyer2.model;

import java.io.*;
import java.net.*;
import java.nio.charset.StandardCharsets;
import java.util.*;
import java.util.concurrent.*;

public class HtmlGetterUZ {
    private static CookieManager cookieManager;

    static {
        cookieManager = new CookieManager();
        CookieHandler.setDefault(cookieManager);
        System.out.println(System.currentTimeMillis());
    }

//    static String getURLSource1(String url) throws IOException {
//        String urlParameters = "date=2019-01-31&from=2204001&time=00:00&to=2208001";
//        byte[] postData = urlParameters.getBytes(StandardCharsets.UTF_8);
//        int postDataLength = postData.length;
//        URL urlObject = new URL(url);
//        HttpURLConnection urlConnection = (HttpURLConnection) urlObject.openConnection();
//        urlConnection.setRequestProperty("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:61.0) Gecko/20100101 Firefox/61.0");
//        urlConnection.setRequestProperty("Referer", "https://booking.uz.gov.ua/ru/?from=2204001&to=2208001&date=2018-12-31&time=00%3A00&url=train-list");
//        urlConnection.setInstanceFollowRedirects(false);
//        urlConnection.setRequestMethod("POST");
//        urlConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
//        urlConnection.setRequestProperty("Content-Length", String.valueOf(postDataLength));
//        urlConnection.setDoOutput(true);
//        try (DataOutputStream wr = new DataOutputStream(urlConnection.getOutputStream())) {
//            wr.write(postData);
//        }
//        InputStream inputStream = urlConnection.getInputStream();
//        List<HttpCookie> cookies = cookieManager.getCookieStore().getCookies();
//        for (HttpCookie cookie : cookies) {
//            System.out.println(cookie.getName());
//            System.out.println(cookie.getPath());
//            System.out.println(cookie.getMaxAge());
//            System.out.println(cookie.getValue());
//            System.out.println(cookie.getSecure());
//            System.out.println("**********************");
//        }
//        return toString(inputStream);
//    }

    public static String getUrlSource(String url, String requestMethod, Map<String, String> requestProperty, List<String> postParameters) throws IOException {
        URL urlObject = new URL(url);
        boolean requestMethodIsPost = (requestMethod != null && postParameters != null && requestMethod.equals("POST"));
        HttpURLConnection urlConnection = (HttpURLConnection) urlObject.openConnection();
        urlConnection.setRequestMethod(requestMethodIsPost ? "POST" : "GET");
        Set<Map.Entry<String, String>> propertySet = requestProperty.entrySet();
        for (Map.Entry<String, String> current : propertySet) {
            if (current.getKey() != null && current.getValue() != null) {
                urlConnection.setRequestProperty(current.getKey(), current.getValue());
            }
        }
        if (requestMethodIsPost) {
            urlConnection.setInstanceFollowRedirects(false);
            StringBuilder urlParams = new StringBuilder();
            for (String parameter : postParameters) {
                if (urlParams.length() > 0) {
                    urlParams.append("&");
                }
                urlParams.append(parameter);
            }
            String urlParameters = urlParams.toString();
            System.out.println(urlParameters);
            byte[] postData = urlParameters.getBytes(StandardCharsets.UTF_8);
            int postDataLength = postData.length;
            urlConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            urlConnection.setRequestProperty("Content-Length", String.valueOf(postDataLength));
            urlConnection.setDoOutput(true);
            try (DataOutputStream wr = new DataOutputStream(urlConnection.getOutputStream())) {
                wr.write(postData);
            } catch (IOException e) {
                System.out.println("IOException happens during POST parameters sending: " + e.getMessage());
            }
        }
        InputStream inputStream = urlConnection.getInputStream();
        return toString(inputStream);
    }

    private static String toString(InputStream inputStream) {
        ExecutorService executor = Executors.newCachedThreadPool();
        Callable<String> task = () -> {
            String inputLine;
            StringBuilder stringBuilder = new StringBuilder();
            try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, StandardCharsets.UTF_8))
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
            result = future.get(5, TimeUnit.SECONDS);
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

//    public static void main(String[] args) {
//        try {
//            Map<String, String> prop = new HashMap<>();
//            List<String> params = new ArrayList<>();
//            prop.put("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:61.0) Gecko/20100101 Firefox/61.0");
//            prop.put("Referer", "https://booking.uz.gov.ua/ru/?from=2204001&to=2208001&date=2019-01-30&time=00%3A00&url=train-list");
//            params.add("date=2019-01-30");
//            params.add("from=2204001");
//            params.add("time=00:00");
//            params.add("to=2208001");
//            System.out.println(getUrlSource("https://booking.uz.gov.ua/ru/train_search/", "POST", prop, params));
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }

//    static void getCookies(){
//        List<HttpCookie> cookies = cookieManager.getCookieStore().getCookies();
//        for (HttpCookie cookie : cookies) {
//            System.out.println(cookie.getName());
//            System.out.println(cookie.getPath());
//            System.out.println(cookie.getMaxAge());
//            System.out.println(cookie.getValue());
//            System.out.println(cookie.getSecure());
//            System.out.println("**********************");
//        }
//    }
}
