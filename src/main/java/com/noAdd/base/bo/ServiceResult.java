package com.noAdd.base.bo;

/**
 * @author Shamim Ahmad
 *
 */
public class ServiceResult extends SerializableObject {
	
	private static final long serialVersionUID = 1L;
	
	private boolean result;
	private String resultCode;
	private String resultMessage;

	public boolean isResult() {
		return result;
	}
	public void setResult(boolean result) {
		this.result = result;
	}
	public String getResultCode() {
		return resultCode;
	}
	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}
	public String getResultMessage() {
		return resultMessage;
	}
	public void setResultMessage(String resultMessage) {
		this.resultMessage = resultMessage;
	}
	
}
