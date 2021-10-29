package com.example;

import io.micronaut.http.annotation.Controller;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
@Controller("/hello-world")
public class ExampleController {

    @GET
    @Produces("text/plain")
    public String hello() {
        return "Hello, World!";
    }

}
