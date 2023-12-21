package com.iamsiraj.userservice.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;

@ControllerAdvice
public class GlobalExceptionHandler {

public ResponseEntity<ErrorResponse> handleGlobalException(GlobalException e){
    ErrorResponse errorResponse = new ErrorResponse(e.getCode(),e.getMessage());
    return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(errorResponse);
}
}
