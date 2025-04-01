package com.api.test;

import org.testng.Assert;
import org.testng.annotations.Test;
import io.restassured.response.Response;
import com.api.services.AuthorsService;
import com.api.models.response.AuthorsResponse;
import java.util.List;

public class GetAuthorByIdBookTest {

    @Test
    public void getAuthorByIdBook(){
        AuthorsService authorsService = new AuthorsService();
        Response authorByIdBook = authorsService.getAuthorByIdBook(1);
        List<AuthorsResponse> authorByIdBookResponse = authorByIdBook.jsonPath().getList("$", AuthorsResponse.class);
        Assert.assertEquals(authorByIdBook.getStatusCode(), 200, "Expected status code 200");
        Assert.assertEquals(authorByIdBookResponse.get(0).getId(), 1, "Expected author ID 1");
        Assert.assertEquals(authorByIdBookResponse.get(1).getId(), 2, "Expected book ID 2");
        Assert.assertEquals(authorByIdBookResponse.get(0).getIdBook(), 1, "Expected author ID 1");
        Assert.assertEquals(authorByIdBookResponse.get(1).getIdBook(), 1, "Expected book ID 2");
    }
}
