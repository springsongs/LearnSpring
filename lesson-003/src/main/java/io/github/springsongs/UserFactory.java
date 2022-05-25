package io.github.springsongs;

public class UserFactory {
    public UserEntity builderUser1() {
        UserEntity userEntity = new UserEntity();
        userEntity.setUserName("我是无参静态造构方法创建的！");
        return userEntity;
    }

    public UserEntity builderUser2(String userName, String gender) {
        UserEntity userEntity = new UserEntity();
        userEntity.setUserName(userName);
        userEntity.setGender(gender);
        return userEntity;
    }
}
