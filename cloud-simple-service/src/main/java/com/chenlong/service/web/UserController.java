package com.chenlong.service.web;

import com.chenlong.service.domain.UserService;
import com.chenlong.service.model.User;
import com.netflix.appinfo.InstanceInfo;
import com.netflix.discovery.DiscoveryClient;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;
import java.util.List;

@RestController
public class UserController {

	Logger logger = Logger.getLogger(getClass());


	@Autowired
	private  UserService userService;

	@RequestMapping(value="/user",method=RequestMethod.GET)
	public List<User> readUserInfo(){
		logger.info("readUserInfo----------");
		List<User> ls=userService.searchAll();		
		return ls;
	}

	@RequestMapping("/add")
	public Integer add(@RequestParam Integer a,Integer b){
		Integer c = a + b;
		return c;
	}

	@Value("${mysqldb.datasource.url}")
	private  String dataSourceUrl;

	@RequestMapping("/url")
	public String testConfig(){
		return  dataSourceUrl;
	}


}
