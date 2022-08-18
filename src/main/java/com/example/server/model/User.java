package com.example.server.model;

import javax.persistence.*;
import java.io.Serializable;
import java.time.Instant;

@Entity
public class User implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;
    private String username;
    private String email;
    private String password;
    private String imageURL;

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
