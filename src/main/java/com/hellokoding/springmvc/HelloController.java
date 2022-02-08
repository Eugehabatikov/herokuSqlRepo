package com.hellokoding.springmvc;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.xml.crypto.Data;
import java.io.IOException;
import java.util.Date;

@Controller
public class HelloController {
    @GetMapping({"/", "/hello"})
    public String hello(@RequestParam(value="name", required=false, defaultValue="World") String name, Model model) {
        model.addAttribute("name", name);
        return "hello";
    }

    @GetMapping({"/hell"})
    public String hell(@RequestParam(value="name", required=false, defaultValue="World") String name, Model model) {
        model.addAttribute("name", name);
        return "hell";
    }

    @GetMapping({"/time"})
    public String time(
            @RequestParam(value = "name", required = false, defaultValue = "Ivan Vasilievich is the best")String name, Model model) {
        Date actualTime = new Date();
        model.addAttribute("time", actualTime.toString());
        model.addAttribute("name", name);
        return "time";
    }

    @GetMapping({"/image"})
    @RequestMapping("/show")
    public String show(){
        return "show";
    }
}
