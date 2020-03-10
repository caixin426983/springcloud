package com.cx.consum.moudle.hello.controller;

import com.cx.consum.moudle.hello.service.HelloService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description TODO
 * @Author cx
 * @Date 2020/3/10 15:23
 **/
@RestController
@RequestMapping(value = "hello")
public class HelloController {

    @Autowired
    private HelloService helloService;

    @HystrixCommand(fallbackMethod = "hiError")
    @RequestMapping(value = "seeHello/{name}", method = RequestMethod.GET)
    public String seeHello(@PathVariable String name) {
        return helloService.hiService(name);
    }


    public String hiError(String name) {
        return "断路器打开" + name;
    }


}
