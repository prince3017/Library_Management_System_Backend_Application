package com.example.Library_Management_System.Controller;

import com.example.Library_Management_System.DTO.BookRequestDto;
import com.example.Library_Management_System.Repository.AuthorRepository;
import com.example.Library_Management_System.Service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public class BookController {

    @Autowired
    AuthorRepository authorRepository;

    @Autowired
    BookService bookService;

    @PostMapping("/addbook")
    public String newBook(@RequestBody BookRequestDto book){
        bookService.addBook(book);
        return  "Book added successfully";

    }
}
