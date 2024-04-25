package com.snp.service;

import com.snp.dto.Account;

import java.util.List;

public interface AccountService {
    List<Account> findAll();
    Account findByUserId(int id);

    void insert(Account account);
}
