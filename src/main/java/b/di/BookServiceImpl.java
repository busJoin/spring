package b.di;

public class BookServiceImpl implements BookService {
    private BookDao bookDao;

    public void setBookDao(BookDao bookDao) {
        System.out.println("set bookDao");
        this.bookDao = bookDao;
    }

    public void addBook() {
        bookDao.addBook();
    }
}
