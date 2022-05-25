package io.github.springsongs;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeTest {
    ClassPathXmlApplicationContext classPathXmlApplicationContext;
    @Before
    public void before(){
        classPathXmlApplicationContext=new ClassPathXmlApplicationContext("classpath:/bean.xml");
        System.out.println("容器创建完毕");
    }

    @Test
    public void testScope(){
        System.out.println(classPathXmlApplicationContext.getBean("beanScope"));
        System.out.println(classPathXmlApplicationContext.getBean("beanScope"));
        System.out.println(classPathXmlApplicationContext.getBean("beanScope"));
    }
}
