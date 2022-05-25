package io.github.springsongs;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;

public class BeanTest {
    @Test
    public void showBean() {
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("classpath:/bean.xml");
        for (String beanName : Arrays.asList("userEntity1", "userEntity2", "userEntity3", "userEntity4", "userEntity5")) {
            String[] aliases = classPathXmlApplicationContext.getAliases(beanName);
            System.out.println(String.format("beanName:%s,别名:[%s]", beanName, String.join(",", aliases)));
        }

        System.out.println("spring容器中所有bean如下：");

        for (String beanName : classPathXmlApplicationContext.getBeanDefinitionNames()) {
            String[] aliases = classPathXmlApplicationContext.getAliases(beanName);
            System.out.println(String.format("beanName:%s,别名:[%s]", beanName, String.join(",", aliases)));
        }
    }
}


