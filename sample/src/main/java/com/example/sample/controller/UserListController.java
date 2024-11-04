package com.example.sample.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.sample.domain.user.service.UserService;
import com.example.sample.domain.user.model.MUser;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;

@Controller
@RequestMapping("/user")
public class UserListController {

    @Autowired
    private UserService userService;

    @GetMapping("/list")
    public String getUserList(Model model) {
        List<MUser> userList = userService.getUsers();
        model.addAttribute("userList",userList);
        return "user/list";
    }
}
