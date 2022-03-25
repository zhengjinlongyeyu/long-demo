package com;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;

@SpringBootTest
class LongDemoApplicationTests {
	
	   @Autowired 
	   private RedisTemplate<String, Object> redisTemplate;

	@Test
	public void contextLoads() {
		ValueOperations<String, Object> opsForValue = redisTemplate.opsForValue();
		opsForValue.set("namesa", "zhangsan");
		opsForValue.set("namesasd", "zhangsans");
		System.out.println("+++++++++>"+opsForValue.get("names"));
		
		
	}

}
