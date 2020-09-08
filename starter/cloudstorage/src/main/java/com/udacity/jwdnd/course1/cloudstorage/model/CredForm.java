package com.udacity.jwdnd.course1.cloudstorage.model;

public class CredForm {
    //User should be able to get a description of their credentials: URL, Username, and Password
    //Data is being retrieved

    private String url;
    private String username;
    private String password;

    public String getURL(){
        return url;
    }

    public void setURL(String url){
        this.url = url;
    }

    public String getUsername(){
        return username;
    }

    public void setUsername(String username){
        this.username = username;
    }

    public String getPassword(){
        return password;
    }

    public void setPassword(String password){
        this.password = password;
    }
}
