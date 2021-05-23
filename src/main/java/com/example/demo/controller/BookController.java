package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Book;

@RestController
@RequestMapping(value = "/books")
public class BookController {
	
	private List<Book> books=new ArrayList<Book>();
	
	/*
	 * http://localhost:8080/books/saveBook
	 {
	  "book_id":1,
	  "book_name":"Java-8",
	  "book_author":"Rajeev"
	 }
	 */
	@PostMapping(value = "/saveBook")
	public ResponseEntity<Book> saveBook(@RequestBody Book book)
	{
		books.add(book);
		return new ResponseEntity<Book>(book,HttpStatus.CREATED);
	}
	
	/*
	 * http://localhost:8080/books/allBooks
	 */
	@GetMapping(value = "/allBooks")
	public ResponseEntity<List<Book>> getAllBooks()
	{
	return new ResponseEntity<List<Book>>(books,HttpStatus.OK);
	}
	
	
	

}
