package com.fengabner.user;

import com.fengabner.user.feign.OrderFeignClient;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients(basePackageClasses = {OrderFeignClient.class})
public class UserServiceUseFeignApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserServiceUseFeignApplication.class, args);
	}

}
