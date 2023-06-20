package com.codeclan.example;

import java.util.ArrayList;

public class Borrower {

    private ArrayList<Book> shelf;

    public Borrower() {
        this.shelf = new ArrayList<Book>();
    }

    public ArrayList getShelf() {
        return this.shelf;
    }

    public int getShelfTotal() {
        return this.shelf.size();
    }

    public void addToShelf(Book bookToAdd) {
        this.shelf.add(bookToAdd);
    }


    public void borrowBook(String titleOfBook, Library libraryToBorrowFrom){
        Book borrowedBook = libraryToBorrowFrom.removeBook(titleOfBook);
        addToShelf(borrowedBook);

    }
}
