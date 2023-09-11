package com.example.report_jasper.respone;

public class BaseRespone {

	private String responeCode;
	private String responeMessage;
	
	public BaseRespone(String responeCode, String responeMessage) {
		super();
		this.responeCode = responeCode;
		this.responeMessage = responeMessage;
	}
	
	public String getResponeCode() {
		return responeCode;
	}
	public void setResponeCode(String responeCode) {
		this.responeCode = responeCode;
	}
	public String getResponeMessage() {
		return responeMessage;
	}
	public void setResponeMessage(String responeMessage) {
		this.responeMessage = responeMessage;
	}
	
	
}
