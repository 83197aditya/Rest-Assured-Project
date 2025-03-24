package com.models.response;

public class GenerateTokenResponse {
    private String token;
    private String expires; 
    private String status;
    private String result;

    public GenerateTokenResponse(){

    }
    public String getToken(){
        return token;
    }
    public String getExpires(){
        return expires;
    }
    public String getStatus(){
        return status;
    }
    public String getResult(){
        return result;
    }

    public void setToken(String token){
        this.token = token;
    }
    public void setExpires(String expires){
        this.expires = expires;
    }
    public void setStatus(String status){
        this.status = status;
    }
    public void setResult(String result){
        this.result = result;
    }                

    public String toString(){
        return "GenerateTokenResponse[token="+token+" expires="+expires+" status="+status+" result="+result+"]";
    }
}
