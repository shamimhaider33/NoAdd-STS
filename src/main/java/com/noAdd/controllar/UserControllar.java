package com.noAdd.controllar;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.noAdd.base.bo.ServiceRequest;
import com.noAdd.base.bo.ServiceResponse;
import com.noAdd.bo.UserDetailsBO;
import com.noAdd.cdo.UserDetailsDO;
import com.noAdd.repo.UserDetailsRepository;
import com.noAdd.service.UserService;

/**
 * @author Shamim Ahmad
 *
 */

@RestController
@RequestMapping("/")
public class UserControllar extends BaseController {
	//Logger _Log = LoggerFactory.getLogger(UserControllar.class);
	
	@Autowired UserDetailsRepository UserDetailsRepository;
	@Autowired UserService uServ;
	
	//"Langing Page" will find a better way to implement it later.
	@RequestMapping
	public String home(ModelMap map) {
	        return "loginPage.jsp";
	}	
	
	
	@RequestMapping(method = RequestMethod.GET, value = "/name ")
	public String getUser() {
		List<UserDetailsDO> users = UserDetailsRepository.findAll();
		return users.get(0).getFname() + " "+ users.get(0).getLname();
	}

	@RequestMapping(method = RequestMethod.POST, value="/createNewUser")
	public ResponseEntity<UserDetailsBO> createNewUser(	@RequestBody @Valid UserDetailsBO userDetailsBO,
														BindingResult result,
														@ModelAttribute("serviceRequest") ServiceRequest sreq){
		sreq.addRequestData(userDetailsBO);
		ServiceResponse response = uServ.add(sreq);
		//UserDetailsBO ubo = getResultBO(response, UserDetailsBO.class);
		//HttpHeaders headers = new HttpHeaders();
		
		return null;
	}
	
}