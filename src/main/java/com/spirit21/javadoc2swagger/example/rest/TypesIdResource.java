package com.spirit21.javadoc2swagger.example.rest;

import java.util.Date;

import javax.enterprise.context.RequestScoped;
import javax.transaction.Transactional;
import javax.validation.Valid;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import com.spirit21.javadoc2swagger.example.entity.Type;

import lombok.NonNull;
import lombok.Setter;

/**
 * JAX-RS resource for methods handling with single {@link Type} entities.
 * 
 * @path /type/{id}
 * @pathParam id @type number @format long
 *
 * @author dsimon
 *
 */
@RequestScoped
public class TypesIdResource {

    @Setter
    private Long id;

    /**
     * Returns the type with the specific id
     * 
     * @responseCode 200
     * @responseMessage Type entity found
     * @responseSchema {@link Type}
     * 
     * @responseCode 404
     * @responseMessage Type entity not found
     *
     * @responseCode 500
     * @responseMessage An error occured while request
     * 
     * @return single {@link Type} entity or error
     *
     */
    @GET
    @Produces({ MediaType.APPLICATION_JSON + ";charset=utf-8", MediaType.APPLICATION_ATOM_XML })
    public Response getType() {

        return Response.ok().build();
    }

    /**
     * This method is not allowed.
     *
     * @responseCode 405 @responseMessage Method not allowed
     * 
     * @return HTTP 405 error
     */
    @POST
    public Response createTypeId() {

        return Response.status(Status.METHOD_NOT_ALLOWED).build();
    }

    /**
     * Updates the {@link Type} with the specific <code>id</code>
     * 
     * @responseCode 200 @responseMessage Type entity updated successfully
     * @responseSchema {@link Type} @responseType array
     * 
     * @responseCode 500 @responseMessage An error occured while update
     * 
     * @param type
     *            Type description
     * @param date
     *            useless date parameter to show, how parameters can be ignored
     * @param test
     *            test query parameter
     * @return List of {@link Type} entities or error
     */
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    @Transactional
    public Response updateType(@Valid @NonNull Type type, /* @swagger:ignore */ Date date,
            @QueryParam("test") Long test) {
        return Response.ok().build();
    }

    /**
     * Deletes the type with the specific id
     * 
     * @responseCode 200 @responseMessage Type entity deleted successfully
     * 
     * @responseCode 500 @responseMessage An error occured while delete
     *
     * @return 200 HTTP status or error
     */
    @DELETE
    @Transactional
    public Response deleteType() {

        return Response.ok().build();
    }
}