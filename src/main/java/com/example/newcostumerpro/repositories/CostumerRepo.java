package com.example.newcostumerpro.repositories;

import com.example.newcostumerpro.dto.OrderResponse;
import com.example.newcostumerpro.entity.Costumer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CostumerRepo extends JpaRepository<Costumer, Integer> {

    @Query("SELECT new com.example.newcostumerpro.dto.OrderResponse (c.name , p.productName) FROM  Costumer c JOIN c.products p")

    public List<OrderResponse> getJoinInformation();
}
