package io.github.springsongs;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class OrtherInjectTest {
    @Test
    public void testOtherInject(){
        ClassPathXmlApplicationContext classPathXmlApplicationContext=new ClassPathXmlApplicationContext("classpath:/bean.xml");
        OtherInject otherInject=(OtherInject) classPathXmlApplicationContext.getBean("otherInject");
        System.out.println(otherInject);
    }
}
