package model;

import factory.BookType;

public class AudioBook extends Book {
    public AudioBook(String title, String author, int releaseYear, BookType bookType) {
        super(title, author, releaseYear, bookType);
    }

    @Override
    public void display() {
        System.out.println("Audio model.Book");
        System.out.println(super.toString());
    }
}
