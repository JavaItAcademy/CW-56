package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Library {
    private HashMap<Integer, Book> books;

    private String title;
    private String address;

    public Library(String title) {
        this.title = title;
        books = new HashMap<>();
    }

    public HashMap<Integer, Book> getBooks() {
        return books;
    }

    public void setBooks(HashMap<Integer, Book> books) {
        this.books = books;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public boolean addBook (Book book){
        Book oldBook = this.books.put(book.getId(),book);
        return oldBook == null;
    }

    public List<Book> getAllBooks () {
        return new ArrayList<>(books.values()) ;
    }

    public List<Book> getBooksByTitle(String title) {
        ArrayList<Book> result = new ArrayList<>();
        for (Book book : books.values()) {
            if (book.getTitle().toLowerCase().equals(title.toLowerCase())){
                result.add(book);
            }
        }
        return result;
    }
    public List<Book> getBooksByPublishYear(int year) {
        ArrayList<Book> result = new ArrayList<>();
        for (Book book : books.values()) {
            if (book.getPublishYear() == year){
                result.add(book);
            }
        }
        return result;
    }
}
