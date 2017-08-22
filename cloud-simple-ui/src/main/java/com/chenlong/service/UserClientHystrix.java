package com.chenlong.service;

import com.chenlong.model.User;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by chenlong on 2017/7/28.
 */
@Component
public class UserClientHystrix implements  UserClient {

    @Override
    public List<User> getUserList() {
        List<User> ls = new ArrayList<>();
        User user = new User();
        user.setUsername("test hystrixCommand2");
        ls.add(user);

        return ls;
    }
}
