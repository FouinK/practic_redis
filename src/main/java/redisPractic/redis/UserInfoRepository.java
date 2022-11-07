package redisPractic.redis;

import org.springframework.data.jpa.repository.JpaRepository;
import redisPractic.redis.entity.UserInfo;

public interface UserInfoRepository extends JpaRepository<UserInfo, Long> {
    UserInfo findByUsername(String username);

}
