package com.cloud.dc.api;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/user/normal")
public interface NormalUser extends User {
	
	@POST
	@Path("/register/{users}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response registerParticipates(@PathParam("users") String users);
}
