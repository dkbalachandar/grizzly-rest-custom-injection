package com.resource;

import com.CustomerService;
import com.fasterxml.jackson.jr.ob.JSON;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.io.IOException;

@Path("/customer")
public class CustomerResource {

    @Inject
    private CustomerService customerService;

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getCustomerById(@PathParam("id") String id) throws WebApplicationException {
        try {
            return Response.ok().entity(JSON.std.asString(customerService.getCustomerById(id))).build();
        } catch (IOException e) {
            throw new WebApplicationException(e.getMessage());
        }
    }
}
