package com.prisc.diodesingpatterns;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class DioDesingPatternsApplication {

	public static void main(String[] args) {
		SpringApplication.run(DioDesingPatternsApplication.class, args);
	}

}
