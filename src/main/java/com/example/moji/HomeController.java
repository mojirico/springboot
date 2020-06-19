package com.example.moji;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@EnableAutoConfiguration
public class HomeController {

    @RequestMapping("/")
    String home() {
        return "home";
    }
    
}