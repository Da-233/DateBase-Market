package com.snp.mapper;

import com.snp.dto.Provider;
import org.apache.ibatis.annotations.*;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

@Mapper
public interface ProviderMapper {

    @Select("""
        SELECT * FROM provider
""")
    List<Provider>findAll();

    @Select("""
        SELECT * FROM provider WHERE id=#{id}
""")
   Provider findById(int id);

    @Select("""
        select * from provider where id like '${x}%'or
                                firm_name like '${x}%'or
                                contact_name like '${x}%'or
                                contact_job like '${x}%'or
                                country like '${x}%'or
                                region like '${x}%'or
                                city like '${x}%'or
                                address like '${x}%'or
                                post_code like '${x}%'or
                                phone_num like '${x}%'or
                                fax_num like '${x}%'or
                                hostpage like '${x}%'
""")
    List<Provider> selectByX(String x);
    @Select("select sum(price) as num from provider,product where provider.id=product.provider_id and provider.id = #{id}")
    BigDecimal selectNum(int id);

    @Select("select provider.firm_name as provider, count(*) as productNum from provider, product where product.type_id = #{typeId} and product.provider_id = provider.id  group by firm_name")
    List<Map<String, Object>> ff(int typeId);
    @Insert("""
        --set IDENTITY_INSERT indent ON
        insert into provider values (
                            #{firmName},
                            #{contactName},
                            #{contactJob},
                            #{country},
                            #{region},
                            #{city},
                            #{address},
                            #{postCode},
                            #{phoneNum},
                            #{faxNum},
                            #{hostpage}

                            )
""")
    void insert(Provider provider);

    @Update("\n" +
            "update provider set\n" +
            "                    firm_name=#{firmName},\n" +
            "                    contact_name=#{contactName},\n" +
            "                    contact_job=#{contactJob},\n" +
            "                    country=#{country},\n" +
            "                    region=#{region},\n" +
            "                    city=#{city},\n" +
            "                    address=#{address},\n" +
            "                    post_code=#{postCode},\n" +
            "                    phone_num=#{phoneNum},\n" +
            "                    fax_num=#{faxNum},\n" +
            "                    hostpage=#{hostpage} where id=#{id}")
    void upDate(Provider provider);
    @Delete("DELETE FROM provider WHERE id=#{id}")
    void delete(int id);
}
