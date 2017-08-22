package com.chenlong;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Created by chenlong on 2016/12/26.
 */
@SpringBootApplication
//启用服务发现
//@EnableDiscoveryClient
public class SimpleMain2 {

    public static void main(String args[]){
        SpringApplication.run(SimpleMain2.class, args);
    }
}
