package com.incar.user.repository;

import com.incar.user.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Incar on 2016/10/10.
 */
public interface AccountRepository extends JpaRepository<Account, Integer> {
}
