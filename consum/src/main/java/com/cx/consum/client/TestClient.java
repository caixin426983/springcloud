package com.cx.consum.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @Description TODO
 * @Author cx
 * @Date 2020/3/10 17:36
 **/
@FeignClient(value = "sso")
public interface TestClient {

    @RequestMapping(value = "login/hello/{name}",method = RequestMethod.GET)
    String hello(@PathVariable String name);

}
