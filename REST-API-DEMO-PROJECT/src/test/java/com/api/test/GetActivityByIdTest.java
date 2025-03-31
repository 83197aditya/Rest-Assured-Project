package com.api.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.api.models.response.ActivityResponse;
import com.api.services.ActivitiesService;

import io.restassured.response.Response;

public class GetActivityByIdTest {

    @Test
    public void getActivityById() {
        ActivitiesService activitiesService = new ActivitiesService();
        Response activityIdResponse = activitiesService.getActivityById(1);
        // Validate the response
        Assert.assertEquals(activityIdResponse.getStatusCode(), 200, "Expected status code 200");
        ActivityResponse activityIdResponseId = activityIdResponse.as(ActivityResponse.class);
        // Validate the response body
        Assert.assertNotNull(activityIdResponse, null);
        Assert.assertEquals(activityIdResponseId.getId(), 1, "Expected activity ID 1");
        Assert.assertEquals(activityIdResponseId.getTitle(), "Activity 1", "Expected activity title 'Test Activity'");
        Assert.assertEquals(activityIdResponseId.isCompleted(), false, "Expected activity completed status false");
    }
}
