package pdp.service;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pdp.entity.Author;
import pdp.entity.Town;
import pdp.repository.AuthorRepository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
public class AuthorService {

	@Autowired
	private AuthorRepository repository;

	/*@PostConstruct
	private void init() {
		Author author = new Author();
		Town town = new Town();
		town.setId(1);
		author.setHomeTown(town);
		author.setName("Author 1");

		Author author2 = new Author();
		Town town2 = new Town();
		town2.setId(2);
		author2.setHomeTown(town2);
		author2.setName("Author 2");

		Author author3 = new Author();
		Town town3 = new Town();
		town3.setId(3);
		author3.setHomeTown(town3);
		author3.setName("Author 3");

		repository.saveAll(Arrays.asList(author, author2, author3));

	}*/

	public List<Author> getAllAuthors() {
		return StreamSupport.stream(repository.findAll().spliterator(), false)
				.collect(Collectors.toList());
	}
}
