package com.cloud.bookservice8082.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @program: cloud-parent-two
 * @description:
 * @author: 001977
 * @create: 2018-07-25 10:58
 */
@Slf4j
@RestController
public class BookController {

    @Autowired
    private DiscoveryClient discoveryClient;

    @RequestMapping("/book")
    public String index(){
        List<String> services = discoveryClient.getServices();
        services.forEach(e -> log.info("book-service:8082:" + e));
        List<ServiceInstance> list = discoveryClient.getInstances("BOOKSERVICEPROVIDER");
        list.forEach(e -> {
            log.info("book-service:8082:" + e.getServiceId() + "," + e.getHost() + "," + e.getPort() + "," + e.getUri());
        });
        return "{\n" +
                "  \"bookName\": \"Apache Kafka实战\",\n" +
                "  \"bookSize\": \"16开\",\n" +
                "  \"pack\": \"平装\",\n" +
                "  \"isbn\": \"9787121337765\",\n" +
                "  \"publisher\": \"电子工业出版社\",\n" +
                "  \"publishTime\": \"2018-05-01\",\n" +
                "  \"service\": \"book-service:8082\"\n" +
                "}";
    }
}
