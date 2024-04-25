package com.snp.mapper;

import com.snp.dto.Product;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
@Mapper
public interface ProductMapper {

    @Select("""
        SELECT * FROM product
""")
    List<Product>findAll();

    @Select("""
        SELECT * FROM product WHERE id=#{id}
""")
    Product findById(int id);

    @Select("""
        select * from product where id like '${x}%'or
                                name like '${x}%'or
                                unit_num like '${x}%'or
                                provider_id like '${x}%'or
                                type_id like '${x}%'or
                                price like '${x}%'or
                                stock_num like '${x}%'or
                                order_num like '${x}%'or
                                purchase_num like '${x}%'or
                                state like '${x}%'or
                                remark like '${x}%'
""")
    List<Product> selectByX(String x);
    @Select("SELECT * FROM product WHERE type_id = #{id}")
    List<Product> findByTypeId(int id);
    @Insert("""
        --set IDENTITY_INSERT indent ON
       insert into product values (
                            #{name},
                            #{unitNum},
                            #{providerId},
                            #{typeId},
                            #{price},
                            #{stockNum},
                            #{orderNum},
                            #{purchaseNum},
                            #{state},
                            #{remark}
                           )
""")
    void insert(Product product);

    @Delete("delete from product where id=#{id};")
    void delete(int id);
}
