package com.slb.cmnd.demo;

import org.camunda.bpm.application.ProcessApplication;
import org.camunda.bpm.application.impl.ServletProcessApplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@ProcessApplication("Demo_Camunda_App")
@SpringBootApplication
public class SpringBootDemoApplication extends ServletProcessApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootDemoApplication.class, args);
	}
}
