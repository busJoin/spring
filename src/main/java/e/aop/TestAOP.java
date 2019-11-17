package e.aop;

import org.junit.Test;

public class TestAOP {
    @Test
    public void demo01(){
        UserService userService = MyBeanFacotry.createService();
        userService.addUser();
        userService.updateUser();
    }

    /**
     * cglib
     */
    @Test
    public void demo02(){
        UserServiceImpl userService = MyBeanFacotry.createService1();
        userService.addUser();
        userService.updateUser();
    }
}
