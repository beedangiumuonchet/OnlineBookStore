package singleton;

import model.Book;

import java.util.ArrayList;
import java.util.List;

public class BookManager {
    private static BookManager instance;

    private List<Book> books;

    private BookManager() {
        books = new ArrayList<>();
    }

    public static BookManager getInstance() {
        if (instance == null) {
            instance = new BookManager();
        }
        return instance;
    }

    public void addBook(Book book) {
        books.add(book);
        Logger.getInstance().log("Book added to manager: " + book.getClass().getSimpleName());
    }

    public List<Book> getBooks() {
        return books;
    }
}

