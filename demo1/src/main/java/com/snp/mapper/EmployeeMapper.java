package com.snp.mapper;

import com.snp.dto.Employee;
import org.apache.ibatis.annotations.*;

import java.util.List;
import java.util.Map;

@Mapper
public interface EmployeeMapper {

    @Select("""
        SELECT * FROM employee
""")
    List<Employee>findAll();

    @Select("""
        SELECT * FROM employee WHERE id=#{id}
""")
   Employee findById(int id);

    @Update("update employee set\n" +
            "                    surname=#{surname},\n" +
            "                    name=#{name},\n" +
            "                    job=#{job},\n" +
            "                    hon_name=#{honName},\n" +
            "                    birth_date=#{birthDate},\n" +
            "                    work_date=#{workDate},\n" +
            "                    phone_num=#{phoneNum},\n" +
            "                    inner_phone=#{innerPhone},\n" +
            "                    country=#{country},\n" +
            "                    region=#{region},\n" +
            "                    city=#{city},\n" +
            "                    address=#{address},\n" +
            "                    post_code=#{postCode},\n" +
            "                    graph=#{graph},\n" +
            "                    email=#{email},\n" +
            "                    remark=#{remark}\n" +
            "                     where id=#{id}")
    void upDate(Employee employee);

    @Select("SELECT employ_id, COUNT(id) AS num FROM indent GROUP BY employ_id")
    List<Map<String, Integer>> selectIndentNum();
    @Select("""
        select * from employee where id like '${x}%' or
                                surname like '${x}%' or
                                name like '${x}%' or
                                job like '${x}%' or
                                hon_name like '${x}%' or
                                birth_date like '${x}%' or
                                work_date like '${x}%' or
                                phone_num like '${x}%' or
                                inner_phone like '${x}%' or
                                country like '${x}%' or
                                region like '${x}%' or
                                city like '${x}%' or
                                address like '${x}%' or
                                post_code like '${x}%' or
                                graph like '${x}%' or
                                email like '${x}%' or
                                remark like '${x}%' or
                                leader like '${x}%'
""")
    List<Employee> findByX(String x);
    @Insert("""
        --set IDENTITY_INSERT indent ON
        insert into employee(surname,
                     name,
                     job,
                     hon_name,
                     birth_date,
                     work_date,
                     phone_num,
                     inner_phone,
                     country,
                     region,
                     city,
                     address,
                     post_code,
                     graph,
                     email,
                     remark,
                     leader)
values (#{surname},
        #{name},
        #{job},
        #{honName},
        #{birthDate},
        #{workDate},
        #{phoneNum},
        #{innerPhone},
        #{country},
        #{region},
        #{city},
        #{address},
        #{postCode},
        #{graph},
        #{email},
        #{remark},
        #{leader})
""")
    void insert(Employee employee);

    @Delete("DELETE FROM employee WHERE id=#{id}")
    void delete(int id);
}
