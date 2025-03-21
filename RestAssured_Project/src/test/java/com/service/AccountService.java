package com.service;

import com.models.request.AuthorizedRequest;

import io.restassured.response.Response;

public class AccountService extends InnerBaseService{

    private static final String Base_Path = "/Account/v1/";
    public Response authorized(AuthorizedRequest payload){
        return postRequest(payload, Base_Path+"Authorized");
    }
}
