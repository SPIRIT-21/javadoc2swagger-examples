package com.spirit21.javadoc2swagger.example.rest;

import javax.enterprise.context.RequestScoped;
import javax.transaction.Transactional;
import javax.validation.Valid;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import com.spirit21.javadoc2swagger.example.entity.Type;

import lombok.NonNull;

/**
 * JAX-RS resource for methods handling with a list of {@link Type} entities.
 * 
 * @path /types
 *
 * @author dsimon
 *
 */
@Path("/types")
@RequestScoped
public class TypesResource {
    /**
     * @responseCode 200
     * @responseSchema {@link Type} @responseType array
     * @responseMessage Type entities found
     * 
     * @responseCode 500
     * @responseMessage An error occured while request
     * 
     * @param name
     *            name of type or null
     * @param createdAt
     *            creation date range or <code>null</code>
     * @return {@link Type} entity or error
     */
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getTypes(@QueryParam("name") String name, @QueryParam("createdAt") String createdAt) {

        return Response.ok().build();
    }

    /**
     * Creates a new type
     * 
     * @responseCode 201
     * @responseMessage Type entity created successfully
     * @responseSchema {@link Type}
     * 
     * @responseCode 400
     * @responseMessage An error occurred while validation
     * 
     * @param type
     *            Type entity
     * @return {@link Type} entity or error
     */
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    @Transactional
    public Response createType(@Valid @NonNull Type type) {

        return Response.status(Status.CREATED).build();
    }

    /**
     * This method is not allowed. When requesting the HTTP status 405 will
     * return
     *
     * @responseCode 405 @responseMessage Method not allowed
     * 
     * @return HTTP 405 error
     */
    @PUT
    public Response updateTypes() {

        return Response.status(Status.METHOD_NOT_ALLOWED).build();
    }

    /**
     * This method is not allowed. When requesting the HTTP status 405 will
     * return
     *
     * @responseCode 405 @responseMessage Method not allowed
     * 
     * @return HTTP 405 error
     */
    @DELETE
    public Response deleteTypes() {

        return Response.status(Status.METHOD_NOT_ALLOWED).build();
    }
}