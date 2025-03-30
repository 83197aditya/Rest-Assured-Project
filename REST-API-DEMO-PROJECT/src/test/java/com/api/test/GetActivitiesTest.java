package com.api.test;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.api.services.ActivitiesService;
import io.restassured.response.Response;

public class GetActivitiesTest {

    @Test
    public void getActivitiesTest(){
        ActivitiesService activitiesService = new ActivitiesService();
        Response activitiesResponse = activitiesService.getActivities();
        Assert.assertEquals(activitiesResponse.getStatusCode(),200);
    }
}
