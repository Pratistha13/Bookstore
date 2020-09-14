package com.example.Bookstore;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.Bookstore.domain.Book;
import com.example.Bookstore.domain.BookRepository;

@SpringBootApplication
public class BookstoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookstoreApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner demo(BookRepository repository) {
		return (args)-> {
			Book b1 = new Book("Saaya", "Subin",2015, "DESF678", 23.78);
			Book b2 = new Book("Maya", "Bhairab",2007, "BASF965", 30.00);
			Book b3 = new Book("Captain", "Jack", 1987, "JACSP8", 19.90);
			
			repository.save(b1);
			repository.save(b2);
			repository.save(b3);
			
		};
	}

}
