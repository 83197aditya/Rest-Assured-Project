package com.api.test;

import com.api.models.response.AuthorsResponse;
import com.api.services.AuthorsService;
import io.restassured.response.Response;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

public class GetAuthorsTest {

    @Test
    public void getAuthors() {
        AuthorsService authorsService = new AuthorsService();
        Response authorsResponse = authorsService.getAuthors();
        List<AuthorsResponse> authors = authorsResponse.jsonPath().getList("$",AuthorsResponse.class);

        // Validate the response
        Assert.assertEquals(authorsResponse.getStatusCode(), 200, "Expected status code 200");
        Assert.assertEquals(authors.get(0).getId(), 1);
        Assert.assertEquals(authors.get(0).getIdBook(),1);
        Assert.assertEquals(authors.get(0).getFirstName(), "First Name 1");
        Assert.assertEquals(authors.get(0).getLastName(), "Last Name 1");
    }
}
