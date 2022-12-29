package com.ust.labour.labourPoint;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication//(exclude = {DataSourceAutoConfiguration.class})
public class LabourPointApplication {

	public static void main(String[] args) {
		SpringApplication.run(LabourPointApplication.class, args);
	}

}
