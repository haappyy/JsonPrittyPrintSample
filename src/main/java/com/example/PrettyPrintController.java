package com.example;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import io.micronaut.http.annotation.Body;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Post;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.ws.rs.POST;
import javax.ws.rs.Produces;

@Controller("/pretty")
public class PrettyPrintController {

    private static final Logger LOG = LoggerFactory.getLogger(ExampleController.class);
    Gson gson = new GsonBuilder().setPrettyPrinting().create();
    @Post
    @Produces("text/plain")
    public String pretty(@Body String json) {
        LOG.info("Request to pretty print with body '{}'",json);
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        JsonElement je = JsonParser.parseString(json);
        String prettyJson = gson.toJson(je);
        return prettyJson;
    }
}
