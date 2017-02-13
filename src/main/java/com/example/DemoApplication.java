package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;
import org.springframework.stereotype.*;
import com.alibaba.fastjson.JSON;

@Controller
@SpringBootApplication
public class DemoApplication {

    @RequestMapping("/")
    @ResponseBody
    String home() {
      return "Hello World!";
    }


   @RequestMapping("/phone")
    @ResponseBody
    String phone() {
      return "phone";
    }
    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }
}