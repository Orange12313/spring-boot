package com.lch.springboot;
import com.lch.config.stuConfig;
import com.lch.student.student;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest
class ApplicationTests {

    @Test
    void test(){
        ApplicationContext context = new AnnotationConfigApplicationContext(stuConfig.class);
        student stu = context.getBean("student", student.class);
        System.out.println(stu);
    }

}
