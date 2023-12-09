package org.example;

public class  StringListIsFullException extends RuntimeException {
    public StringListIsFullException() {
    }

    public StringListIsFullException(String message) {
        super(message);
    }

    public StringListIsFullException(String message, Throwable cause) {
        super(message, cause);
    }

    public StringListIsFullException(Throwable cause) {
        super(cause);
    }

    public StringListIsFullException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
