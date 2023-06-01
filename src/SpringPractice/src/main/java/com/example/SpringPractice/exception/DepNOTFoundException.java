package com.example.SpringPractice.exception;

public class DepNOTFoundException extends Exception{
    public DepNOTFoundException() {
    }

    public DepNOTFoundException(String message) {
        super(message);
    }

    public DepNOTFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public DepNOTFoundException(Throwable cause) {
        super(cause);
    }

    public DepNOTFoundException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}