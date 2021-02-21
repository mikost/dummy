package com.example.dummy;

import org.springframework.stereotype.Controller;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/helloworld")
@Controller
public class RestEndpoint {
    @GET
    @Produces("text/plain")
    public String getClichedMessage() {
        return "Hello World";
    }
}
