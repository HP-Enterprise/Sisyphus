package com.incar.user.service;

import com.incar.user.entity.Account;
import com.incar.user.repository.AccountRepository;
import com.incar.user.vo.AccountShow;
import com.incar.user.vo.AccountShowEx;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Incar on 2016/10/10.
 */
@Service
public class AccountService implements IAccountService {

    @Autowired
    AccountRepository accountRepository;

    /**
     * 通过ID查询账户信息
     * @param id 账户ID
     * @return 账户信息
     */
    @Override
    public AccountShow findById(int id) {
        Account account = accountRepository.findOne(id);
        if(account == null)
        {
            return null;
        }
        AccountShowEx returnAccount = new AccountShowEx(account);
        return returnAccount;
    }
}
