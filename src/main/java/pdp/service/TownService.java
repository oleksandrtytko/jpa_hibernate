package pdp.service;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pdp.entity.Country;
import pdp.entity.Town;
import pdp.repository.TownRepository;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
public class TownService {

	@Autowired
	private TownRepository repository;

	/*@PostConstruct
	private void initTowns() {
		Town town = new Town();
		town.setCountry(Country.UKRAINE);
		town.setName("Chernivtsi");

		Town town1 = new Town();
		town1.setCountry(Country.UK);
		town1.setName("London");

		Town town2 = new Town();
		town2.setCountry(Country.USA);
		town2.setName("Washington");

		repository.saveAll(Arrays.asList(town, town1, town2));

	}*/

	public List<Town> getAllTowns() {
		return StreamSupport.stream(repository.findAll().spliterator(), false)
				.collect(Collectors.toList());
	}

}
