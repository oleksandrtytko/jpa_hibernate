package pdp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pdp.entity.Author;
import pdp.service.AuthorService;

import java.util.List;

@RestController
@RequestMapping("/author")
public class AuthorController {

	@Autowired
	private AuthorService service;

	@GetMapping
	private List<Author> getAllAuthors() {
		return service.getAllAuthors();
	}
}
