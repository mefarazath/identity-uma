/*
 * Copyright (c) 2016, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.wso2.carbon.identity.uma.endpoint.protection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.jws.WebService;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * OAuth2 Resource Set Registration Endpoint implemented compliant to
 * <a>https://docs.kantarainitiative.org/uma/rec-oauth-resource-reg-v1_0_1.html</a>
 */
@WebService
@Path("/resource_set")
@Produces(MediaType.APPLICATION_JSON)
public class ResourceSetRegistrationEndpoint {

    private static Log log = LogFactory.getLog(ResourceSetRegistrationEndpoint.class);

    @POST
    @Path("/")
    @Consumes("application/json")
    public Response createResourceSet(@Context HttpHeaders httpHeaders) {

        log.info("Hit Create Resource Set");

        // build Servlet Response from UMAResponse
        return Response.ok("Successful Resource Set Creation!!!!").build();
    }


    @GET
    @Path("/{_id}")
    public Response getResourceSet(@Context HttpHeaders httpServletRequest, @PathParam("_id") String resourceSetId) {

        log.info("Hit Get Resource Set");

        // build Servlet Response from UMAResponse
        return Response.ok("Successful Resource Set Creation!!!!").build();
    }

    @PUT
    @Path("/{_id}")
    @Consumes("application/json")
    public Response updateResourceSet(@Context HttpHeaders httpHeaders, @PathParam("_id") String resourceSetId) {


        log.info("Hit Update Resource Set");

        // build Servlet Response from UMAResponse
        return Response.ok("Successful Resource Set Creation!!!!").build();
    }


    @DELETE
    @Path("/{_id}")
    public Response deleteResourceSet(@Context HttpHeaders httpHeaders, @PathParam("_id") String resourceSetId) {

        log.info("Hit Delete Resource Set");

        // build Servlet Response from UMAResponse
        return Response.ok("Successful Resource Set Creation!!!!").build();
    }


    @GET
    @Path("/")
    public Response listResourceSets(@Context HttpHeaders httpHeaders) {

        log.info("Hit List Resource Sets");

        // build Servlet Response from UMAResponse
        return Response.ok("Successful Resource Set Creation!!!!").build();
    }


}
