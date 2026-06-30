package org.example.library_management.service;
import org.example.library_management.repository.BookRepository;

public class BookService {
    private BookRepository book;
    public void setBook(BookRepository bookRepo)
    {
        this.book = bookRepo;
    }
    public void displayServ(){
        System.out.println("the service is wrking....");
        book.displayRepo();
    }
}
