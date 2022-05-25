package io.github.springsongs;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutowireTest {
    @Test
    public void testAutowire(){
        ClassPathXmlApplicationContext classPathXmlApplicationContext=new ClassPathXmlApplicationContext("classpath:/bean.xml");
        System.out.println(classPathXmlApplicationContext.getBean("serviceD"));
        System.out.println(classPathXmlApplicationContext.getBean("serviceE"));
    }
}
