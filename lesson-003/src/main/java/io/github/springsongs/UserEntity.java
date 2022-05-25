package io.github.springsongs;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class UserEntity {
    private String userName;
    private String gender;

    public UserEntity() {
        this.userName = "我是通过无参构造器方法创建的";
    }

    public UserEntity(String userName, String gender) {
        this.userName=userName;
        this.gender=gender;
    }
}
