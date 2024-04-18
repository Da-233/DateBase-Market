package com.snp.service;

import com.snp.dto.Client;

import java.util.List;

public interface ClientService {

    public Client findById(int id);
    public List<Client> findAll();
}
