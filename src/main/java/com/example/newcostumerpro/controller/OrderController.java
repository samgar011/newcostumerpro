package com.example.newcostumerpro.controller;


import com.example.newcostumerpro.dto.OrderRequest;
import com.example.newcostumerpro.dto.OrderResponse;
import com.example.newcostumerpro.entity.Costumer;
import com.example.newcostumerpro.repositories.CostumerRepo;
import com.example.newcostumerpro.repositories.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class OrderController {

    @Autowired
    private CostumerRepo costumerRepo;

    @Autowired
    private ProductRepo productRepo;

    @PostMapping("/placeOrder")
    public Costumer placeOrders(@RequestBody OrderRequest orderRequest){
        return costumerRepo.save(orderRequest.getCostumer());
    }

    @GetMapping("/findAllOrders")
    public List<Costumer>findAllOrders(){
        return costumerRepo.findAll();
    }
    @GetMapping("/getInfo")
    public List<OrderResponse>getJoinInformation(){
        return costumerRepo.getJoinInformation();
    }

}
