package com.example.springbootmonitor;


import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Configuration;

//<spring-admin.version>1.5.7</spring-admin.version>
import de.codecentric.boot.admin.config.EnableAdminServer;


// import de.codecentric.boot.admin.server.config.EnableAdminServer;




@SpringBootApplication
@Configuration
@EnableAutoConfiguration
@EnableDiscoveryClient
@EnableAdminServer
public class SpringBootMonitorApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootMonitorApplication.class, args);
	}
}
