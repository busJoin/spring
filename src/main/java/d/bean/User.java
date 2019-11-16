package d.bean;

public class User {
    private Integer id;
    private String username;
    private Integer age;
    public User(Integer id,String username){
        super();
        this.id = id;
        this.username = username;
    }

    public User(String username,Integer age){
        super();
        this.username = username;
        this.age = age;
    }
}
