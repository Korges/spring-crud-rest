package com.codecool.krk.springcrudrest.exception;

import java.util.function.Supplier;

public class NoCustomerException extends RuntimeException {

    public NoCustomerException(String message) {
        super(message);
    }
}
