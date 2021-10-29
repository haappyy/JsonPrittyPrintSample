package com.example;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.ws.rs.Produces;
@Controller("/hello-world")
public class ExampleController {

    private static final Logger LOG = LoggerFactory.getLogger(ExampleController.class);

    @Get
    @Produces("text/plain")
    public String hello() {
        LOG.info("Request to hello");
        return "Hello, World!";
    }

}
