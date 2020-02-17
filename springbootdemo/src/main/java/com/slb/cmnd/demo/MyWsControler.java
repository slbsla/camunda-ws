package com.slb.cmnd.demo;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyWsControler implements  IWsControler{
    @Override
    public String getString() {
            return "server is up";
    }
}
