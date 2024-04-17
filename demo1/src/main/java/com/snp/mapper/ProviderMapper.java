package com.snp.mapper;

import com.snp.dto.Provider;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface ProviderMapper {
    @Select("""
            select id,
            firm_name,
            contact_name,
            contact_job,
            address,
            city,
            region,
            post_code,
            country,
            phone_num,
            fax_num,
            hostpage
            from Provider
            """)
    List<Provider> findAll();
}
