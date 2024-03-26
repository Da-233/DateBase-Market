package com.snp;

import com.snp.dto.Client;
import com.snp.mapper.ClientMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class MapperTest {

    @Autowired
    ClientMapper clientMapper;
    @Test
    public void test1(){
        Client client = clientMapper.findById("ANATR");
        System.out.println(client);
        List<Client> clients = clientMapper.findAll();
        for (Client cli : clients) {
            System.out.println(cli);
        }
    }
}
