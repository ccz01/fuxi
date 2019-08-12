package com.ccz.fuxi.controller;

import com.ccz.fuxi.feign.XingtianClient;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created with IntelliJ IDEA
 * Created By zcc
 * Date: 2019/7/9
 * Time: 20:09
 */
@RestController
@RequestMapping("/test/customer")
@Slf4j
public class ConsulCustomerController {

    @Autowired
    private XingtianClient xingtianClient;

    /**
     * 服务接口
     * @param name
     * @return
     */
    @RequestMapping("/name")
    public String sayHello(@RequestParam("name")String name) {
        String s = xingtianClient.getName(name);
        log.info("查询到的参数"+s);
        return s;
    }
}
