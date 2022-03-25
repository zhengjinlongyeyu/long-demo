package com;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloWorld {
	
	  /**
     * 日志记录
     */
    private static final Logger logger = LoggerFactory.getLogger(HelloWorld.class);
    

	
	
	@RequestMapping("/hello/")
	public String sayHello(){
		logger.info("1212313");
		return "Hello World!";
	}
	
	 @RequestMapping("hello/{id}")
	 public String GetUser(@PathVariable int id){
		 String aaaString = null;
		 for (int i = 0; i <= 10; i++) {
			 System.out.println("++++++++>"+i);
			 aaaString = String.valueOf(i);
		}
		 
	        return  aaaString;
	    }
	
	
}
