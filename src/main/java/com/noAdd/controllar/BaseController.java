package com.noAdd.controllar;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.noAdd.base.bo.ServiceRequest;
import com.noAdd.base.bo.ServiceResponse;
import com.noAdd.base.bo.ServiceResult;
import com.noAdd.bo.UserDetailsBO;
import com.noAdd.security.ApplicationFilter;
import com.noAdd.service.exception.DataServiceException;

/**
 * @author Shamim Ahmad
 *
 */
public class BaseController {

	private static Logger _log = LoggerFactory.getLogger(BaseController.class);
	
	@ModelAttribute("user")
	public UserDetailsBO getUser(HttpServletRequest request){
		UserDetailsBO userDetailsBO = (UserDetailsBO) request.getAttribute(ApplicationFilter.USER_IDENTITY);
		//_log.info("Requester loggedin id : {}",userDetailsBO !=null ? userDetailsBO.getUserId(): "UN_DEFINED");
		return userDetailsBO;
	}
	
	@ModelAttribute("serviceRequest")
	public ServiceRequest createServiceRequest(HttpServletRequest request){
		ServiceRequest sreq = new ServiceRequest();
		sreq.addUser((UserDetailsBO) request.getAttribute(ApplicationFilter.USER_IDENTITY));
		request.setAttribute(ApplicationFilter.SERVICE_REQUEST, sreq);
		return sreq;
	}

	public <T> T getResultBO(ServiceResponse response, Class<T> type){
		T bo = null;
		if (response.getServiceResult().isResult()) {
			bo = response.getResponseData(type);
		} else {
			throw new DataServiceException(response.getServiceResult()); 
		}
		return bo;
	}
	
	public ServiceResult getServiceResult(ServiceResponse response){
		if (response.getServiceResult().isResult()) {
			return response.getServiceResult();
		} else {
			throw new DataServiceException(response.getServiceResult());
		}
	}
	
	public void handleResult(ServiceResponse response){
		if(!response.getServiceResult().isResult()){
			throw new DataServiceException(response.getServiceResult());
		}
	}

}
