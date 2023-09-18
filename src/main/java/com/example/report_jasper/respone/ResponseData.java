package com.example.report_jasper.respone;

import java.io.Serializable;

public class ResponseData<T> implements Serializable {

    private static final long serialVersionUID = 1L;

    private int code;
    private String message;

    private String detailMessage;
    private T data;

    public ResponseData(){}

    public ResponseData<T> success(T data){
        this.code = 200;
        this.message = "Success!";
        this.data = data;
        return this;
    }

    public ResponseData<T> error(int code, String message, String detailMessage){
        this.code = code;
        this.message = message;
        this.detailMessage = detailMessage;
        return this;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getDetailMessage() {
        return detailMessage;
    }

    public void setDetailMessage(String detailMessage) {
        this.detailMessage = detailMessage;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
