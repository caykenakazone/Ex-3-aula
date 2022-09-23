package com.aula_22_09.aula_22_09;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    
    @GetMapping("/pag1")
    public String pag1() {
        return "pag1";
    }
    @GetMapping("/pag2")
    public String pag2() {
        return "pag2";
    }
}
