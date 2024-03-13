package pdp.repository;

import org.springframework.data.repository.CrudRepository;
import pdp.entity.Author;

public interface AuthorRepository extends CrudRepository<Author, Integer> {
}
