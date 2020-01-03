package com.booklet.spring.dao;

import java.util.List;

import com.booklet.spring.models.Book;

public interface BookDAO {
	//save the record
	long save(Book book);
    
	//get a single record
	Book get(long id);
    
	//get all record
	List<Book> list();
    
	//update the record
	void update(long id, Book book);
    
	//delete a record
	void delete(long id);
}