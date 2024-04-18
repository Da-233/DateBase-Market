package com.snp.service.impl;

import com.snp.dto.Client;
import com.snp.mapper.ClientMapper;
import com.snp.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientServiceImpl implements ClientService {
    @Autowired
    private ClientMapper clientMapper;

    @Override
    public Client findById(int id){
        return clientMapper.findById(id);
    }
    public List<Client> findAll(){
        return clientMapper.findAll();
    }
}
