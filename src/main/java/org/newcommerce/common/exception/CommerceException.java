package org.newcommerce.common.exception;

public class CommerceException extends RuntimeException {

    public CommerceException() {
    }

    public CommerceException(String message) {
        super(message);
    }
}
