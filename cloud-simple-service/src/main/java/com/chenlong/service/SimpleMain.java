package com.chenlong.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;

/**
 * Created by chenlong on 2016/12/26.
 */
@SpringBootApplication
//启用服务发现
@EnableDiscoveryClient
public class SimpleMain {

    public static void main(String args[]){
        SpringApplication.run(SimpleMain.class, args);
    }
}
