package b.di;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDI {
    @Test
    public void demo01(){
        String xmlPath = "applicationContext.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);
        BookServiceImpl bookService = (BookServiceImpl) applicationContext.getBean("bookServiceId");
        bookService.addBook();
    }
}
