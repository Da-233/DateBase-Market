package com.snp.mapper;

import com.snp.dto.Type;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface TypeMapper {
    @Select("""
            select id,
            name,
            explain,
            graph
            from type
            """)
    List<Type> findAll();
}
