package com.restapi.restapi;
public class hellobean {
    private String message;
    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }
    public hellobean(String message) {
        this.message = message;
    }
    @Override
    public String toString() {
        return "hellobean{" +
                "message='" + message + '\'' +
                '}';
    }
}