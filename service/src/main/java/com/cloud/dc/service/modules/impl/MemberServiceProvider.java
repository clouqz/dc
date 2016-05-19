package com.cloud.dc.service.modules.impl;

import com.cloud.dc.service.ServiceProvider;
import com.cloud.dc.service.modules.UserService;

public class MemberServiceProvider implements ServiceProvider<UserService> {
	
	private UserServiceImpl service = new UserServiceImpl();
	
	@Override
	public UserService getService() {
		return this.service;
	}

}
