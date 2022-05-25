package io.github.springsongs;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanTest {
    @Test
    public void testCreateBeanByConstructor(){
        ClassPathXmlApplicationContext classPathXmlApplicationContext=new ClassPathXmlApplicationContext("classpath:/bean.xml");
        for(String beanName:classPathXmlApplicationContext.getBeanDefinitionNames()){
            System.out.println(beanName+":"+classPathXmlApplicationContext.getBean(beanName));
        }
    }
}
