package com.example.report_jasper.common;

import org.springframework.http.HttpStatus;

public interface BaseErrorCode {

    int getCode();

    String getMessage();

    HttpStatus getHttpStatus();
}
