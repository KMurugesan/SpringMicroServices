package com.exen.cloud.iot.ioteurekhaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class IotEurekhaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(IotEurekhaServerApplication.class, args);
	}
}
