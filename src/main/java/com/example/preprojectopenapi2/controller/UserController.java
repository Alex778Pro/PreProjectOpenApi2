package com.example.preprojectopenapi2.controller;

import com.example.preprojectopenapi2.dto.PostDTO;
import com.example.preprojectopenapi2.dto.UserDTO;
import com.example.preprojectopenapi2.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/api/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/{userId}")
    public UserDTO getUserById(@PathVariable("userId") Long userId) {
        return userService.getUserWithPosts(userId);
    }

    @GetMapping("/{userId}/posts")
    public List<PostDTO> getUserPosts(@PathVariable("userId") Long userId) {
        return userService.getUserPosts(userId);
    }
}
