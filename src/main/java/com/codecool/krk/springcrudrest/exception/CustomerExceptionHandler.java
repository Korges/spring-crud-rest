package com.codecool.krk.springcrudrest.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class CustomerExceptionHandler {

    @ExceptionHandler
    public ResponseEntity<CustomerResponse> handleException(NoCustomerException exc) {
        CustomerResponse response = new CustomerResponse();
        response.setStatus(HttpStatus.NOT_FOUND.value());
        response.setMessage(exc.getMessage());
        response.setTimeStamp(System.currentTimeMillis());

        return new ResponseEntity<>(response, HttpStatus.NOT_FOUND);
    }
}
