package com.goku.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by nbfujx on 2017-11-20.
 */
@RestController
@RefreshScope
public class ExampleController {

    @Value("${goku.word}")
    private String hello;

    @RequestMapping("/hello")
    public String from() {
        return this.hello;
    }
}
