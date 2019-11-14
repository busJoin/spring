package c.inject.c_factory;

public class MyBeanFactory {
    public UserService createService(){
        return new UserServiceImpl();
    }
}
