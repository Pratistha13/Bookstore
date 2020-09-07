package com.example.Bookstore.web;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.Bookstore.domain.Book;

@Controller
public class BookController {
	
	@RequestMapping("/index")
	public String bookInfo(Model model) {
		ArrayList <Book> bookList = new ArrayList <Book>();
		
		Book book1 = new Book("Saaya", "Subin Bhattarai", 2015, 23456, 45.90);
		
		bookList.add(book1);	
				
		
		return "index";
		
	}

}
