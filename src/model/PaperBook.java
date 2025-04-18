package model;

import factory.BookType;

public class PaperBook extends Book {
    public PaperBook(String title, String author, int releaseYear, BookType bookType) {
        super(title, author, releaseYear, bookType);
    }

    @Override
    public void display() {
        System.out.println("Paper model.Book");
        System.out.println(super.toString());
    }
}
