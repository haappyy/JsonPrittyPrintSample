package com.example;

import io.micronaut.http.HttpRequest;
import io.micronaut.http.client.HttpClient;
import io.micronaut.http.client.annotation.Client;
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import jakarta.inject.Inject;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
@MicronautTest
public class ExampleControllerTest {


        @Inject
        @Client("/")
        HttpClient httpClient;

        @Test
        void testHello() {
               String response = httpClient.toBlocking().retrieve(HttpRequest.GET("/hello-world"));
                assertEquals(
                    "Hello, World!",
                        response);
        }

}
