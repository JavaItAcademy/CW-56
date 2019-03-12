package com.company;

import java.util.Scanner;

public class Main {
    static int lastId = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Library library = new Library("National Library");
        initializeLibrary(library);
        boolean action = true;
        while(action){
            String title = sc.nextLine();
            System.out.println(library.getBooksByTitle(title));
            if (sc.nextLine().equals("0")){
                action = false;
            }
        }
        action = true;
        while(action){
            int year = sc.nextInt();
            System.out.println(library.getBooksByPublishYear(year));
            sc.nextLine();
            if (sc.nextLine().equals("0")){
                action = false;
            }
        }
        System.out.println(library.getAllBooks());
    }

    public static void initializeLibrary(Library library){
        library.addBook(new Book(lastId++, "Sunflower story",2004));
        library.addBook(new Book(lastId++, "Lord of the Rings",1993));
        library.addBook(new Book(lastId++, "Harry Potter",2000));
        library.addBook(new Book(lastId++, "It",1980));
        library.addBook(new Book(lastId++, "Little women",1931));
        library.addBook(new Book(lastId++, "Black holes",2004));

    }
}
