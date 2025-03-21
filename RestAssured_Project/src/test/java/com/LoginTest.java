package com;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class LoginTest {

    @Test
    public void loginTest() {
        RestAssured.baseURI = "https://demoqa.com";
        RequestSpecification request = RestAssured.given();
        
        request.header("Content-Type", "application/json");
        request.body("{\"userName\": \"viday1234\",\"password\": \"Viday1234@\"}");

        Response response = request.post("/Account/v1/Authorized");

        // Debugging output
        System.out.println("Status Code: " + response.getStatusCode());
        System.out.println("Response Body: " + response.getBody().asString());
        System.out.println("Response Headers: " + response.getHeaders().toString());
    }
}