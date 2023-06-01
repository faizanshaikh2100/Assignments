package com.example.SpringPractice.service.ServiceImpl;

import com.example.SpringPractice.model.Author;
import com.example.SpringPractice.repository.AuthorRepo;
import com.example.SpringPractice.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


public class AuthorServiceImpl implements AuthorService {

    @Autowired
    AuthorRepo authorRepo;
    @Override
    public List<Author> getAuthorsList() {
        return authorRepo.findAll();
    }

    @Override
    public Author createAuthor(Author author) {
        return authorRepo.save(author);
    }

    @Override
    public Author getAuthorById(Long depId) {
        return authorRepo.findById(depId).get();
    }
}
