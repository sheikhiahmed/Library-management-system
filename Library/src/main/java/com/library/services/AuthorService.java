package com.library.services;

import com.library.models.Author;
import com.library.repositories.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthorService {
    @Autowired
    AuthorRepository authorRepository;
    public Author getOrCreate(Author author){
        //map the author to the book
        Author authorRetrieved = authorRepository.findByEmail(author.getEmail());
        if(authorRetrieved == null){
            authorRetrieved = authorRepository.save(author);
        }
        return authorRetrieved;
    }
}
