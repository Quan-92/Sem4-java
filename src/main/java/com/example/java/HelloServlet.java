package com.example.java;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/hello-world")
public class HelloServlet {
    @GET
    @Produces("text/plain")
    public String hello() {
        return "Hello, World!";
    }
}