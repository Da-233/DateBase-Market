package com.snp.mapper;

import com.snp.dto.Product;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface ProductMapper {
    @Select("""
            SELECT *
            FROM product
            """)
    List<Product> findAll();
}
