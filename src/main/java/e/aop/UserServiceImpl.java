package e.aop;

public class UserServiceImpl implements UserService {

    public void addUser() {
        System.out.println("add user");
    }

    public void updateUser() {
        System.out.println("update user");
    }

    public void deleteUser() {
        System.out.println("delete user");
    }
}
