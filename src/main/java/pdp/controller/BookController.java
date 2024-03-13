package pdp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pdp.entity.Book;
import pdp.service.BookService;

import java.util.List;

@RestController
@RequestMapping("/book")
public class BookController {

	@Autowired
	private BookService service;

	@GetMapping
	public List<Book> getAllBooks() {
		return service.getAllBooks();
	}

	@PostMapping
	public void createBook(@RequestBody Book book) {
		service.createBook(book);
	}
}
