package com.snp.mapper;

import com.snp.dto.Indent;
import com.snp.dto.IndentDetail;
import org.apache.ibatis.annotations.*;

import java.util.List;
@Mapper
public interface IndentMapper {

    @Select("""
        SELECT * FROM indent order by order_date desc   
""")
    List<Indent>findAll();

    @Select("""
        SELECT * FROM indent WHERE id = #{id}
""")
    Indent findById(int id);

    @Select("""
        select id from indent where id like #{x} or
                                    client_id like #{x} or
                                    employ_id like #{x} or
                                    order_date like #{x} or
                                    start_time like #{x} or
                                    arriv_time like #{x} or
                                    check_time like #{x} or
                                    ship_fee like #{x} or
                                    own_name like #{x} or
                                    own_add like #{x} or
                                    own_city like #{x} or
                                    own_region like #{x} or
                                    own_post like #{x} or
                                    own_country like #{x} or
                                    last_state_time like #{x} or
                                    last_state like #{x} or
                                    remark like #{x} order by order_date desc
""")
    List<Indent> selectByX(String x);
    @Select("SELECT SCOPE_IDENTITY() FROM indent AS LastInsertedID")
    int findLastId();

    @Select("SELECT * FROM indent WHERE client_id = #{name} order by order_date desc")
    List<Indent> selectByClientName(String name);
    @Insert("""
        --set IDENTITY_INSERT indent ON
        insert into indent values (
                                #{clientId},
                                #{employId},
                                #{orderDate},
                                #{startTime},
                                #{arrivTime},
                                #{checkTime},
                                #{shipFee},
                                #{ownName},
                                #{ownAdd},
                                #{ownCity},
                                #{ownRegion},
                                #{ownPost},
                                #{ownCountry},
                                #{lastStateTime},
                                #{lastState},
                                #{remark}
                                  )
""")
    void insert(Indent indent);

    @Select("SELECT MAX(id) FROM indent")
    int selectLastId();
    @Delete("DELETE FROM indent WHERE id=#{id}")
    void delete(int id);

    @Update("update indent set start_time = getdate(), last_state_time = getdate(), last_state = N'已发货' where id=#{x}")
    void updateStart(int id);
    @Update("update indent set arriv_time = getdate(), last_state_time = getdate(), last_state = N'已到货' where id=#{x}")
    void updateArriv(int id);
    @Update("update indent set check_time = getdate(), last_state_time = getdate(), last_state = N'已签收' where id=#{x}")
    void updateCheck(int id);
}
