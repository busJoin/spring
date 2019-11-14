package c.inject.b_static_factory;

import b.di.BookService;
import b.di.BookServiceImpl;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class TestFactory {
    @Test
    public void demo01(){
        //spring静态工厂
        String xmlPath = "applicationContext.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);
        UserService userService = applicationContext.getBean("userServiceIdFactory", UserService.class);
        userService.addUser();
    }

    @Test
    public void demo02(){

    }

}
