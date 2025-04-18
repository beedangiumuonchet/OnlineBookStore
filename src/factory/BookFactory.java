package factory;

import model.AudioBook;
import model.Book;
import model.EBook;
import model.PaperBook;

public class BookFactory {
    public static Book createBook(String title, String author, int releaseYear, BookType type) {
        return switch (type) {
            case BookType.AUDIO -> new AudioBook(title, author, releaseYear, type);
            case BookType.EBOOK -> new EBook(title, author, releaseYear, type);
            case BookType.PAPER -> new PaperBook(title, author, releaseYear, type);
            default -> throw new IllegalArgumentException("Invalid book type");
        };
    }
}
