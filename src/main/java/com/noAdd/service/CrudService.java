package com.noAdd.service;

import org.springframework.stereotype.Service;

import com.noAdd.base.bo.ServiceRequest;
import com.noAdd.base.bo.ServiceResponse;

@Service
public interface CrudService {
	
	public ServiceResponse add(ServiceRequest request);
	
	public ServiceResponse read(ServiceRequest request);
	
	public ServiceResponse update(ServiceRequest request);
		
	public ServiceResponse delete(ServiceRequest request);
}
