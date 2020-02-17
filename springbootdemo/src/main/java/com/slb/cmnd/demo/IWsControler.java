package com.slb.cmnd.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping({"/api/"})
public interface IWsControler {
    @GetMapping(path = {"/get"})
    public String getString();
}

