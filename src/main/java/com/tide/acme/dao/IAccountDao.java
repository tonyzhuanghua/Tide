package com.tide.acme.dao;

import com.tide.acme.model.domain.UserAccount;

/**
 * Created by zhuanghua on 16/9/29.
 */
public interface IAccountDao {
    String addTransaction(com.tide.acme.model.domain.AccountTransaction accountTransaction);

    UserAccount getUserAccount(String accountId);

}
