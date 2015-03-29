package com.noAdd.base.bo;

import com.noAdd.bo.UserDetailsBO;


/**
 * @author Shamim Ahmad
 *
 */
public class ServiceRequest extends ServiceAttributes {
	private static final long serialVersionUID =1L;

	public ServiceRequest() {
		super();
	}
	
		
	public void addRequestData(Object requestData){
		addAttribute(ServiceCommonAttributes.REQUEST_DATA.getValue(), requestData);
	}

	public <T> T getRequestData(Class<T> type){
		
		return getObjectAttribute(ServiceCommonAttributes.REQUEST_DATA.getValue(), type);
	}
	
	public void addUser(UserDetailsBO user){
		addAttribute(ServiceCommonAttributes.USER.getValue(), user);
	}
	
	public UserDetailsBO getUser(){
		return getObjectAttribute(ServiceCommonAttributes.USER.getValue(), UserDetailsBO.class);
	}
	
	public boolean userAttributeExists(){
		UserDetailsBO user = getUser();
		boolean result = user != null;
		if(result){
	//		result = user.isUserIdAndOrgIdDefined();
		}
		return result;
	}
}
