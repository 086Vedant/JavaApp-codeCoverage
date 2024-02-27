package org.acme;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.QueryParam;

@Path("/calculator")
public class Calculator {

    @GET
    @Path("/add")
    public int add(@QueryParam("a") int a, @QueryParam("b") int b) {
        return a + b;
    }

    @GET
    @Path("/subtract")
    public int subtract(@QueryParam("a") int a, @QueryParam("b") int b) {
        return a - b;
    }

    @GET
    @Path("/multiply")
    public int multiply(@QueryParam("a") int a, @QueryParam("b") int b) {
        return a * b;
    }

    @GET
    @Path("/divide")
    public int divide(@QueryParam("a") int a, @QueryParam("b") int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Cannot divide by zero");
        }
        return a / b;
    }
}
