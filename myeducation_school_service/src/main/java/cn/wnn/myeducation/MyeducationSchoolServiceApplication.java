package cn.wnn.myeducation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import tk.mybatis.spring.annotation.MapperScan;

@EnableDiscoveryClient
@EnableFeignClients
@MapperScan(basePackages = "cn.wnn.myeducation.mapper")
@SpringBootApplication
public class MyeducationSchoolServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyeducationSchoolServiceApplication.class, args);
	}
}
