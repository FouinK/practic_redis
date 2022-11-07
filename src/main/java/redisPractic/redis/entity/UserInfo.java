package redisPractic.redis.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Getter
public class UserInfo {
    @Id
    @GeneratedValue
    private Long userId;

    @Column
    private String username;

    protected UserInfo() {
    }

    public static UserInfo createUserInfo(String username) {
        UserInfo userInfo = new UserInfo();
        userInfo.username = username;
        return userInfo;
    }
}
