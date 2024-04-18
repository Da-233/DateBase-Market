package com.snp.controller;

import com.snp.dto.Client;
import com.snp.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ClientController {
    @Autowired
    private ClientService clientService;
    @RequestMapping("/findById")
    public Client findById(int id){
        return clientService.findById(id);
    }
    @RequestMapping("/client/findall")
    public List<Client> findAll(){
        return clientService.findAll();
    }
}
