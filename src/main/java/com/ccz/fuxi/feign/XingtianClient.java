package com.ccz.fuxi.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.cloud.openfeign.FeignClientProperties;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created with IntelliJ IDEA
 * Created By zcc
 * Date: 2019/7/9
 * Time: 20:35
 */
@Service
@FeignClient(name = "${mytest.service.xingtian}", path = "/test", configuration = FeignClientProperties.FeignClientConfiguration.class)
public interface XingtianClient {
    @GetMapping(path = "/name")
    String getName(@RequestParam("name") String name);
}
