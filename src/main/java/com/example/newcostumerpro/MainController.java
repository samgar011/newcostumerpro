package com.example.newcostumerpro;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class MainController {

    @GetMapping("/")
    public String watchMain(){
        return "home";
    }
}
