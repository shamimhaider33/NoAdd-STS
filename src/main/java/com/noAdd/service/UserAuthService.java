package com.noAdd.service;

import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;

import com.noAdd.base.bo.ServiceRequest;
import com.noAdd.base.bo.ServiceResponse;

/**
 * @author Shamim Ahmad
 *
 */
@Service
public interface UserAuthService extends UserDetailsService {
	
	public ServiceResponse authenticate (ServiceRequest request); 
	public ServiceResponse addCurrentOrgGroups(ServiceRequest request);
	
}
