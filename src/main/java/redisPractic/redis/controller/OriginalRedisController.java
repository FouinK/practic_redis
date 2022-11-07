package redisPractic.redis.controller;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class OriginalRedisController {
    private final redisPractic.redis.service.RedisSampleService redisSampleService;

    @PostMapping(value = "/getRedisStringValue")
    public ResponseEntity<?> getRedisStringValue(String key) {
        System.out.println("요청 들어옴");
        String returnRedisValue = redisSampleService.getRedisStringValue(key);
        return ResponseEntity.ok(returnRedisValue);
    }
}