package com.slb.cmnd.cmnddemo;

import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping({"/api/"})
public interface IWsControler {
    @GetMapping(path = {"/get"})
    public Optional<String> getString();
}

