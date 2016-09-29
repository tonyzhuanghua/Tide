package com.tide.acme.service;

import com.tide.acme.model.dto.AccountTransactionDto;
import com.tide.acme.model.dto.UserAccountDto;

public interface IAccountService {


    public UserAccountDto getUserAccount(String accountId) throws RuntimeException;

    public void addTransaction(AccountTransactionDto accountTransactionDto);

}
