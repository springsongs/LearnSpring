package io.github.springsongs.springsongs;


import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloWorldTest {
    @Test
    public void show() {
        String beanXml = "classpath:/bean.xml";
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext(beanXml);
        HelloWorld helloWorld = classPathXmlApplicationContext.getBean("helloWorld", HelloWorld.class);
        helloWorld.sayHello();
    }
}
