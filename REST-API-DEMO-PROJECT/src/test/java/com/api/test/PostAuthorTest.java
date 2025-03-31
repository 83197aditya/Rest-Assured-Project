package com.api.test;

import org.testng.Assert;
import org.testng.annotations.Test;
import io.restassured.response.Response;
import com.api.models.request.AuthorsRequest;
import com.api.models.response.AuthorsResponse;
import com.api.services.AuthorsService;

public class PostAuthorTest {

    @Test
    public void postAuthor() {
        AuthorsService authorsService = new AuthorsService();
        AuthorsRequest authorsRequest = new AuthorsRequest(30, 32, "First Test Automation 1", "Last Test Automation 1");
        Response authorResponse = authorsService.postAuthors(authorsRequest); 
        AuthorsResponse authorsDetail = authorResponse.as(AuthorsResponse.class);
        Assert.assertEquals(authorsDetail.getId(),30);
        Assert.assertEquals(authorsDetail.getIdBook(),32);
        Assert.assertEquals(authorsDetail.getFirstName(),"First Test Automation 1");
        Assert.assertEquals(authorsDetail.getLastName(),"Last Test Automation 1");
        Assert.assertEquals(authorResponse.getStatusCode(), 200);
    }
}
