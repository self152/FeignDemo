package feign.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserServiceController {

    @GetMapping("/user/get/{id}")
    public String getUser(@PathVariable Long id) {
        return "User Service";
    }
}

