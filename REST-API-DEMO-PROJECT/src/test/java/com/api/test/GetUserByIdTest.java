package com.api.test;

import org.testng.Assert;
import org.testng.annotations.Test;
import io.restassured.response.Response;
import com.api.models.response.UsersResponse;
import com.api.services.UsersService;

public class GetUserByIdTest {

    @Test
    public void getUserById() {
        UsersService usersService = new UsersService();
        Response userResponse = usersService.getUsersById(1);
        UsersResponse user = userResponse.as(UsersResponse.class);
        Assert.assertEquals(user.getId(), 1, "User ID is not 1");
        Assert.assertEquals(user.getUserName(), "User 1", "User name is not User 1");
        Assert.assertEquals(user.getPassword(), "Password1", "User password is not Password1");
    }
}
