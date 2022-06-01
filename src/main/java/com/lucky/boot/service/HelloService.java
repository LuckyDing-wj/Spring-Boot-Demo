package com.lucky.boot.service;

import org.jvnet.hk2.annotations.Service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

/**
 * @date 2022/5/29 16:09
 * @author: wj
 */
@Path("/service")
@Service
public class HelloService {

    @GET
    @Path("/cob")
    @Produces("text/plain")
    public String hello(@QueryParam("system")String system){
        if (system == null || "".equalsIgnoreCase(system)){
            system = "empty";
        }
        return "have system: " + system;
    }

}
