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
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);
        BookServiceImpl bookService = (BookServiceImpl) applicationContext.getBean("bookServiceId");
        bookService.addBook();
        //要求：1.容器必须close，销毁方法执行; 2.必须是单例的
//		applicationContext.getClass().getMethod("close").invoke(applicationContext);
        // * 此方法接口中没有定义，实现类提供
        applicationContext.close();
    }

    @Test
    public void demo02(){
        //使用BeanFactory  --第一次调用getBean实例化
        String xmlPath = "applicationContext.xml";
        BeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource(xmlPath));
        BookService bookService = (BookService) beanFactory.getBean("bookServiceId");
        bookService.addBook();

    }
}
