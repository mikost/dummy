package com.example.dummy;

import org.springframework.stereotype.Controller;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

@Path("/helloworld")
@Controller
public class RestEndpoint {
    @GET
    @Produces("text/plain")
    public String getClichedMessage() throws IOException {
        final Process hostnameProcess = Runtime.getRuntime().exec("hostname");
        final InputStream inputStream = hostnameProcess.getInputStream();
        final InputStreamReader isr = new InputStreamReader(inputStream);
        final String hostname = new BufferedReader(isr).readLine();
        return "Hello World, from " + hostname + "!";
    }
}
