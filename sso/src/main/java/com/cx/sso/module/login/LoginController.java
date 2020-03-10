package com.cx.sso.module.login;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description TODO
 * @Author cx
 * @Date 2020/3/10 15:10
 **/
@RestController
@RequestMapping(value = "login")
public class LoginController {

    @Value("${server.port}")
    String port;

    @RequestMapping(value = "hello/{name}", method = RequestMethod.GET)
    public String hello(@PathVariable String name) {
        return "hello " + name + " i am from port :" + port;
    }


}
