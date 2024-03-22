package com.snp.mapper;

import com.snp.dto.Client;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper     //mybatis表示用于增删改查的标签
public interface ClientMapper {

    @Select("""
            select id, firm_id, contact_name, contact_job, address, city, region, postal_coda, country, phone_num, email, reg_date 
            from Client
            """)
    List<Client> findAll();
}
