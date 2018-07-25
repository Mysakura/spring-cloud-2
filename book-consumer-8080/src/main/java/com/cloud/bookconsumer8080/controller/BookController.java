package com.cloud.bookconsumer8080.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @program: cloud-parent-two
 * @description:
 * @author: 001977
 * @create: 2018-07-25 12:44
 */
@RestController
public class BookController {

    private static final String PREFIX = "http://BOOKSERVICE";  // 微服务名字

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("consumeBook")
    public String index(){
        return restTemplate.getForEntity(PREFIX + "/book",String.class).getBody();
    }
}
