package com.tide.acme.rest;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import com.tide.acme.model.dto.AccountTransactionDto;
import org.springframework.beans.factory.annotation.Autowired;



@Path("demo")
public class AccountResource {

    @Autowired
    com.tide.acme.service.IAccountService accountService;


    @GET
    @Path("account/{accountId}")
    @Produces("text/plain")
    public String getUser(@PathParam(value = "accountId") String accountId) throws RuntimeException {
        return "";
    }


    @POST
    @Path("addTransaction")
    @Produces("text/plain")

    public void addTransaction(AccountTransactionDto accountTransactionDto) {
        accountService.addTransaction(accountTransactionDto);

    }
}
