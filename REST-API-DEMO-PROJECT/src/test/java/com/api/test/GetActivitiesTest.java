package com.api.test;

import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.api.models.response.ActivityResponse;
import com.api.services.ActivitiesService;
import io.restassured.response.Response;


public class GetActivitiesTest {

    @Test
    public void getActivities(){
        ActivitiesService activitiesService = new ActivitiesService();
        Response activitiesResponse = activitiesService.getActivities();
        ObjectMapper objectMapper = new ObjectMapper();
        List<ActivityResponse> activities = null;
        try {
            activities = objectMapper.readValue(
                activitiesResponse.getBody().asString(), 
                new TypeReference<List<ActivityResponse>>() {}
            );
            Assert.assertEquals(activitiesResponse.getStatusCode(),200);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
            Assert.fail("Failed to parse the activities response: " + e.getMessage());
        }
        // Assert that the response contains a list of activities
        Assert.assertNotNull(activitiesResponse);
        for (int i = 0; i < activities.size(); i++) {
            Assert.assertEquals(activities.get(i).getId(), i + 1, "ID mismatch at index " + i);
        }
    }
}
