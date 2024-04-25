package com.snp.service.impl;

import com.snp.dto.Client;
import com.snp.mapper.ClientMapper;
import com.snp.service.ClientService;
import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Random;

@Service
public class ClientServiceImpl implements ClientService {
    @Resource
    private ClientMapper clientMapper;

    @Override
    public Client findById(int id){
        return clientMapper.findById(id);
    }
    public List<Client> findAll(){
        return clientMapper.findAll();
    }

    public String insert(Client client){
        if(client.getName()==null){//随机生成逻辑
            LocalDateTime dateTime = LocalDateTime.now();
            Random numList = new Random(dateTime.toInstant(ZoneOffset.UTC).toEpochMilli());//创造随机数条件
            String s;
            do {//随机一个不重复的值
                s = Client.intToString(numList.nextInt(11881375));
            } while (clientMapper.selectByX(s) == null);
            client.setName(s);
            client.setRegisterDate(dateTime);//顺便加上创建时间
        }
        clientMapper.InsertClient(client);
        return client.getName();
    }
    public List<Client> findByX(String x){
        List<String> stringList = clientMapper.selectByX(x);
        ArrayList<Client> clientArrayList = new ArrayList<>();
        for(String s:stringList){
            clientArrayList.add(clientMapper.findByName(s));
        }
        return clientArrayList;
    }

    public void delete(String name){
        clientMapper.delete(name);
    }

    @Override
    public List<Map<String, Object>> selectNum() {
        return clientMapper.selectNum();
    }

    public List<Map<String, Object>> selectNumSeason(){
        return clientMapper.selectNumSeason();
    }
}
