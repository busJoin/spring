package d.bean;

import a.ioc.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBean {
    @Test
    public void demo02(){
        //1获取容器
        String xmlPath = "applicationContext.xml";
        ApplicationContext applicationContext =  new ClassPathXmlApplicationContext(xmlPath);
        //2获取内容
        User userId = applicationContext.getBean("userId", User.class);
        Person personId = applicationContext.getBean("personId", Person.class);
        System.out.println(userId);
        System.out.println(personId);

    }
}
