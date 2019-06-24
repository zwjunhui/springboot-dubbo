package com.springboot.consumer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.springboot.api.service.DemoService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * DemoConsumerController
 * 消费者控制层
 */
@RestController
public class DemoConsumerController {

    @Reference(version = "${demo.service.version}")
    private DemoService demoService;

    @RequestMapping("/sayHello")
    public String sayHello(@RequestParam("name") String name) {
        return demoService.sayHello(name);
    }

}
