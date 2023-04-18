package com.example.demo.controller;

import java.util.List;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.UserDto;
import com.example.demo.entity.User;
import com.example.demo.service.UserService;

@RestController
public class HelloController {
    @Autowired
    private UserService userService;
    
    @GetMapping("/hello")
    public String hello() {
        return "Hello, world! - test";
    }
    
    @PostMapping("/users")
    public UserDto createUser(@RequestBody UserDto userDto) {
        User user = new User();
        user.setName(userDto.getName());
        user = userService.save(user);

        userDto.setId(user.getId());
        return userDto;
    }
    
    @GetMapping("/users")
    public List<UserDto> getUsers() {
        List<User> users = userService.findAll();
        List<UserDto> userDtos = new ArrayList<>();

        for (User user : users) {
            UserDto userDto = new UserDto();
            userDto.setId(user.getId());
            userDto.setName(user.getName());
            userDtos.add(userDto);
        }

        return userDtos;
    }

}