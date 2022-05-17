package com.example.demo.services.exceptions;

public class DataBaseException extends RuntimeException {
    private static final long serialVersionUID = -3709249268611213071L;

    public DataBaseException(String msg) {
        super(msg);
    }
}
