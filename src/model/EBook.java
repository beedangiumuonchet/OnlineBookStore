package model;

import factory.BookType;

public class EBook extends Book {
    public EBook(String title, String author, int releaseYear, BookType bookType) {
        super(title, author, releaseYear, bookType);
    }

    @Override
    public void display() {
        System.out.println("model.EBook");
        System.out.println(super.toString());
    }
}
