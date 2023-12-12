package com.cmepps.listatareas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@ComponentScan(basePackages = {"com.cmepps.listatareas.domain.port.driven_port"})
public class ListatareasApplication {

	public static void main(String[] args) {
		SpringApplication.run(ListatareasApplication.class, args);
	}

}
