package io.github.springsongs;

import org.springframework.beans.factory.FactoryBean;

public class UserFactoryBean implements FactoryBean<UserEntity> {
    @Override
    public UserEntity getObject() throws Exception {
        UserEntity userEntity=new UserEntity();
        userEntity.setUserName("我是通过FactoryBean创建出来的Bean");
        userEntity.setGender("女");
        return userEntity;
    }

    @Override
    public Class<?> getObjectType() {
        return UserEntity.class;
    }

    @Override
    public boolean isSingleton() {
        return true;
    }
}
