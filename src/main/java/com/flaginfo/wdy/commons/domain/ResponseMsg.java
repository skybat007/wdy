package com.flaginfo.wdy.commons.domain;

public class ResponseMsg {

	private boolean success;

	private String errorCode;

	private String errorMSg;

	private Object data;

	public ResponseMsg() {
		success = true;
		errorCode = "0";
		errorCode = "";
	}

	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

	public String getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorMSg() {
		return errorMSg;
	}

	public void setErrorMSg(String errorMSg) {
		this.errorMSg = errorMSg;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

}
