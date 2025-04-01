package com.service;

import static io.restassured.RestAssured.*;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.http.ContentType;

public class InnerBaseService{

    private static final String BaseURL = "https://demoqa.com";
    private RequestSpecification requestSpec;

    public InnerBaseService(){
        requestSpec = given().baseUri(BaseURL);
    }

    protected Response postRequest(Object payload, String endpoint){
       return requestSpec.contentType(ContentType.JSON).body(payload).post(endpoint);
    }

    
}