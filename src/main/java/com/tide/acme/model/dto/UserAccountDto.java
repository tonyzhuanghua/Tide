package com.tide.acme.model.dto;

import java.util.List;

/**
 * Created by zhuanghua on 16/9/29.
 */
public class UserAccountDto {
    private String accoutName;
    private String sortCode;
    private String accoutHolder;
    private List<AccountTransactionDto> accountTransactionDtos;

    public List<AccountTransactionDto> getAccountTransactionDtos() {
        return accountTransactionDtos;
    }

    public void setAccountTransactionDtos(List<AccountTransactionDto> accountTransactionDtos) {
        this.accountTransactionDtos = accountTransactionDtos;
    }

    public String getAccoutName() {
        return accoutName;
    }

    public void setAccoutName(String accoutName) {
        this.accoutName = accoutName;
    }

    public String getSortCode() {
        return sortCode;
    }

    public void setSortCode(String sortCode) {
        this.sortCode = sortCode;
    }

    public String getAccoutHolder() {
        return accoutHolder;
    }

    public void setAccoutHolder(String accoutHolder) {
        this.accoutHolder = accoutHolder;
    }
}
