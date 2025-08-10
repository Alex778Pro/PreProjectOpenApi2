package com.example.preprojectopenapi2.service;

import com.example.preprojectopenapi2.client.UserApiClient;
import com.example.preprojectopenapi2.dto.PostDTO;
import com.example.preprojectopenapi2.dto.UserDTO;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class UserService {
    UserApiClient userApiClient;

    public UserService(UserApiClient userApiClient) {
        this.userApiClient = userApiClient;
    }

    public UserDTO getUserWithPosts(Long userId) {
        try {
            return userApiClient.findUserById(userId);
        } catch (ResponseStatusException e) {
            throw e;
        }
    }

    public List<PostDTO> getUserPosts(Long userId) {
        try {
            UserDTO userDTO = userApiClient.findUserById(userId);
            return userDTO.getPosts();
        } catch (ResponseStatusException e) {
            throw e;
        }
    }
}
