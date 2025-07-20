package consumer;

import feign.example.demo.controller.OrderService;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class OrderClientController {
    @Resource
    private OrderService orderClient;

    @GetMapping("/order/get/{id}")
    public String getOrder(@PathVariable Long id) {
        return "Order Service";
    }
}
