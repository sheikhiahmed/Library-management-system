package com.library.controllers;

import com.library.dtos.CreateBookRequest;
import com.library.dtos.SearchBookRequest;
import com.library.models.Book;
import com.library.services.BookService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BookController {
    @Autowired
    BookService bookService;
    @PostMapping("/book")
    public void createBook(@RequestBody @Valid CreateBookRequest createBookRequest){
        bookService.createOrUpdate(createBookRequest.to());
        // author -> book


    }
    @GetMapping("/book")
    public List<Book> getBooks(@RequestBody @Valid SearchBookRequest searchBookRequest) throws Exception {

        return bookService.find(
                searchBookRequest.getSearchKey(),
                searchBookRequest.getSearchValue()
        );

    }
}
