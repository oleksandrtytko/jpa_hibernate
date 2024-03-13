package pdp.service;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pdp.entity.Author;
import pdp.entity.Book;
import pdp.entity.BookGanre;
import pdp.repository.BookRepository;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
public class BookService {

	@Autowired
	private BookRepository repository;

	/*@PostConstruct
	public void test() {
		Author author1 = new Author();
		author1.setId(1);
		Author author2 = new Author();
		author2.setId(2);
		Author author3 = new Author();
		author3.setId(3);

		Book book = new Book();
		book.setName("Book 1");
		book.setBookGanre(BookGanre.SCIENCE);
		book.setAuthorList(Arrays.asList(author1, author2));

		Book book2 = new Book();
		book2.setName("Book 2");
		book2.setBookGanre(BookGanre.NOVEL);
		book2.setAuthorList(Arrays.asList(author2));

		Book book3 = new Book();
		book3.setName("Book 3");
		book3.setBookGanre(BookGanre.FANTASTIC);
		book3.setAuthorList(Arrays.asList(author2, author3));

		repository.saveAll(Arrays.asList(book, book2, book3));

	}*/

	public List<Book> getAllBooks() {
		return StreamSupport.stream(repository.findAll().spliterator(), false)
				.collect(Collectors.toList());
	}

	public void createBook(Book book) {
		repository.save(book);
	}
}
