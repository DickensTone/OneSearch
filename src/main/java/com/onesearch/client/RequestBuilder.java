package com.onesearch.client;

public class RequestBuilder {
    public String buildRequest(String action, String data) {
        // Logic to build client request
        return action + ":" + data;
    }
}
