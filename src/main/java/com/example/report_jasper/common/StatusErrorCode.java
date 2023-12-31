package com.example.report_jasper.common;

import org.springframework.http.HttpStatus;

public enum StatusErrorCode implements BaseErrorCode{

        DATA_NOT_EXITS(203, "Report fail!", HttpStatus.BAD_REQUEST)
    ;

    private int code;

    private String message;

    private HttpStatus httpStatus;

    StatusErrorCode(int code, String message, HttpStatus httpStatus){
        this.code = code;
        this.message = message;
        this.httpStatus = httpStatus;
    }

    @Override
    public int getCode() {
        return this.code;
    }

    @Override
    public String getMessage() {
        return this.message;
    }

    @Override
    public HttpStatus getHttpStatus() {
        return this.httpStatus;
    }
}
