package com.chenlong;

import org.apache.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.concurrent.atomic.AtomicLong;


/**
 * Created by chenlong on 2017/7/26.
 */
@Controller
@SpringBootApplication
@EnableDiscoveryClient
public class SampleController {

    Logger logger = Logger.getLogger(SampleController.class);

    AtomicLong atomicLong = new AtomicLong();


    @ResponseBody
    @RequestMapping("/")
    public  String helloWord(){
        long num = atomicLong.incrementAndGet();
        logger.info("seq: " + num);
        return "seq: " + num;
    }

    public static void main(String args[]){
        SpringApplication.run(SampleController.class);
    }
}
