package com.chef.demo.payroll;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class EmployeeNotFoundAdvice {
    /*
    @ResponseBody signals that this advice is rendered straight into the response body.
    @ExceptionHandler configures the advice to only respond if an EmployeeNotFoundException is thrown.
    @ResponseStatus says to issue an HttpStatus.NOT_FOUND, i.e. an HTTP 404.
    */
    @ResponseBody
    @ExceptionHandler(EmployeeNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    String employeeNotFoundHandler(EmployeeNotFoundException ex) {
        return ex.getMessage();
    }
}
