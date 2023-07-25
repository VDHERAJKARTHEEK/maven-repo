package com.redis.controller;

import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.redis.binding.User;

@RestController
public class courseRestController{
	
	private HashOperations<String,Integer,Object> hashops;
	
	public courseRestController(RedisTemplate<String,User> redisTemplate) {
		this.hashops=redisTemplate.opsForHash();
		
	}
	@PostMapping("/store")
	public String storeData(@RequestBody User user) {
		hashops.put("Persons",user.getUid(), user.getName());
		return "success";
		}
	@GetMapping("/data/{uid}")
	public String getData(@PathVariable("uid") Integer uid) {
		String value=(String)hashops.get("Persons", uid);
		return value;
	}
	
}
