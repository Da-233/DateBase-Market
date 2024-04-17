package com.snp;

import com.snp.dto.Client;
import com.snp.dto.Provider;
import com.snp.mapper.ClientMapper;
import com.snp.mapper.ProviderMapper;
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
    @Test
    public void test1(){
        List<Provider> providerList = providerMapper.findAll();
        for(Provider provider:providerList){
            System.out.println(provider);
        }
    }
}
