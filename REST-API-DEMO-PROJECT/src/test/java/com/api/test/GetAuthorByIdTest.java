package com.api.test;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.api.services.AuthorsService;
import io.restassured.response.Response;
import com.api.models.response.AuthorsResponse;

public class GetAuthorByIdTest {

    @Test
    public void getAuthorById() {
        AuthorsService authorsService = new AuthorsService();
        Response authorByIdResponse = authorsService.getAuthorById(10);
        AuthorsResponse authorById = authorByIdResponse.as(AuthorsResponse.class);
        // Validate the response
        Assert.assertEquals(authorByIdResponse.getStatusCode(), 200, "Expected status code 200");
        Assert.assertEquals(authorById.getId(), 10, "Expected author ID 10");
        Assert.assertEquals(authorById.getFirstName(), "First Name 10", "Expected author first name 'First Name 10'");
        Assert.assertEquals(authorById.getLastName(), "Last Name 10", "Expected author last name 'Last Name 10'");
    }
}
