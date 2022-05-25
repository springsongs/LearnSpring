package io.github.springsongs;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RefTest {
    @Test
    public void testRef() {
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("classpath:/bean.xml");
        TeacherEntity teacherEntity = (TeacherEntity) classPathXmlApplicationContext.getBean("teacherEntity");
        System.out.println(teacherEntity);
    }
}
