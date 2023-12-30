package com.example.enocachallenge.exception;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

public class ResourceNotFound extends Exception{
    private String message;

    public ResourceNotFound(String message) {
        this.message = message;
    }

    public ResourceNotFound(String message, String message1) {
        super(message);
        this.message = message1;
    }

    public ResourceNotFound(String message, Throwable cause, String message1) {
        super(message, cause);
        this.message = message1;
    }

    public ResourceNotFound(Throwable cause, String message) {
        super(cause);
        this.message = message;
    }

    public ResourceNotFound(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace, String message1) {
        super(message, cause, enableSuppression, writableStackTrace);
        this.message = message1;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
