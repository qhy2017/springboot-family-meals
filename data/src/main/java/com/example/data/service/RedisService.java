package com.example.data.service;

import java.util.concurrent.TimeUnit;

public interface RedisService {

    public void setKeyValue(String key,String value);

    public boolean expire(String key, long timeout, TimeUnit unit);
}
