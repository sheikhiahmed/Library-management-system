package com.library.controllers;

import com.library.dtos.CreateBookRequest;
import com.library.services.BookService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {
    @Autowired
    BookService bookService;
    @PostMapping("/book")
    public void createBook(@RequestBody @Valid CreateBookRequest createBookRequest){
        bookService.createOrUpdate(createBookRequest.to());
        // author -> book


    }
}
