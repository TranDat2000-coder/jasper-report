package com.example.report_jasper.exception;

import com.example.report_jasper.common.BaseErrorCode;

public class BusinessException extends RuntimeException{

    private final BaseErrorCode errorCode;
    private final String detailMessage;

    public BusinessException(BaseErrorCode errorCode, String detailMessage){
        this.errorCode = errorCode;
        this.detailMessage = detailMessage;
    }

    public int getCode(){
        return this.errorCode.getCode();
    }

    public String getMessage(){
        return this.errorCode.getMessage();
    }

    public String getDetailMessage() {
        return detailMessage;
    }
}
