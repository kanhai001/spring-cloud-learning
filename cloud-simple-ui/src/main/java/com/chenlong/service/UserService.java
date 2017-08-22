package com.chenlong.service;

import com.chenlong.model.User;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by chenlong on 2017/7/27.
 */

@Service
public class UserService {

    @Autowired
    RestTemplate restTemplate;

    final String SERVICE_NAME="cloud-simple-service";

    @HystrixCommand(fallbackMethod = "fallbackSearchAll")
    public List<User> getUserList(){
        return restTemplate.getForObject("http://"+SERVICE_NAME+"/user" ,List.class);
    }

    private List<User> fallbackSearchAll(){
        List<User> ls = new ArrayList<>();
        User user = new User();
        user.setUsername("test hystrixCommand");
        ls.add(user);
        return ls;
    }
}
