package com.noAdd.service.exception;

import com.noAdd.base.bo.ServiceResult;

/**
 * @author Shamim Ahmad
 *
 */
public class DataServiceException extends RuntimeException {
	private static final long serialVersionUID = 1L;
	
	private String errorCode;
	private ServiceResult result = null;
	
	public DataServiceException() {
	}
	
	public DataServiceException(ServiceResult result){
		this.result = result;
	}
	
	public DataServiceException(String errorCode){
		this.errorCode = errorCode;
	}
	
	public DataServiceException(String errorCode, String message) {
		super(message);
		this.errorCode = errorCode;
	}

	public String getErrorCode() {
		return errorCode;
	}
	
	public ServiceResult getResult() {
		return result;
	}
}
