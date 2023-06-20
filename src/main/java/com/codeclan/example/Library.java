package com.codeclan.example;

import java.util.ArrayList;

public class Library {
    private ArrayList<Book> bookCatalogue;
    private int capacity;

    public Library(int inputCapacity) {
        this.bookCatalogue = new ArrayList<Book>();
        this.capacity = inputCapacity;
    }

    public int getBookCount() {
        int numberOfBooks = this.bookCatalogue.size();
        return numberOfBooks;
    }

    public void addBook(Book bookToAdd) {
        if (this.getBookCount() < this.capacity) {
            this.bookCatalogue.add(bookToAdd);
        } else {
            System.out.println("Capacity reached - there's no space for '"+bookToAdd.title+"' in this library! :^(");
        }

    }

    public Book removeBook(String titleOfBook) {
        for (Book bookInLoop : this.bookCatalogue) {
        if (bookInLoop.getTitle() == titleOfBook) {
            this.bookCatalogue.remove(bookInLoop);
            return bookInLoop;
        }
        }
        System.out.println("Sorry, '"+titleOfBook+"' is not in the library catalogue.");
        return null;
    }


}
