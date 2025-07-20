package feign.example.demo.controller;

import feign.example.demo.configuration.OrderConfiguration;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(value = "order-service", url = "http://localhost:8080", configuration = OrderConfiguration.class)
public interface OrderService {

    @GetMapping("/order/get/{id}")
    public String getOrder(@PathVariable Long id);
}
