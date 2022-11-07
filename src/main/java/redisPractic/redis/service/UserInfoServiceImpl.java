package redisPractic.redis.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import redisPractic.redis.UserInfoRepository;
import redisPractic.redis.entity.UserInfo;

@Service
@RequiredArgsConstructor
public class UserInfoServiceImpl implements UserInfoService {

    private final UserInfoRepository userInfoRepository;

    @Override
    public UserInfo join(String username) {
        UserInfo userInfo = UserInfo.createUserInfo(username);
        userInfoRepository.save(userInfo);

        return userInfo;
    }
}
