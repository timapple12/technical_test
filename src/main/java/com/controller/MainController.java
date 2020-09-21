package com.controller;


import com.domain.User;
import com.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping
public class MainController {
    private final UserService userService;

    public MainController(UserService userService) {
        this.userService = userService;
    }


    @GetMapping("/hello")
    public String getHotel(){
        System.out.println("get");
        System.out.println(userService.listPersons());
        return "main";
    }
    @GetMapping("/hello/h")
    public String get(){
        System.out.println("get1");

        return "main";
    }
}
