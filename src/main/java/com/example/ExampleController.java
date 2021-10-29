package com.example;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

public class ExampleController {
    
    @Path("/hello-world")
    public class Resource {
        @GET
        @Produces("text/plain")
        public String hello() {
            return "Hello, World!";
        }
    }
}
