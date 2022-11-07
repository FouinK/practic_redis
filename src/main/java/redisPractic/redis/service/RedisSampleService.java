package redisPractic.redis.service;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Service;
import redisPractic.redis.UserInfoRepository;

import java.util.concurrent.TimeUnit;

@Service
@RequiredArgsConstructor
public class RedisSampleService {

    private final StringRedisTemplate stringRedisTemplate;

    public String getRedisStringValue(String key) {

        ValueOperations<String, String> stringValueOperations = stringRedisTemplate.opsForValue();
        System.out.println("Redis key : " + key);
        System.out.println("Redis value : " + stringValueOperations.get(key));
        System.out.println("Service 요청 들어옴");
        return stringValueOperations.get(key);
    }


    public void setData(String key, String value, Long expiredTime) {
        stringRedisTemplate.opsForValue().set(key, value, expiredTime, TimeUnit.MILLISECONDS);
    }


}