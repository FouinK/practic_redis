package redisPractic.redis.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import redisPractic.redis.service.RedisSampleService;

@RestController
public class RedisSampleController {

    @Autowired
    private RedisSampleService redisSampleService;

    @PostMapping(value = "/getRedisStringValue")
    public void getRedisStringValue(String key) {
        System.out.println("요청 들어옴");
        redisSampleService.getRedisStringValue(key);
    }
}