package com.library.services;

import com.library.models.Author;
import com.library.models.Book;
import com.library.models.Genre;
import com.library.repositories.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class BookService {
    @Autowired
    AuthorService authorService;
    @Autowired
    BookRepository bookRepository;
    public void createOrUpdate(Book book) {
        Author bookAuthor = book.getMy_author();
        // will have the primaryKey
        Author saveAuthor = authorService.getOrCreate(bookAuthor);
        //map the author to the book
        book.setMy_author(saveAuthor);
        bookRepository.save(book);
    }
    public List<Book> find(String searchKey, String searchValue) throws Exception {

        switch (searchKey){
            case "id": {
                Optional<Book> book = bookRepository.findById(Integer.parseInt(searchValue));
                if(book.isPresent()){
                    return Arrays.asList(book.get());
                }else{
                    return new ArrayList<>();
                }
            }
            case "genre":
                return bookRepository.findByGenre(Genre.valueOf(searchValue));
            case "author_name":
                return bookRepository.findByAuthor_Name(searchValue);
            case "name":
                return bookRepository.findByName(searchValue);
            default:
                throw new Exception("Search key not valid " + searchKey);
        }
    }
}
