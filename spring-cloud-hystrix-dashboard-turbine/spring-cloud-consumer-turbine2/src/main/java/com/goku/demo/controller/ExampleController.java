package com.goku.demo.controller;

import com.goku.demo.remote.ExampleRemote;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by nbfujx on 2017-11-20.
 */
@RestController
@RequestMapping("/api")
public class ExampleController {

    @Autowired
    ExampleRemote exampleremote;

    @RequestMapping("/{str}")
    public String echo(@PathVariable("str")  String str)
    {
        return exampleremote.echo(str);
    }
}
