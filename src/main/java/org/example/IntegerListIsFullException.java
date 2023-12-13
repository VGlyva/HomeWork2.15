package org.example;

public class IntegerListIsFullException extends RuntimeException {
    public IntegerListIsFullException() {
    }

    public IntegerListIsFullException(String message) {
        super(message);
    }

    public IntegerListIsFullException(String message, Throwable cause) {
        super(message, cause);
    }

    public IntegerListIsFullException(Throwable cause) {
        super(cause);
    }

    public IntegerListIsFullException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
