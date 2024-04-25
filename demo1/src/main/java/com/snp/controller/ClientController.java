package com.snp.controller;

import com.snp.common.Result;
import com.snp.dto.Client;
import com.snp.service.ClientService;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.List;
import java.util.Random;


@RestController
@RequestMapping("/client")
public class ClientController {
    @Resource
    private ClientService clientService;
    @RequestMapping("/findbyid")
    public Client findById(int id){
        return clientService.findById(id);
    }

    @GetMapping("/findall")
    public Result findAll(){
        List<Client> clients = clientService.findAll();
        Result result = new Result("0", "", clients);
        System.out.println("findAll");
        return result;
    }

    @PostMapping("/insert")
    public Result insert(@RequestBody Client client){

        System.out.println("Insert");
        clientService.insert(client);
        return new Result("0", "true", "");
    }

    @GetMapping("/findbyx")
    public Result findByX(String x){
        System.out.println(x);
        System.out.println("findByX");
        List<Client> clients = clientService.findByX(x);
        return new Result("0", "true", clients);
    }

    @DeleteMapping("/delete")
    public Result delete(String name){
        System.out.println("delete");
        clientService.delete(name);
        return new Result("0", "true", "");
    }
    @GetMapping("/selectnum")
    public Result selectNum(){
        System.out.println("查询地区数量");
        return new Result("0", "true", clientService.selectNum());
    }

    @GetMapping("/selectnumseason")
    public Result selectNumSeason(){
        System.out.println("查询地区季节数量");
        return new Result("0", "true", clientService.selectNumSeason());
    }
}
