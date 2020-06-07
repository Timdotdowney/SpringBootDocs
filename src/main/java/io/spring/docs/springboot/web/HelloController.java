package io.spring.docs.springboot.web;


import org.springframework.boot.autoconfigure.web.servlet.WebMvcAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author timdowney
 */
@Controller
public class HelloController {
    
    @GetMapping("/home")
    public String home() {
        return "home.html";
    }
}
