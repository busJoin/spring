package b.di;

import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class TestDI {
    @Test
    public void demo01(){
        //启动就会创建
        String xmlPath = "applicationContext.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);
        BookServiceImpl bookService = (BookServiceImpl) applicationContext.getBean("bookServiceId");
        bookService.addBook();
    }

    @Test
    public void demo02(){
        //使用BeanFactory  --第一次条用getBean实例化
        String xmlPath = "applicationContext.xml";
        BeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource(xmlPath));
        BookService bookService = (BookService) beanFactory.getBean("bookServiceId");
        bookService.addBook();

    }
}
