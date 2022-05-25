package io.github.springsongs;

public class UserStaticFactory
{
    public static UserEntity builderUser1(){
        System.out.println(UserStaticFactory.class+".builderUser1()");
        UserEntity userEntity=new UserEntity();
        userEntity.setUserName("我是无参静态造构方法创建的！");
        return userEntity;
    }

    public static UserEntity builderUser2(String userName,String gender){
        System.out.println(UserStaticFactory.class+".builderUser2()");
        UserEntity userEntity=new UserEntity();
        userEntity.setUserName(userName);
        userEntity.setGender(gender);
        return userEntity;
    }
}
