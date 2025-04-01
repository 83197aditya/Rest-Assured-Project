package com.api.services;

import com.api.models.request.ActivitiesRequest;

import io.restassured.response.Response;

public class ActivitiesService extends BaseService {

    private static final String basePath = "/api/v1/";

    public Response getActivities(){
        return getRequest(basePath+"Activities");
    }

    public Response postActivity(ActivitiesRequest payload){
        return postRequest(basePath+"Activities", payload);
    }

    public Response getActivityById(int id){
        return getRequest(basePath+"Activities/"+id);
    }

    public Response putActivity(int id, ActivitiesRequest payload){
        return putRequest(basePath+"Activities/"+id, payload);
    }
}
