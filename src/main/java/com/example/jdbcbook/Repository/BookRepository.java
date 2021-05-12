package com.example.jdbcbook.Repository;

import com.example.jdbcbook.Model.Book;

import java.sql.SQLException;
import java.util.List;

public interface BookRepository {
    public List<Book> getBooks() throws SQLException;

    public int saveBook(Book book) throws SQLException;

    public List<Book> getBookWithId(int id) throws SQLException;

    public void createTable(String tableName) throws SQLException;

}
