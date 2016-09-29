package com.tide.acme.model.domain;

/**
 * Created by zhuanghua on 16/9/29.
 */
public class UserAccount {

    private String accoutName;
    private String sortCode;
    private String accoutHolder;


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
