package com.chenlong.service;

import com.chenlong.model.User;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by chenlong on 2017/7/28.
 */

@FeignClient(value = "cloud-simple-service", fallback = UserClientHystrix.class)
public interface UserClient {

  //  @HystrixCommand(fallbackMethod = "fallbackSearchAll")
    @RequestMapping(method = RequestMethod.GET,value = "/user")
    List<User> getUserList();

//    default  List<User> fallbackSearchAll(){
//        List<User> ls = new ArrayList<>();
//        User user = new User();
//        user.setUsername("test hystrixCommand");
//        ls.add(user);
//
//        return ls;
//    }

}
