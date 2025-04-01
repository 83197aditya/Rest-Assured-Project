package com.api.services;

import com.api.models.request.UsersRequest;

import io.restassured.response.Response;

public class UsersService extends BaseService {
    private static final String BASE_URL = "/api/v1/";

    public Response getUsers() {
        return getRequest(BASE_URL + "users");
    }
    public Response postUsers(UsersRequest payload) {
        return postRequest(BASE_URL + "users", payload);
    }
    public Response getUsersById(int id) {
        return getRequest(BASE_URL + "users/" + id);
    }
    public Response putUserById(int id, UsersRequest payload) {
        return putRequest(BASE_URL + "users/" + id, payload);
    }
}
