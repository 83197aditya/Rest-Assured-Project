package com.models.request;

public class AuthorizedRequest {
    private String username;
    private String password;

    public AuthorizedRequest(String username, String password){
        this.username = username;
        this.password = password;
    }

    public String getUserName(){
        return username;
    }

    public String getPassword(){
        return password;
    }

    public void setUserName(String username){
        this.username=username;
    }

    public void setPassword(String password){
        this.password=password;
    }

    public String toString(){
        return "AuthorizedRequest[username ="+username+", password ="+ password +"]";
    }
}
