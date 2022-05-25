package io.github.springsongs;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutowireByTypeTest {
    @Test
    public void testAutowireByType() {
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("classpath:/bean1.xml");
        System.out.println(classPathXmlApplicationContext.getBean("serviceC"));
    }
}
