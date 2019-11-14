package c.inject.c_factory;

import c.inject.b_static_factory.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestFactory {
    @Test
    public void demo01(){
        //spring静态工厂
        String xmlPath = "applicationContext.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);
        UserService userService = applicationContext.getBean("userServiceByFactory", UserService.class);
        userService.addUser();
        userService.addUser();
    }


}
