package com.example.newcostumerpro;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class testController {

    @GetMapping("/admin")
    public String seePage(){
        return "admin";
    }
}
