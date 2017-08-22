package com.chenlong.web;

import com.chenlong.model.User;
import com.chenlong.service.UserClient;
import com.chenlong.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by chenlong on 2017/7/27.
 */
@RestController
public class UserController {

    @Autowired
    UserService userService;

    @Autowired
    UserClient userClient;


    @RequestMapping(value = "/users",produces =  MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<User>> getUserList(){
        List<User> list = userService.getUserList();
        return  new ResponseEntity<List<User>>(list, HttpStatus.OK);
    }




    @RequestMapping("/users2")
    public ResponseEntity<List<User>> getUserList2(){
        List<User> list = userClient.getUserList();
        return  new ResponseEntity<List<User>>(list, HttpStatus.OK);
    }



}
