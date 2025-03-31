package com.api.test;

import org.testng.Assert;
import org.testng.annotations.Test;
import io.restassured.response.Response;
import com.api.models.request.AuthorsRequest;
import com.api.models.response.AuthorsResponse;
import com.api.services.AuthorsService;

public class PutAuthorByIdTest {

    @Test
    public void putAuthorById() {
        AuthorsService  authorsService = new AuthorsService();
        AuthorsRequest authorsRequest = new AuthorsRequest(1, 1, "Updated First Name 1", "Updated Last Name 1");
        Response authorResponseById = authorsService.putAuthorById(1, authorsRequest);
        AuthorsResponse authorDetail = authorResponseById.as(AuthorsResponse.class);
        // Validate the response
        Assert.assertEquals(authorResponseById.getStatusCode(), 200, "Expected status code 200");
        Assert.assertEquals(authorDetail.getId(), 1, "Expected author ID 1");
        Assert.assertEquals(authorDetail.getIdBook(), 1, "Expected book ID 1");
        Assert.assertEquals(authorDetail.getFirstName(), "Updated First Name 1", "Expected author first name 'Updated First Name 1'");
        Assert.assertEquals(authorDetail.getLastName(), "Updated Last Name 1", "Expected author last name 'Updated Last Name 1'");
    }
}
