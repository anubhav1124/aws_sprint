package com.cg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2 
@SpringBootApplication
public class HotelBookingManagmentSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(HotelBookingManagmentSystemApplication.class, args);
	}
	
	
	  public Docket api() { return new Docket(DocumentationType.SWAGGER_2)
	  .select() .apis(RequestHandlerSelectors.basePackage("com.cg")).build(); }
	 
}
