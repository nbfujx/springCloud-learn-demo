package com.goku.demo.remote;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by nbfujx on 2017-11-24.
 */
@FeignClient(name= "spring-cloud-producer", fallback = ExampleRemoteHystrix.class)
public interface  ExampleRemote {

    @RequestMapping("/")
     String echo(@RequestParam(value = "str") String str);
}
