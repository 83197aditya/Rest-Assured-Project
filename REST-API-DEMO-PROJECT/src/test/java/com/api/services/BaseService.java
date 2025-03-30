package com.api.services;

import io.restassured.specification.RequestSpecification;
import io.restassured.response.Response;
import static io.restassured.RestAssured.*;
import io.restassured.http.ContentType;

public class BaseService {
    private static final String BaseURL = "https://fakerestapi.azurewebsites.net";
    private RequestSpecification requestSpec;

    public BaseService(){
        requestSpec = given().baseUri(BaseURL);
    }

    protected Response getRequest(String endpoint){
        return requestSpec.contentType(ContentType.JSON).get(endpoint);
    }
}
