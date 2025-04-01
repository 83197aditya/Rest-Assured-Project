package com.api.test;

import java.util.List;
import io.restassured.response.Response;    
import org.testng.Assert;
import org.testng.annotations.Test;
import com.api.models.response.UsersResponse;
import com.api.services.UsersService;

public class GetUsersTest {

    @Test
    public void getUsers() {
    UsersService usersService = new UsersService();
    Response response = usersService.getUsers();
    List<UsersResponse> usersList = response.jsonPath().getList("$", UsersResponse.class);
    Assert.assertEquals(response.getStatusCode(), 200, "Status code is not 200");
    Assert.assertTrue(usersList.size() > 0, "Users list is empty");
    Assert.assertEquals(usersList.get(0).getId(), 1);
    Assert.assertEquals(usersList.get(0).getUserName(), "User 1");
    Assert.assertEquals(usersList.get(0).getPassword(), "Password1");
    }
}
