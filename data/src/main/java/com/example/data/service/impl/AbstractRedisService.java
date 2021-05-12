package com.example.data.service.impl;

import com.example.data.service.RedisService;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;

import java.util.concurrent.TimeUnit;

public abstract class AbstractRedisService implements RedisService {
    public static RedisTemplate<String,Object> redisTemplate;

    private static   Object lock = new Object();

    public  static ValueOperations<String, Object> stringObjectValueOperations;

    public void setKeyValue(String key,String value) {
        synchronized (lock) {
            try {
                stringObjectValueOperations.set(key,value);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public boolean expire(String key, long timeout, TimeUnit unit)  {
        Boolean expire = false;
        synchronized (lock) {
            try {
                expire = redisTemplate.expire(key, timeout, unit);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return expire;
    }

    public static RedisTemplate<String, Object> getRedisTemplate() {
        return redisTemplate;
    }

    public static void setRedisTemplate(RedisTemplate<String, Object> redisTemplate) {
        AbstractRedisService.redisTemplate = redisTemplate;
        setStringObjectValueOperations(redisTemplate.opsForValue());
    }

    public static Object getLock() {
        return lock;
    }

    public static void setLock(Object lock) {
        AbstractRedisService.lock = lock;
    }

    public static ValueOperations<String, Object> getStringObjectValueOperations() {
        return stringObjectValueOperations;
    }

    public static void setStringObjectValueOperations(ValueOperations<String, Object> stringObjectValueOperations) {
        AbstractRedisService.stringObjectValueOperations = stringObjectValueOperations;
    }
}
