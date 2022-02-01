package com.bootcoin.bootcoin.config;

import com.bootcoin.bootcoin.model.Bootcoin;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;

@Configuration
public class RedisConfiguration {

  @Bean
  JedisConnectionFactory jedisConnectionFactory() {
    // coneccion a la bd
    return new JedisConnectionFactory();
  }

  @Bean
  RedisTemplate<String, Bootcoin> redisTemplate() {
    final RedisTemplate<String, Bootcoin> redisTemplate = new RedisTemplate<>();
    redisTemplate.setConnectionFactory(jedisConnectionFactory());
    return redisTemplate;
  }
}
