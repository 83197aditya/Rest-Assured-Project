package com.api.test;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.api.models.request.BooksRequest;
import com.api.models.response.BooksResponse;
import com.api.services.BooksService;
import io.restassured.response.Response;

public class PutBookByIdTest {

    @Test
    public void putBookById(){
        BooksService booksService = new BooksService();
        BooksRequest booksRequest = new BooksRequest(10, "Updated Book Title", "Updated Book Description", 1000, "Updated Book Excerpt", "2023-10-01");
        Response bookResponseById = booksService.putBookById(1, booksRequest);
        BooksResponse booksResponse = bookResponseById.as(BooksResponse.class);
        Assert.assertEquals(bookResponseById.getStatusCode(), 200, "Status code is not 200");
        Assert.assertEquals(booksResponse.getId(), 10, "Book ID is not 10");
        Assert.assertEquals(booksResponse.getTitle(), "Updated Book Title", "Book title is not updated");
        Assert.assertEquals(booksResponse.getDescription(), "Updated Book Description", "Book description is not updated");
        Assert.assertEquals(booksResponse.getPageCount(), 1000, "Book page count is not updated");
        Assert.assertEquals(booksResponse.getExcerpt(), "Updated Book Excerpt", "Book excerpt is not updated");
        Assert.assertEquals(booksResponse.getPublishDate(), "2023-10-01T00:00:00", "Book publish date is not updated");
    }

}
