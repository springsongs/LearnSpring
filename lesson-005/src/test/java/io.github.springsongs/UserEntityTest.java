package io.github.springsongs;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserEntityTest {
    @Test
    public void testUserEntity(){
        ClassPathXmlApplicationContext classPathXmlApplicationContext=new ClassPathXmlApplicationContext("classpath:/bean.xml");
        UserEntity userEntity= (UserEntity) classPathXmlApplicationContext.getBean("userEntity");
        System.out.println(userEntity);
        UserEntity userEntity1= (UserEntity) classPathXmlApplicationContext.getBean("userEntity1");
        System.out.println(userEntity1);

        UserEntity userEntity2= (UserEntity) classPathXmlApplicationContext.getBean("userEntity2");
        System.out.println(userEntity2);
        UserEntity userEntity3= (UserEntity) classPathXmlApplicationContext.getBean("userEntity3");
        System.out.println(userEntity3);

        UserEntity userEntity4= (UserEntity) classPathXmlApplicationContext.getBean("userEntity4");
        System.out.println(userEntity4);

        UserEntity userEntity5= (UserEntity) classPathXmlApplicationContext.getBean("userEntity5");
        System.out.println(userEntity5);
    }
}
