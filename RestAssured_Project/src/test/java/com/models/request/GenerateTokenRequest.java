package com.models.request;

public class GenerateTokenRequest {
    private String userName;
    private String password;

    public GenerateTokenRequest(String userName, String password){
        this.userName = userName;
        this.password = password;
    }
    public void setUserName(String userName){
        this.userName = userName;
    }
    public void setPassword(String password){
        this.password = password;
    }
    public String getUserName(){
        return userName;
    } 
    public String getPassword(){
        return password;
    }

    public String toString(){
        return "GenerateToken [username ="+userName+", password ="+ password +"]";
    }
}
