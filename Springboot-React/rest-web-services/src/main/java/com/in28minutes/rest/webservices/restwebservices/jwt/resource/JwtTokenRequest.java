package com.in28minutes.rest.webservices.restwebservices.jwt.resource;

import java.io.Serializable;

public class  JwtTokenRequest implements Serializable {
  
  private static final long serialVersionUID = -5616176897013108345L;

  private String username;
    private String password;
    
//    {
//    	"token": "eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJpbjI4bWludXRlcyIsImV4cCI6MTY0NTYzMzA3NywiaWF0IjoxNjQ1MDI4Mjc3fQ.Vu3yDQAz7dZttl1dkoIfP0edpVP754L9yoeIcfzHj0CQ4RMTrS0-SqHj9LckxK1h_H19aVvA5AQKJtkrYaOREg"
//    }

    public JwtTokenRequest() {
        super();
    }

    public JwtTokenRequest(String username, String password) {
        this.setUsername(username);
        this.setPassword(password);
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

