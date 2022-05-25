package io.github.springsongs;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.beans.ConstructorProperties;

@Setter
@Getter
@ToString
public class UserEntity {
    private String userName;
    private int age;
    private String gender;

    public UserEntity() {

    }

    public UserEntity(String userName, int age) {
        System.out.println("两个参数的构造器");
        this.userName = userName;
        this.age = age;
    }

    @ConstructorProperties({"userName", "age", "gender"})
    public UserEntity(String userName, int age, String gender) {
        System.out.println("三个参数的构造器");
        this.userName = userName;
        this.age = age;
        this.gender = gender;
    }
}
