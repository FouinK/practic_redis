package redisPractic.redis.service;

import redisPractic.redis.entity.UserInfo;

public interface UserInfoService {

    UserInfo join(String username);
}
