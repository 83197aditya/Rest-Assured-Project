package com.api.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.api.models.response.BooksResponse;
import com.api.services.BooksService;

import io.restassured.response.Response;

public class GetBookByIdTest {
   
    @Test
    public void getBooksById(){
        BooksService booksService = new BooksService();
        Response response = booksService.getBookById(3);
        BooksResponse bookDetail = response.as(BooksResponse.class);
        Assert.assertEquals(response.getStatusCode(), 200, "Expected status code 200");
        Assert.assertEquals(bookDetail.getId(), 3, "Expected book ID 3");
        Assert.assertEquals(bookDetail.getTitle(), "Book 3", "Expected book title 'Book 3'");
        Assert.assertEquals(bookDetail.getPageCount(), 300, "Expected page count 300");
        Assert.assertNotNull(bookDetail.getDescription());
        Assert.assertNotNull(bookDetail.getExcerpt());
    }
}
