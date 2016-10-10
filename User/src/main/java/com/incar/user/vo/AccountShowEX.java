package com.incar.user.vo;

import com.incar.user.entity.Account;

/**
 * Created by Incar on 2016/10/10.
 */
public class AccountShowEx extends AccountShow {

    public AccountShowEx(Account account) {
        this.setId(account.getId());
        this.setPhone(account.getPhone());
        this.setPassword(account.getPassword());
        this.setSalt(account.getSalt());
        this.setRegisterTime(account.getRegisterTime());
        this.setCreateDate(account.getCreateDate());
        this.setCreateUser(account.getCreateUser());
        this.setModifyDate(account.getModifyDate());
        this.setModifyUser(account.getModifyUser());
        this.setIsEnable(account.getIsEnable());
    }
}
