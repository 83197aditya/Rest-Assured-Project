package com.api.test;

import org.testng.Assert;
import org.testng.annotations.Test;
import io.restassured.response.Response;
import com.api.models.request.ActivitiesRequest;
import com.api.services.ActivitiesService;

public class PostActivityTest {

    @Test
    public void postActivity(){
        ActivitiesService activitiesService = new ActivitiesService();
        ActivitiesRequest activitiesRequest = new ActivitiesRequest(1, "Test Activity", "2023-10-01", false);
        Response ActivityResponse = activitiesService.postActivity(activitiesRequest);
        // Validate the response
        Assert.assertEquals(ActivityResponse.getStatusCode(), 200, "Expected status code 200");   
    }
}
