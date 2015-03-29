package com.noAdd.mapper;

import org.springframework.stereotype.Component;

import com.noAdd.bo.UserDetailsBO;
import com.noAdd.cdo.UserDetailsDO;

@Component
public class Mapper {
	
	public Class<UserDetailsBO> getBOType() {
		return UserDetailsBO.class;
	}

	public Class<UserDetailsDO> getCDOType() {
		return UserDetailsDO.class;
	}
	
	public UserDetailsDO createNewDOFromBO(UserDetailsBO bo) {
		UserDetailsDO details = new UserDetailsDO();
		details.setFname(bo.getFname());
		details.setLname(bo.getLname());
		return details;
	}

}
