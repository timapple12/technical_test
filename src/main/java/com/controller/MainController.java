package com.controller;


import com.domain.User;
import com.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("hello")
public class MainController {
    private final UserService userService;

    public MainController(UserService userService) {
        this.userService = userService;
    }


    @GetMapping
    public String getHotel(){
        System.out.println("get");
        System.out.println(userService.listPersons());
        return "main";
    }
}
