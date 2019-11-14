package a.ioc;

/**
 * @author chang
 */
public class UserServiceImpl implements UserService {

    public void addUser() {
        System.out.println("添加用户的方法");
    }
    public UserServiceImpl(){
        System.out.println("add");
    }
}
