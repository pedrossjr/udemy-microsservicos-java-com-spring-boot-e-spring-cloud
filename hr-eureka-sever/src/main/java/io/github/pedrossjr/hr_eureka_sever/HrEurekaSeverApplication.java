package io.github.pedrossjr.hr_eureka_sever;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class HrEurekaSeverApplication {

	public static void main(String[] args) {
		SpringApplication.run(HrEurekaSeverApplication.class, args);
	}

}
