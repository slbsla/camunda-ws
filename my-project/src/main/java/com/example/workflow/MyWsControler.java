package com.example.workflow;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyWsControler implements  IWsControler{
    @Override
    public String getAppVersion() {
            System.out.println("showing version..");
            return "My Project is running under version 1.0.0-SNAPSHOT";
    }
}
