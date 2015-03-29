package com.noAdd.base.bo;

/**
 * @author Shamim Ahmad
 *
 */

public class ServiceResponse extends ServiceAttributes {
	private static final long serialVersionUID = 1L;
	ServiceResult serResult = null;
	
	public ServiceResponse (boolean result, String resultCode){
		super();
		serResult = new ServiceResult();
	}

	public void addResponseData(Object responseData){
		addAttribute(ServiceCommonAttributes.REQUEST_DATA.getValue(), responseData);
	}
	
	public <T> T getResponseData (Class<T> type){
		return getObjectAttribute(ServiceCommonAttributes.RESPONSE_DATA.getValue(), type);
	}
	
	public Object getResponseData(){
		return getObjectAttribute(ServiceCommonAttributes.RESPONSE_DATA.getValue());
	}
	
	public ServiceResult getServiceResult(){
		return this.serResult;
	}
	
}
