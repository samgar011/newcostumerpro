package com.example.newcostumerpro.repositories;

import com.example.newcostumerpro.entity.Costumer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CostumerRepo extends JpaRepository<Costumer, Integer> {
}
