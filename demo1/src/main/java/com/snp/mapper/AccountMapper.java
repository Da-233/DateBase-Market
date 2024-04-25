package com.snp.mapper;

import com.snp.dto.Account;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface AccountMapper {
    @Select("SELECT * FROM account")
    List<Account> findAll();
    @Select("SELECT * FROM account WHERE user_id = #{id}")
    Account findByUserId(int id);
    @Insert("INSERT INTO account VALUES (#{rankId},#{userId},#{acc},#{Key})")
    void insert(Account account);


}
