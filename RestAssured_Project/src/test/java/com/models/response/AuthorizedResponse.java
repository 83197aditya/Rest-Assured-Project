package com.models.response;

public class AuthorizedResponse {
    private boolean value;

    public AuthorizedResponse(){
    }

    public boolean getValue(){
        return value;
    }
    public void setValue(boolean value){
        this.value = value;
    }
    public String toString(){
        return "AuthorizedResponse[value="+value+"]";
    }
}
