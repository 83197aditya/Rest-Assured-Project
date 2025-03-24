package com.test;

import org.testng.annotations.Test;
import com.models.request.GenerateTokenRequest;
import com.models.response.GenerateTokenResponse;
import com.service.AccountService;
import io.restassured.response.Response;

public class GenerateTokenTest {
    
    @Test(description = "Test token is getting generated on authorized")
    public void generateTokenTest(){
        AccountService token = new AccountService();
        GenerateTokenRequest generateTokenRequest = new GenerateTokenRequest("viday1234", "Viday1234@");
        Response tokenResponse = token.generateToken(generateTokenRequest);
        GenerateTokenResponse outputValue = tokenResponse.as(GenerateTokenResponse.class);
        System.out.println(outputValue.getToken());
        System.out.println(outputValue.getExpires());
        System.out.println(outputValue.getResult());
        System.out.println(outputValue.getStatus());
    }

}
