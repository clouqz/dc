package com.cloud.dc.api;

import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/user")
public interface User extends Rest {
	
	@PUT
	@Path("/resetpwd/{data}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response resetPwd(@PathParam("data") String data);
	
	@GET
	@Path("/login/{credentials}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response login(@PathParam("credentials") String credentials);
}
