package pdp.repository;

import org.springframework.data.repository.CrudRepository;
import pdp.entity.Author;
import pdp.entity.Book;

public interface BookRepository extends CrudRepository<Book, Integer> {
}
