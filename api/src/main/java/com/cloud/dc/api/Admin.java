package com.cloud.dc.api;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/user/admin")
public interface Admin extends User {
	
	@GET
	@Path("/newpwd/{mobile}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response newPwd(@PathParam("mobile") String mobile);
	
	@GET
	@Path("/mailtome/{emailaddress}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response mailToMe(@PathParam("emailaddress") String emailaddress);
	
}
