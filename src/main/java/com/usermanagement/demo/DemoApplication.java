package com.usermanagement.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.usermanagement.controller.UserManageController;
@Configuration

@EnableJpaRepositories(basePackages = "com.usermanagement.repository")

@EntityScan(basePackages = "com.usermanagement.entity")

@EnableTransactionManagement

@EnableAutoConfiguration
@SpringBootApplication
@ComponentScan(basePackageClasses = UserManageController.class)


@ComponentScan({"com.usermanagement.service"})
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
