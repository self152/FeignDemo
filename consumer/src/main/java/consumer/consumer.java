package consumer;

import configuration.DefaultConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients(defaultConfiguration = {DefaultConfiguration.class})
public class consumer {

	public static void main(String[] args) {
		SpringApplication.run(consumer.class, args);
	}

}
