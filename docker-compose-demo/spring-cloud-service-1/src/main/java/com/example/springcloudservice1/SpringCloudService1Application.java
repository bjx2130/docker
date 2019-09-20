package com.example.springcloudservice1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


@EnableAutoConfiguration
@EnableDiscoveryClient
@SpringBootApplication
public class SpringCloudService1Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudService1Application.class, args);
	}
}
