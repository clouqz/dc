package com.cloud.dc.api.impl;

import javax.ws.rs.core.Response;

import com.cloud.dc.api.Admin;
import com.cloud.dc.common.log.Logs;

public class AdminImpl implements Admin {
	
	private static final Logs log = Logs.Builder.getLog(Admin.class);
	
	@Override
	public Response resetPwd(String data) {
		log.info("resetPwd : " + data);
		String s = "{aaa:aaa}";
		return Response.ok(s).build();
	}

	@Override
	public Response login(String credentials) {
		log.info("login : " + credentials);
		return null;
	}

	@Override
	public Response newPwd(String mobile) {
		log.info("newPwd : " + mobile);
		String s = "{aaa:"+mobile+"}";
		return Response.ok(s).build();
	}

	@Override
	public Response mailToMe(String emailaddress) {
		// TODO Auto-generated method stub
		return null;
	}

}
