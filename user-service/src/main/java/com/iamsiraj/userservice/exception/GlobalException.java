package com.iamsiraj.userservice.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class GlobalException extends RuntimeException {

    private String code;
    private String message;

    public GlobalException(String message){
        super(message);
    }

}
