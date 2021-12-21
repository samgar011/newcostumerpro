package com.example.newcostumerpro.costumerP;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;


@RestController
public class CostumerController {

    @RequestMapping("/home")

    public List <TableContent> CostumerAll(){

        return Arrays.asList(
                new TableContent("pake 1","200", "new type", "aciklama yok" ),
                new TableContent("pake 1","200", "new type", "aciklama yok" ),
                new TableContent("pake 1","200", "new type", "aciklama yok" )
        );
    }

}
