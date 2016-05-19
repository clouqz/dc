package com.cloud.dc.api.impl;

import javax.ws.rs.core.Response;

import com.cloud.dc.api.NormalUser;
import com.cloud.dc.common.log.Logs;

public class NormalUserImpl implements NormalUser {
	
	private static final Logs log = Logs.Builder.getLog(NormalUser.class);

	@Override
	public Response resetPwd(String data) {
		log.info("resetPwd : " + data);
		return null;
	}

	@Override
	public Response login(String credentials) {
		log.info("login : " + credentials);
		return null;
	}

	@Override
	public Response registerParticipates(String users) {
		log.info("registerParticipates : " + users);
		return null;
	}

}
