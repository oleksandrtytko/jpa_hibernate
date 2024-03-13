package pdp.repository;

import org.springframework.data.repository.CrudRepository;
import pdp.entity.Town;

public interface TownRepository extends CrudRepository<Town, Integer> {
}
