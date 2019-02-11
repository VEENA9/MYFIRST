package com.example.demo.Response;

import com.example.demo.util.Status;

public class PostResponse {
    private String statusCode;
    private String statusDescription;
    private String message;

    public PostResponse() {
        this.statusCode = Status.ERROR.getStatusCode();
        this.statusDescription = Status.ERROR.getStatusDescription();
    }
    public PostResponse(String message) {
        this.statusCode = Status.SUCCESS.getStatusCode();
        this.statusDescription = Status.SUCCESS.getStatusDescription();
        this.message= message;
    }

    public PostResponse(String statusCode, String statusDescription) {
        this.statusCode = statusCode;
        this.statusDescription = statusDescription;
    }

    public PostResponse(Status DIAStatus) {
        this.statusCode = DIAStatus.getStatusCode();
        this.statusDescription = DIAStatus.getStatusDescription();
    }
    public PostResponse(Status DIAStatus,String message) {
        this.statusCode = DIAStatus.getStatusCode();
        this.statusDescription = DIAStatus.getStatusDescription();
        this.message= message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setStatus(Status status) {
        this.statusCode = status.getStatusCode();
        this.statusDescription = status.getStatusDescription();
    }


    public String getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }

    public String getStatusDescription() {
        return statusDescription;
    }

    public void setStatusDescription(String statusDescription) {
        this.statusDescription = statusDescription;
    }
}
