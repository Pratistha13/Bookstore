package com.example.Bookstore;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.Bookstore.domain.Book;
import com.example.Bookstore.domain.BookRepository;
import com.example.Bookstore.domain.Category;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

public class BookRepositoryTest {
	
	@Autowired
    private BookRepository repository;

	@Test
	public void findByAuthorShouldReturnAuthor() {
		List<Book> books = repository.findByAuthor("Kateson");

		assertThat(books).hasSize(1);
		assertThat(books.get(0).getTitle()).isEqualTo("Business Rules 101");
	}

	@Test
	public void createNewBook() {

		Book books = new Book("Morning Day and Night", "Sidney Sheldon", 2001,"12-16-AA", 50.00, new Category("Novels"));
		repository.save(books);
		assertThat(books.getId()).isNotNull();
	}

}
