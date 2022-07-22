package com.example.vuespringboot;

import com.example.vuespringboot.findRoad.gateway.controller.GatewayController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackageClasses = GatewayController.class)
public class VueSpringbootApplication {

	public static void main(String[] args) {
		SpringApplication.run(VueSpringbootApplication.class, args);
	}

}
