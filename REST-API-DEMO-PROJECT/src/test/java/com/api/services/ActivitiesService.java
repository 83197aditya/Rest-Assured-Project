package com.api.services;

import io.restassured.response.Response;

public class ActivitiesService extends BaseService {

    private static final String basePath = "/api/v1/";

    public Response getActivities(){
        return getRequest(basePath+"Activities");
    }
}
