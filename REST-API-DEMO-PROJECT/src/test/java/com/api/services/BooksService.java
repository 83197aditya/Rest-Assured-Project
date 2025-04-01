package com.api.services;

import io.restassured.response.Response;
import com.api.models.request.BooksRequest;

public class BooksService extends BaseService {
    private static final String basePath = "api/v1/";

    public Response getBooks() {
        return getRequest(basePath + "Books");
    }
    public Response postBooks(BooksRequest payload) {
        return postRequest(basePath + "Books", payload);
    }
    public Response getBookById(int id) {
        return getRequest(basePath + "Books/" + id);
    }
    public Response putBookById(int id, BooksRequest payload) {
        return putRequest(basePath + "Books/" + id, payload);
    }
}
