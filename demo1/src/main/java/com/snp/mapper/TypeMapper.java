package com.snp.mapper;

import com.snp.dto.Type;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
@Mapper
public interface TypeMapper {

    @Select("""
        SELECT * FROM type
""")
    List<Type>findAll();

    @Select("""
        SELECT * FROM type WHERE id=#{id}
""")
   Type findById(int id);

    @Select("""
        select * from type where id like '${x}%'or 
                            name like '${x}%'or
                            explain like '${x}%'or
                            graph like '${x}%'
""")
    List<Type> selectByX(String x);


    @Insert("""
        --set IDENTITY_INSERT indent ON
        insert into type values (
                        #{name},
                        #{explain},
                        )
""")
    void insert(Type type);

    @Delete("delete from type where id=#{id};")
    void delete(int id);
}
