package com.api.test;

import com.api.models.response.BooksResponse;
import com.api.services.BooksService;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.List;
import io.restassured.response.Response;

public class GetBooksTest {

    @Test
    public void getBooks() {
        BooksService booksService = new BooksService();
        Response response = booksService.getBooks();
        List<BooksResponse> books = response.jsonPath().getList("$", BooksResponse.class);
        Assert.assertEquals(response.getStatusCode(), 200, "Expected status code 200");
        Assert.assertNotNull(books, "Books list should not be null");
        Assert.assertEquals(books.get(0).getId(), 1, "Expected book ID 1");
        Assert.assertEquals(books.get(0).getTitle(), "Book 1", "Expected book title 'Book 1'");
        Assert.assertEquals(books.get(0).getPageCount(), 100, "Expected page count 100");
    }
}
