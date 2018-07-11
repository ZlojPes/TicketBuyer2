package com.ospavliuk.ticketbuyer2.model;

import java.io.*;
import java.net.URL;
import java.net.URLConnection;
import java.util.concurrent.*;

public class HtmlGetter {
    static String getURLSource(String url) throws IOException {
        URL urlObject = new URL(url);
        URLConnection urlConnection = urlObject.openConnection();
        urlConnection.setRequestProperty("User-Agent", "Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/30.0.1599.101 Safari/537.36");
        return toString(urlConnection.getInputStream());
    }

    private static String toString(InputStream inputStream) {
        ExecutorService executor = Executors.newCachedThreadPool();
        Callable<String> task = () -> {
            String inputLine;
            StringBuilder stringBuilder = new StringBuilder();
            try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, "UTF-8"))
                 ;BufferedWriter writer = new BufferedWriter(new FileWriter(new File("C:\\Users\\Alex\\Documents\\httpGetterOut.txt")))
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
            System.out.println(getURLSource("https://booking.uz.gov.ua/ru/?from=2204001&to=2208001&date=2018-08-24&time=00%3A00&train=059%D0%9E&wagon_type_id=%D0%9A&wagon_num=4&url=train-wagons"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
