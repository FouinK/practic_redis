package redisPractic.redis.service;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;
import redisPractic.redis.entity.UserInfo;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Transactional
class UserInfoServiceImplTest {

    @Autowired
    UserInfoService userInfoService;

    @Test
    @Rollback(value = false)
    void join() {
        //given
        String username = "성현";
        //when
        UserInfo userInfo = userInfoService.join(username);
        //then
        Assertions.assertThat(1L).isEqualTo(userInfo.getUserId());
    }
}