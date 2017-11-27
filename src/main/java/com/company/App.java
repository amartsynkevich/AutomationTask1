package com.company;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URI;

public class App
{
    public static void main( String[] args )
    {
        HttpClient client = HttpClientBuilder.create().build();
        HttpGet getRequest = new HttpGet();
        getRequest.setURI(URI.create("https://api.github.com/repos/amartsynkevich/Knight-Hometask2/collaborators"));
        getRequest.setHeader("User-Agent", "сhrome");
        getRequest.setHeader("Authorization", "Basic YW1hcnRzeW5rZXZpY2g6MTIyZmFuZ2l0");
        try {
            HttpResponse response = client.execute(getRequest);
            System.out.println("Response Code : "
                    + response.getStatusLine().getStatusCode());

            BufferedReader rd = new BufferedReader(
                    new InputStreamReader(response.getEntity().getContent()));

            StringBuffer result = new StringBuffer();
            String line = "";
            while ((line = rd.readLine()) != null) {
                result.append(line);
            }
            System.out.println(result.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
