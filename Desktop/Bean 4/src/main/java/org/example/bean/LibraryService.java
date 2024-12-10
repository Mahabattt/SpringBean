package org.example.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class LibraryService {
    private final Author author;
    private final Publisher publisher;
    private final Book book;

    @Autowired
    public LibraryService(Author author, Publisher publisher, Book book){
        this.author = author;
        this.publisher = publisher;
        this.book = book;
    }
    public void displayLibraryInfo(){
        System.out.println("Author: " + author);
        System.out.println("Publisher: " + publisher);
        System.out.println("Book:" + book);
    }

}
