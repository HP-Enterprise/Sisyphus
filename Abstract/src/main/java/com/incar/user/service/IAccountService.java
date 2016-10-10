package com.incar.user.service;

import com.incar.user.vo.AccountShow;

/**
 * Created by Incar on 2016/10/10.
 */
public interface IAccountService {

    /**
     * 通过ID查询账户信息
     * @param id 账户ID
     * @return 账户信息
     */
    AccountShow findById(int id);
}
