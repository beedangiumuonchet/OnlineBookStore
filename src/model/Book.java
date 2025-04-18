package model;

import factory.BookType;

public abstract class Book {
    private String title;
    private String author;
    private int releaseYear;
    private BookType bookType;

    public Book(String title, String author, int releaseYear, BookType bookType) {
        this.title = title;
        this.author = author;
        this.releaseYear = releaseYear;
        this.bookType = bookType;
    }

    public abstract void display();

    @Override
    public String toString() {
        return "model.Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", releaseYear=" + releaseYear +
                ", bookType=" + bookType +
                '}';
    }
}
