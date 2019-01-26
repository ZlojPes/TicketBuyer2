package com.ospavliuk.ticketbuyer2.model;

import java.io.*;
import java.net.*;
import java.nio.charset.StandardCharsets;
import java.util.*;
import java.util.concurrent.*;

class HtmlGetterUZ {
    private static CookieManager cookieManager;

    static {
        cookieManager = new CookieManager();
        CookieHandler.setDefault(cookieManager);
    }

    static String getUrlSource(String url, String requestMethod, Map<String, String> requestProperty, Map<String, String> postParameters) throws IOException {
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
            Set<Map.Entry<String, String>> paramSet = postParameters.entrySet();
            for (Map.Entry<String, String> current : paramSet) {
                if (urlParams.length() > 0) {
                    urlParams.append("&");
                }
                if (current.getKey() != null && current.getValue() != null) {
                    urlParams.append(current.getKey());
                    urlParams.append("=");
                    urlParams.append(current.getValue());
                }
            }
            String urlParameters = urlParams.toString();
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
//                 ; BufferedWriter writer = new BufferedWriter(new FileWriter(new File("d:\\httpGetterOutUZ.json")))
            ) {
                while ((inputLine = bufferedReader.readLine()) != null) {
                    stringBuilder.append(inputLine);
//                    writer.write(inputLine);
//                    writer.newLine();
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
            System.out.println("request");
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

    static void getCookies() {
        List<HttpCookie> cookies = cookieManager.getCookieStore().getCookies();
        cookies.
                stream().
                filter(cookie -> cookie.getName().contains("sessid")).
                forEach(cookie -> System.out.println(cookie.getName() + ": " + cookie.getValue()));
//        for (HttpCookie cookie : cookies) {
//            System.out.println(cookie.getName());
//            System.out.println(cookie.getPath());
//            System.out.println(cookie.getMaxAge());
//            System.out.println(cookie.getValue());
//            System.out.println(cookie.getSecure());
//            System.out.println("**********************");
//        }
    }
}
