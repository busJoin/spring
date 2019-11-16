package b.di;

public class BookDaoImpl implements  BookDao {
    public void addBook() {
        System.out.println("di add book");
    }

    public  void myInit(){
        System.out.println("初始化");
    }

    public void  myDestory(){
        System.out.println("销毁");
    }
}
