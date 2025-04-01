package com.api.services;

import com.api.models.request.AuthorsRequest;

import io.restassured.response.Response;

public class AuthorsService extends BaseService{
    private static final String basePath = "api/v1/";

    public Response getAuthors(){
        return getRequest(basePath + "Authors");
    }

    public Response postAuthors(AuthorsRequest payload){
        return postRequest(basePath + "Authors", payload);
    }

    public Response getAuthorByIdBook(int id){
        return getRequest(basePath + "Authors/authors/books/" + id);
    }

    public Response getAuthorById(int id){
        return getRequest(basePath + "Authors/" + id);
    }

    public Response putAuthorById(int id, AuthorsRequest payload){
        return putRequest(basePath + "Authors/" + id, payload);
    }
}
