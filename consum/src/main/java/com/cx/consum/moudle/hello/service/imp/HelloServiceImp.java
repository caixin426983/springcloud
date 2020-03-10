package com.cx.consum.moudle.hello.service.imp;

import com.cx.consum.moudle.hello.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @Description
 * @Author cx
 * @Date 2020/3/10 15:25
 **/
@Service
public class HelloServiceImp implements HelloService {

    @Autowired
    RestTemplate restTemplate;


    @Override
    public String hiService(String name) {
        return restTemplate.getForObject("Http://sso/login/hello/" + name, String.class);
    }
}
