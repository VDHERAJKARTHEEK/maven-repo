package com.redis.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;

import com.redis.binding.User;

@Configuration
public class RedisConfiguration {

	@Bean
	public JedisConnectionFactory getJedisConnection() {
		JedisConnectionFactory jcf=new JedisConnectionFactory();
	//	jcf.setHostName(null);
		//jcf.setPort(0);
		//jcf.setPassword(null);
		return jcf;
		
	}
@Bean
@Primary
	public RedisTemplate<String,User> getRedisTemplate(JedisConnectionFactory jcf){
		RedisTemplate<String,User> rt=new RedisTemplate<> ();
		rt.setConnectionFactory(jcf);
		return rt;
	}
	}


