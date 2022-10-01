package com.penaltycalculation.exception.base;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import javax.xml.bind.ValidationException;

@ControllerAdvice
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(ValidationException.class)
    @ResponseBody
    public ResponseEntity<?> handleValidationException(Exception e) {
        ValidationException exception = (ValidationException) e;
        logger.error("[ValidationException]. Exception: {0}", exception);
        return ResponseEntity.status(404).body(exception.getMessage());
    }
}

