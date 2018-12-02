package cn.wnn.myeducation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class MyeducationRegistCenterApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyeducationRegistCenterApplication.class, args);
	}
}
