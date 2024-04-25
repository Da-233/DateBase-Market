package com.snp.controller;

import com.alibaba.fastjson.JSONObject;
import com.snp.common.Result;
import com.snp.dto.Account;
import com.snp.dto.Client;
import com.snp.dto.Provider;
import com.snp.service.AccountService;
import com.snp.service.ClientService;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/account")
public class AccountController {
    @Resource
    AccountService accountService;
    @Resource
    ClientService clientService;
    @PostMapping("login")
    public Result login(@RequestBody String str){
        System.out.println(str);
        Account account = JSONObject.parseObject(str, Account.class);
        System.out.println(account.getUserId() + account.getKey());
        Account account1 = accountService.findByUserId(account.getUserId());
        if(account1==null){
            return new Result("1", "该用户不存在", "");
        }
        else if(!account1.getKey().equals(account.getKey())){
            return new Result("1", "输入密码错误", "");
        }
        else{
            System.out.println("登陆成功");
            System.out.println(account1);
            return new Result("0", "true", account1);
        }
    }
    @GetMapping("/findall")
    public  Result findAll(){
        List<Account> accounts = accountService.findAll();
        return new Result("0", "true", accounts);
    }
    @PostMapping("/register")
    public Result Register(@RequestBody String str){
        System.out.println(str);
        Account account = JSONObject.parseObject(str, Account.class);
        Account account1 = accountService.findByUserId(account.getUserId());
        if(account1 != null){
            return new Result("1", "该用户已存在", "");
        }
        else{
            account.setRankId(1);
            String s = clientService.insert(new Client());
            account.setAcc(s);
            accountService.insert(account);
            return new Result("0", "true", account);
        }
    }

}
