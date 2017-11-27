package com.company;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class AddCollaboratorRestAssured {
    public static void main(String[] args) {
        {
            RestAssured.baseURI = "https://api.github.com/repos/amartsynkevich/Students-Hometask2/collaborators";
            RequestSpecification httpRequest1 = RestAssured.given()
                    .header("User-Agent", "chrome")
                    .header("Authorization", "Basic YW1hcnRzeW5rZXZpY2g6MTIyZmFuZ2l0");
            Response response1 = httpRequest1.request(Method.PUT, "/german-yauhen");
            System.out.println("Response Code : "
                    + response1.getStatusCode());
        }
    }
}
