package redisPractic.redis.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import redisPractic.redis.UserInfoRepository;
import redisPractic.redis.entity.UserInfo;
import redisPractic.redis.service.RedisSampleService;

import java.util.Map;

@RestController
@RequiredArgsConstructor
public class RedisController {

    private final RedisSampleService redisSampleService;
    private final UserInfoRepository userInfoRepository;

    @PostMapping("/redis/insert/userInfo")
    public ResponseEntity<?> insertRedis(@RequestBody Map<String, String> map) {

        UserInfo userInfo = userInfoRepository.findByUsername(map.get("username"));
        redisSampleService.setData("username", String.valueOf(userInfo.getUsername()), 10000000L);
        return ResponseEntity.ok("인설트 완료");
    }
}
