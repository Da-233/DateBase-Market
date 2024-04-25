package com.snp.mapper;

import com.snp.dto.Client;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

@Mapper     //mybatis表示用于增删改查的标签
public interface ClientMapper {
    /**
     * 查询全表
     *
     * @return List的Client的类
     */
    @Select("""
            select name,
                   id,
                   firm_name,
                   contact_name,
                   contact_job,
                   address,
                   city,
                   region,
                   post_code,
                   country,
                   phone_num,
                   email,
                   register_date
            from Client order by register_date desc
            """)
    List<Client> findAll();

    /**
     * 根据id查询Client表中数据
     *
     * @param name 主键
     * @return Client类
     */
    @Select("""
                select name,
                       id,
                       firm_name,
                       contact_name,
                       contact_job,
                       address,
                       city,
                       region,
                       post_code,
                       country,
                       phone_num,
                       email,
                       register_date
                from Client where name = #{name} 
            """)
    Client findByName(String name);

    @Select("SELECT * FROM Client WHERE id = #{id}")
    Client findById(int id);

    @Insert("""
            insert into
            client(name,
                   firm_name,
                   contact_name,
                   contact_job,
                   phone_num,
                   country,
                   region,
                   city,
                   address,
                   post_code,
                   email,
                   register_date)
            values (#{name},
                    #{firmName},
                    #{contactName},
                    #{contactJob},
                    #{phoneNum},
                    #{country},
                    #{region},
                    #{city},
                    #{address},
                    #{postCode},
                    #{email},
                    #{registerDate})
            """)
    void InsertClient(Client client);
    @Select("""
        select name from client where name like '${x}%' or
                                                firm_name like '${x}%' or
                                                contact_name like '${x}%' or
                                                contact_job like '${x}%' or
                                                phone_num like '${x}%' or
                                                country like '${x}%' or
                                                region like '${x}%' or
                                                city like '${x}%' or
                                                address like '${x}%' or
                                                post_code like '${x}%' or
                                                email like '${x}%' or
                                                register_date like '${x}%'
                                                 order by register_date desc
        
    """)
    List<String> selectByX(String x);
    @Delete("""
        delete from client where name=#{name};
    """)
    void delete(String name);

    @Select("select client.region as region, count(*) as orderNum from indent, client where client_id=client.name group by client.region")
    List<Map<String, Object>> selectNum();

    @Select("select own_region as 地区, count(*) as 运货量, count(case when month(order_date) between 3 and 5 then 1 end) as 春天,\n" +
            "        count(case when month(order_date) between 6 and 8 then 1 end) as 夏天,\n" +
            "        count(case when month(order_date) between 9 and 11 then 1 end) as 秋天,\n" +
            "        count(case when month(order_date) in (12, 1, 2) then 1 end) as 冬天\n" +
            "    from indent group by own_region")
    List<Map<String, Object>> selectNumSeason();
}
