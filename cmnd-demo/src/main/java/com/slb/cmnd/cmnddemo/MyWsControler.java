package com.slb.cmnd.cmnddemo;

import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class MyWsControler implements  IWsControler{
    @Override
    public Optional<String> getString() {
            return Optional.of("server is up");
    }
}
