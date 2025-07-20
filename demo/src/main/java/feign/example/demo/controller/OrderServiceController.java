package feign.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderServiceController {

    @GetMapping("/order/get/{id}")
    public String getOrder(@PathVariable Long id) {
        return "Order Service";
    }
}
