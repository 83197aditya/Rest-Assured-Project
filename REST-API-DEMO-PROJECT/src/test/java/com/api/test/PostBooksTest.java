package com.api.test;

import org.testng.Assert;
import org.testng.annotations.Test;
import io.restassured.response.Response;
import com.api.models.request.BooksRequest;
import com.api.models.response.BooksResponse;
import com.api.services.BooksService;

public class PostBooksTest {

    @Test
    public void postBooks() {
        BooksService booksService = new BooksService();
        BooksRequest booksRequest = new BooksRequest(1, "Test Book", "Test Automation description book", 100, "Lorem lorem lorem. Lorem lorem lorem." ,"2023-10-01");
        Response postResponse = booksService.postBooks(booksRequest);
        BooksResponse booksResponse = postResponse.as(BooksResponse.class);
        Assert.assertEquals(postResponse.getStatusCode(), 200, "Expected status code 200");
        Assert.assertEquals(booksResponse.getId(), 1, "Expected book ID 1");
        Assert.assertEquals(booksResponse.getTitle(), "Test Book", "Expected book title 'Test Book'");
        Assert.assertEquals(booksResponse.getDescription(), "Test Automation description book", "Expected book description 'Test Automation description book'");
        Assert.assertEquals(booksResponse.getPageCount(), 100, "Expected page count 100");
        Assert.assertEquals(booksResponse.getExcerpt(), "Lorem lorem lorem. Lorem lorem lorem.", "Expected book excerpt 'Lorem lorem lorem. Lorem lorem lorem.'");
        Assert.assertEquals(booksResponse.getPublishDate(), "2023-10-01T00:00:00", "Expected book publish date '2023-10-01'");
    }
}
