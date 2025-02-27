package com.example.manualredis.config;

import com.example.manualredis.model.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnection;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.connection.lettuce.LettuceConnection;
import org.springframework.data.redis.connection.lettuce.LettuceConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;

@Configuration
public class AppConfig {

    //Redis Connection

    @Bean
    public RedisConnectionFactory redisConnection(){
        return new LettuceConnectionFactory();
    }

    //Redis Template

    @Bean
    public RedisTemplate<String, Student> rt(){
        RedisTemplate<String,Student> redisTemplate = new RedisTemplate<>();
        redisTemplate.setConnectionFactory(redisConnection());
        return redisTemplate;
    }

}
