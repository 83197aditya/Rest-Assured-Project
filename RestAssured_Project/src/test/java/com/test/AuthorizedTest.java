package com.test;

import com.models.request.AuthorizedRequest;
import com.service.AccountService;
import io.restassured.response.Response;
import org.testng.annotations.Test;

public class AuthorizedTest {

    @Test(description = "Test the Authorized service")
    public void authorizedTest(){
        AccountService auth  = new AccountService();
        AuthorizedRequest loginRequest = new AuthorizedRequest("viday1234","Viday1234@");
        Response apiResponse = auth.authorized(loginRequest);
        Boolean isAuthorized = apiResponse.getBody().as(Boolean.class);
        System.out.println(isAuthorized);
        System.out.println("success");
    }
}
