package com.blogger5.Exception;

public class ResourceNotFoundException extends Exception {
    // Constructor that accepts a message
    public ResourceNotFoundException(String message) {
        super(message);
    }

    // Constructor that uses a default message
    public ResourceNotFoundException() {
        super("Resource not found");
    }
}
