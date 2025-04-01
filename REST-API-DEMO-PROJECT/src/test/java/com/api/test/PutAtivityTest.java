package com.api.test;

import org.testng.annotations.Test;
import org.testng.Assert;
import com.api.services.ActivitiesService;
import com.api.models.request.ActivitiesRequest;
import io.restassured.response.Response;
import com.api.models.response.ActivityResponse;


public class PutAtivityTest {
    
    @Test
    public void putActivity(){
        ActivitiesService activitiesService = new ActivitiesService();
        ActivitiesRequest activityRequest = new ActivitiesRequest(31, "Test Automation REST", "2023-10-01", false);
        Response activityResponse = activitiesService.putActivity(31, activityRequest);
        // Validate the response
        Assert.assertEquals(activityResponse.getStatusCode(), 200, "Expected status code 200");
        ActivityResponse activityResponseId = activityResponse.as(ActivityResponse.class);
        // Validate the response body
        Assert.assertNotNull(activityResponse, null);
        Assert.assertEquals(activityResponseId.getId(), 31, "Expected activity ID 31");
        Assert.assertEquals(activityResponseId.getTitle(), "Test Automation REST", "Expected activity title 'Test Automation REST'");
        Assert.assertEquals(activityResponseId.getDueDate(), "2023-10-01T00:00:00", "Expected activity due date '2023-10-01'");
        Assert.assertEquals(activityResponseId.isCompleted(), false, "Expected activity completed status false");
    }
}
