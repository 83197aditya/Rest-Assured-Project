package com.api.test;

import org.testng.Assert;
import org.testng.annotations.Test;
import io.restassured.response.Response;
import com.api.models.request.ActivitiesRequest;
import com.api.services.ActivitiesService;
import com.api.models.response.ActivityResponse; 

public class PostActivityTest {

    @Test
    public void postActivity(){
        ActivitiesService activitiesService = new ActivitiesService();
        ActivitiesRequest activitiesRequest = new ActivitiesRequest(1, "Test Activity", "2023-10-01", false);
        Response activityResponse = activitiesService.postActivity(activitiesRequest);
        ActivityResponse activitiesResponse = activityResponse.as(ActivityResponse.class);
        Assert.assertEquals(activitiesResponse.getId(), 1, "Activity ID is not 1");
        Assert.assertEquals(activitiesResponse.getTitle(), "Test Activity", "Activity title is not Test Activity");
        Assert.assertEquals(activitiesResponse.isCompleted(), false, "Activity isCompleted status is not false"); 
        
    }
}
