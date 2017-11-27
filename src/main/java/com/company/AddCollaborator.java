package com.company;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.impl.client.HttpClientBuilder;
import java.io.IOException;
import java.net.URI;

public class AddCollaborator {
    public static void main( String[] args ) {
        HttpClient client = HttpClientBuilder.create().build();
        HttpPut putRequest = new HttpPut();
        putRequest.setURI(URI.create("https://api.github.com/repos/amartsynkevich/Students-Hometask2/collaborators/german-yauhen"));
        putRequest.setHeader("User-Agent", "сhrome");
        putRequest.setHeader("Authorization", "Basic YW1hcnRzeW5rZXZpY2g6MTIyZmFuZ2l0");
        try {
            HttpResponse response = client.execute(putRequest);
            System.out.println("Response Code : "
                    + response.getStatusLine().getStatusCode());
        }
            catch(IOException e)
            {
                e.printStackTrace();
            }
    }
}

