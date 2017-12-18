package com.goku.demo.remote;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by nbfujx on 2017-11-27.
 */
@Component
public class ExampleRemoteHystrix implements ExampleRemote {
    @Override
    public String echo(@RequestParam(value = "str") String str) {
        return "hello" +str+", this messge send failed ";
    }
}
