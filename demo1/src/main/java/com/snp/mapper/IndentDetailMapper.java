package com.snp.mapper;

import com.snp.dto.IndentDetail;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import java.util.List;
@Mapper
public interface IndentDetailMapper {

    @Select("""
        SELECT * FROM indent_detail
""")
    List<IndentDetail>findAll();

    @Select("""
        SELECT * FROM Indent_detail where product_id=#{productId} and indent_id=#{indentId}
""")
    IndentDetail findById(IndentDetail indentDetail);

    @Select("""
       select * from indent_detail where indent_id like '${x}%',
                                    product_id like '${x}%',
                                    num like '${x}%',
)
""")
    List<IndentDetail> selectByX(String x);

    @Select("SELECT * FROM indent_detail WHERE indent_id = #{id}")
    List<IndentDetail> findByIndentId(int id);

    @Insert("""
        --set IDENTITY_INSERT indent ON
        insert into indent_detail values(
                                 #{indentId},
                                #{productId},
                                #{num}
        )
""")
    void insert(IndentDetail indentDetail);

    @Delete("delete from indent_detail where product_id=#{productId} and indent_id=#{indentId}")
    void delete(IndentDetail indentDetail);
}
