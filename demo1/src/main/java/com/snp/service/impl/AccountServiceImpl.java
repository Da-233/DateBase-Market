package com.snp.service.impl;

import com.snp.dto.Account;
import com.snp.mapper.AccountMapper;
import com.snp.service.AccountService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountServiceImpl implements AccountService {
    @Resource
    AccountMapper accountMapper;

    @Override
    public List<Account> findAll() {
        return accountMapper.findAll();
    }

    public Account findByUserId(int id){
        return accountMapper.findByUserId(id);
    }

    public void insert(Account account){
        accountMapper.insert(account);
    }
}
