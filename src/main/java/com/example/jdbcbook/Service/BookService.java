package com.example.jdbcbook.Service;

import com.example.jdbcbook.Model.Book;
import com.example.jdbcbook.Repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLException;
import java.util.List;

@Service
public class BookService {

    @Autowired
    BookRepository bookRepository;
    public List<Book> getBooks() throws SQLException {
        return bookRepository.getBooks();
    }


    public int saveBook(@RequestBody Book book) throws SQLException {
        return bookRepository.saveBook(book);
    }


    public List<Book> getBookWithId(@RequestParam(value = "id") int id) throws SQLException {
        return bookRepository.getBookWithId(id);
    }


    public void createTable(@PathVariable String table_name) throws SQLException {
        bookRepository.createTable(table_name);
    }
}
