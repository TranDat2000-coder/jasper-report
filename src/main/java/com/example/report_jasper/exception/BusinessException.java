package com.example.report_jasper.exception;

public class BusinessException extends RuntimeException{

    private final int errorCode;
    private final String detailMessage;

    public BusinessException(String message, int errorCode){
        this.errorCode = errorCode;
        this.detailMessage = message;
    }
}
