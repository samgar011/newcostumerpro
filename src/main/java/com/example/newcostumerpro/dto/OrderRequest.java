package com.example.newcostumerpro.dto;

import com.example.newcostumerpro.entity.Costumer;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;


@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class OrderRequest {

    private Costumer costumer;
}
