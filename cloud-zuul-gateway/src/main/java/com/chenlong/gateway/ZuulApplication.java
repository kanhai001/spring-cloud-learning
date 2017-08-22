package com.chenlong.gateway;

import com.chenlong.filter.AccessFilter;
import com.chenlong.filter.ThrowExceptionFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.cloud.netflix.zuul.EnableZuulServer;
import org.springframework.cloud.netflix.zuul.filters.post.SendErrorFilter;
import org.springframework.context.annotation.Bean;

/**
 * Created by chenlong on 2017/8/2.
 */

@EnableZuulProxy
@SpringCloudApplication
public class ZuulApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZuulApplication.class);
    }

//    @Bean
//    public AccessFilter accessFilter(){
//        return  new AccessFilter();
//    }

//    @Bean
//    public ThrowExceptionFilter throwExceptionFilter(){
//        return  new ThrowExceptionFilter();
//    }
//
//    @Bean
//    public SendErrorFilter sendErrorFilter(){
//        return new SendErrorFilter();
//    }
}
