package com.api.test;

import org.testng.annotations.Test;
import org.testng.Assert;
import io.restassured.response.Response;
import com.api.models.request.UsersRequest;
import com.api.models.response.UsersResponse;
import com.api.services.UsersService;

public class PostUsersTest {

    @Test
    public void postUsers() {
        UsersService usersService = new UsersService();
        UsersRequest usersRequest = new UsersRequest(11, "User 11", "Password11");
        Response response = usersService.postUsers(usersRequest);
        UsersResponse usersResponse = response.as(UsersResponse.class);
        Assert.assertEquals(usersResponse.getId(), 11, "User ID is not 11");
        Assert.assertEquals(usersResponse.getUserName(), "User 11", "User name is not User 11");
        Assert.assertEquals(usersResponse.getPassword(), "Password11", "User password is not Password11");
    }
}
