package com.example;

import io.micronaut.http.annotation.Controller;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
@Controller("/hello-world")
public class ExampleController {

    private static final Logger LOG = LoggerFactory.getLogger(ExampleController.class);

    @GET
    @Produces("text/plain")
    public String hello() {
        LOG.info("Request to hello");
        return "Hello, World!";
    }

}
