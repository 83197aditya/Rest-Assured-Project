package com.api.test;

import org.testng.annotations.Test;
import org.testng.Assert;
import io.restassured.response.Response;
import com.api.models.request.UsersRequest;
import com.api.models.response.UsersResponse;
import com.api.services.UsersService;

public class PutUserByIdTest {

    @Test
    public void putUserById(){
        UsersService usersService = new UsersService();
        UsersRequest payload = new UsersRequest(123, "Updated User", "Updated Password");
        Response userResponse = usersService.putUserById(1, payload);
        UsersResponse user = userResponse.as(UsersResponse.class);
        Assert.assertEquals(userResponse.getStatusCode(), 200, "Status code is not 200");
        Assert.assertEquals(user.getId(), 123, "User ID is not 1");
        Assert.assertEquals(user.getUserName(), "Updated User", "User name is not Updated User");
        Assert.assertEquals(user.getPassword(), "Updated Password", "User password is not Updated Password");
    }

}
