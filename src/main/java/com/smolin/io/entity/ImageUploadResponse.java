package com.smolin.io.entity;

public class ImageUploadResponse {

    private String message;

    public ImageUploadResponse(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "ImageUploadResponse{" +
                "message='" + message + '\'' +
                '}';
    }
}
