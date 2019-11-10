package a_ioc;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestIoC {
    @Test
    public void demo02(){
        //1获取容器
        String xmlPath = "applicationContext.xml";
        ApplicationContext applicationContext =  new ClassPathXmlApplicationContext(xmlPath);
        //2获取内容
        UserService userService = (UserService) applicationContext.getBean("userServiceId");
        userService.addUser();
    }

}
