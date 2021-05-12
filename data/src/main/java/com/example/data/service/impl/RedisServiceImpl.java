package com.example.data.service.impl;

import com.example.data.service.RedisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Service;

import javax.validation.constraints.NotNull;
import java.util.concurrent.TimeUnit;

/**
 * redis 基本操作
 */
@Service
public class RedisServiceImpl extends AbstractRedisService {

    public RedisServiceImpl(@NotNull RedisTemplate<String,Object> redisTemplate){
        System.out.println("RedisServiceImpl ---------------------");
        if(this.redisTemplate == null) {
            setRedisTemplate(redisTemplate);
        }
    }

    @Override
    public void setKeyValue(String key, String value) {
        super.setKeyValue(key, value);
    }

    @Override
    public boolean expire(String key, long timeout, TimeUnit unit) {
        return super.expire(key, timeout, unit);
    }
}
