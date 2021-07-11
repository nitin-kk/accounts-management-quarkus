package org.acme.getting.started.knative;

import org.jboss.resteasy.annotations.jaxrs.QueryParam;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Set;


@Path("/v1/accountsmanagement")
public class GreetingResource {

 //   @Inject
  //  GreetingService service;
    private Set<Account> accounts = Collections.newSetFromMap(Collections.synchronizedMap(new LinkedHashMap<>()));
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/accounts")
    public Set<Account> accounts(@QueryParam String customername) {
        this.accounts.add(new Account(customername,"12345","01-45-89","Savings","GBP 2000"));
        return this.accounts;
    }

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Path("/healthz")
    public String hello() {
        return "Healthy";
    }
}