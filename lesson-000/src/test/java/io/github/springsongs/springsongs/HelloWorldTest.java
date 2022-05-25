package io.github.springsongs.springsongs;

import org.junit.Test;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class HelloWorldTest {
    @Test
    public void testHelloWorld(){
        XmlBeanFactory xmlBeanFactory=new XmlBeanFactory(new ClassPathResource("bean.xml"));
        HelloWorld helloWorld= (HelloWorld) xmlBeanFactory.getBean("helloWorld");
        helloWorld.getMsg();
    }
}
