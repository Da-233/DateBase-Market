package com.snp;

import com.snp.dto.Client;
import com.snp.dto.Provider;
import com.snp.dto.Type;
import com.snp.mapper.ClientMapper;
import com.snp.mapper.ProviderMapper;
import com.snp.mapper.TypeMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class MapperTest {

    @Autowired
    ClientMapper clientMapper;
    @Autowired
    ProviderMapper providerMapper;
    @Autowired
    TypeMapper typeMapper;
    @Test
    public void test1(){
        List<Type> typeList = typeMapper.findAll();
        for(Type type:typeList){
            System.out.println(type);
        }
    }
}
