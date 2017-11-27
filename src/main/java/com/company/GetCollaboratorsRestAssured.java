package com.company;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class GetCollaboratorsRestAssured {
    public static void main(String[] args) {
        {
            RestAssured.baseURI = "https://api.github.com/repos/amartsynkevich/Knight-Hometask2";
            RequestSpecification httpRequest = RestAssured.given()
                    .header("User-Agent", "chrome")
                    .header("Authorization", "Basic YW1hcnRzeW5rZXZpY2g6MTIyZmFuZ2l0");
            Response response = httpRequest.request(Method.GET, "/collaborators");
            String responseBody = response.getBody().asString();
            System.out.println("Response Body is =>  " + responseBody);
        }
    }
}
