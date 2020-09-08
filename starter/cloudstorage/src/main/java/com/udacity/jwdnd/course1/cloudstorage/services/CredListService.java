package com.udacity.jwdnd.course1.cloudstorage.services;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CredListService {
    private List<String> creds;

    public CredListService(){
        this.creds = new ArrayList<>();
    }

    public void addCred(String url, String username, String password){
        creds.add(url);
        creds.add(username);
        creds.add(password);
    }

    public List<String> getCreds(){
        return new ArrayList<>(this.creds);
    }
}
