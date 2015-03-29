package com.noAdd.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.noAdd.base.bo.ServiceRequest;
import com.noAdd.base.bo.ServiceResponse;
import com.noAdd.bo.UserDetailsBO;
import com.noAdd.cdo.UserDetailsDO;
import com.noAdd.mapper.Mapper;
import com.noAdd.repo.UserDetailsRepository;
import com.noAdd.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired private UserDetailsRepository userRepo;
	@Autowired private Mapper mapper;
	
	@Override
	public ServiceResponse add(ServiceRequest request) {
		UserDetailsBO bo = null;
		
		bo = request.getRequestData(mapper.getBOType());
		
		if(bo!=null){
			UserDetailsDO userDetailsDO = mapper.createNewDOFromBO(bo);
			userRepo.save(userDetailsDO);
		}
		return null;
	}

	@Override
	public ServiceResponse read(ServiceRequest request) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ServiceResponse update(ServiceRequest request) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ServiceResponse delete(ServiceRequest request) {
		// TODO Auto-generated method stub
		return null;
	}
		

}
