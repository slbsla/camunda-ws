package com.slb.cmnd.cmnddemo;

import org.camunda.bpm.application.ProcessApplication;
import org.camunda.bpm.application.impl.ServletProcessApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by Samir on 14/02/2020.
 */
//@ProcessApplication("Demo_Camunda_App")
@ComponentScan({"com.slb.cmnd.cmnddemo"})
@SpringBootApplication(scanBasePackages="com.slb.cmnd.cmnddemo")

public class MyCamundaProcessApplication /*extends ServletProcessApplication*/ {
    public static void main(String[] args) {
        SpringApplication.run(MyCamundaProcessApplication.class, args);
    }
}
