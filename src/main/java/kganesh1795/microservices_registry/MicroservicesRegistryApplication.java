package kganesh1795.microservices_registry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class MicroservicesRegistryApplication {
	public static void main(String[] args) {
		SpringApplication.run(MicroservicesRegistryApplication.class, args);
	}
}
