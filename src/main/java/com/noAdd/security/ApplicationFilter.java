package com.noAdd.security;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.oauth2.provider.OAuth2Authentication;
import org.springframework.web.filter.OncePerRequestFilter;

import com.noAdd.base.bo.ServiceRequest;
import com.noAdd.bo.UserDetailsBO;
import com.noAdd.service.UserAuthService;

public class ApplicationFilter extends OncePerRequestFilter {
	private static Logger _Log = LoggerFactory.getLogger(ApplicationFilter.class);
	public static final String ORG_HEADER = "NO-ADD-INC";
	public static final String USER_IDENTITY = "_USER";
	public static final String SERVICE_REQUEST = "_SREQ";
		
	@Autowired UserAuthService userAuthService;
	protected void doFilterInternal(HttpServletRequest request,	HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
		addUserIdentity(request);
		filterChain.doFilter(request, response);
	}

	private boolean addUserIdentity(HttpServletRequest httpRequest){
		boolean result = false;
		if(httpRequest.getUserPrincipal() == null){
			_Log.warn("User identity not found {}");
			return false;
		}
		
		OAuth2Authentication auth = (OAuth2Authentication) httpRequest.getUserPrincipal();
		UserDetailsBO userBO= (UserDetailsBO) auth.getUserAuthentication().getDetails();
		String orgId = httpRequest.getHeader(ORG_HEADER);
	//	_Log.debug("User identity found : {}", userBO.getEmail());
		
		if(userBO != null){
	//		userBO . setCurrentOrgId(orgId);
			ServiceRequest request = new ServiceRequest();
			userAuthService.addCurrentOrgGroups(request);
			httpRequest.setAttribute(USER_IDENTITY, userBO);
		}
		return result;
	}
	
	
}
