package e.aop;

import org.junit.Test;

public class TestAOP {
    @Test
    public void demo01(){
        UserService userService = MyBeanFacotry.createService();
        userService.addUser();
        userService.updateUser();
    }
}
