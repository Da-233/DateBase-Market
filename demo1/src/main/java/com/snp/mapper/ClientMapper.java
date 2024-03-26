package com.snp.mapper;

import com.snp.dto.Client;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper     //mybatis表示用于增删改查的标签
public interface ClientMapper {
    /**
     * 查询全表
     * @return List的Client的类
     */
    @Select("""
            select id,
                   firm_id,
                   contact_name,
                   contact_job,
                   address,
                   city,
                   region,
                   postal_coda,
                   country,
                   phone_num,
                   email,
                   reg_date
            from Client
            """)
    List<Client> findAll();

    /**
     * 根据id查询Client表中数据
     * @param id 主键
     * @return Client类
     */
    @Select("""
        select id,
               firm_id,
               contact_name,
               contact_job,
               address,
               city,
               region,
               postal_coda,
               country,
               phone_num,
               email,
               reg_date
        from Client where id = #{id}
    """)
    Client findById(String id);
}
