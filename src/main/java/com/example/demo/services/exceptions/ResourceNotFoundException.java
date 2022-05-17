package com.example.demo.services.exceptions;

public class ResourceNotFoundException extends RuntimeException {
    private static final long serialVersionUID = 4243231284730422114L;

    public ResourceNotFoundException(Object id) {
        super("Resource not found. Id " + id);
    }
}
