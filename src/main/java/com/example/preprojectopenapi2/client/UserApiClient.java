package com.example.preprojectopenapi2.client;

import com.example.preprojectopenapi2.config.FeignConfig;
import com.example.preprojectopenapi2.dto.UserDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "userApiClient", url = "http://localhost:8081", configuration = FeignConfig.class)
public interface UserApiClient {
    @GetMapping("/userDTO/{id}")
    UserDTO findUserById(@PathVariable("id") Long id);
}
