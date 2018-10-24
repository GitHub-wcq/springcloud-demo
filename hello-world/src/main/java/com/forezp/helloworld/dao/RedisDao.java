package com.forezp.helloworld.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Repository;

import java.util.concurrent.TimeUnit;

@Repository
public class RedisDao {

    @Autowired
    private StringRedisTemplate template;

    public void setString(String key, String value) {
        ValueOperations<String, String> ops = template.opsForValue();
        ops.set(key, value);
    }

    public void setString(String key, String value, Long num, TimeUnit unit) {
        ValueOperations<String, String> ops = template.opsForValue();
        ops.set(key, value, num, unit); //保存值并设置过期时间
    }

    public String getString(String key) {
        ValueOperations<String, String> ops = template.opsForValue();
        return ops.get(key);
    }

}
