package com.snp.service;

import com.snp.dto.Client;
import java.util.List;
import java.util.Map;

public interface ClientService {

    public Client findById(int id);
    public List<Client> findAll();

    String insert(Client client);
    public List<Client> findByX(String x);

    public void delete(String name);

    List<Map<String, Object>> selectNum();

    List<Map<String, Object>> selectNumSeason();
}
