package cn.wnn.myeducation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@EnableDiscoveryClient
@SpringBootApplication
public class MyeducationSchoolWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyeducationSchoolWebApplication.class, args);
	}
}
