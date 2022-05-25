package io.github.springsongs;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutowireByConstructor {
    @Test
    public void testAutowireByConstructor() {
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("classpath:/bean1.xml");
        System.out.println(classPathXmlApplicationContext.getBean("serviceC"));
    }
}
