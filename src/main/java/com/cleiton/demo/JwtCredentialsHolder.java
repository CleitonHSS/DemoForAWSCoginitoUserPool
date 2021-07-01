package com.kb.demo;

import org.springframework.stereotype.Component;

@Component
public class JwtCredentialsHolder {
    private String idToken;

    public JwtCredentialsHolder() {
    }

    public String getIdToken() {
        return this.idToken;
    }

    public JwtCredentialsHolder setIdToken(String idToken) {
        this.idToken = idToken;
        return this;
    }
}