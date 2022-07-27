package com.example.server.model;


import java.io.Serializable;
import java.time.Instant;

@
public class User implements Serializable{


    private String id;
    private String username;
    private String email;
    private String password;

    public void setUsername(String username) {
    }

    public void setEmail(String email) {
    }

    public void setPassword(String password) {
    }

    public void setCreated(Instant now) {
    }

    public void setEnabled(boolean b) {
    }
}
