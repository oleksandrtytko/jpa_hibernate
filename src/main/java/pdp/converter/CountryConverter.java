package pdp.converter;

import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;
import pdp.entity.BookGanre;
import pdp.entity.Country;

import java.util.Arrays;

@Converter(autoApply = true)
public class CountryConverter implements AttributeConverter<Country, Integer> {

	@Override
	public Integer convertToDatabaseColumn(Country country) {
		if (country == null) {
			return null;
		}
		return country.getId();
	}

	@Override
	public Country convertToEntityAttribute(Integer integer) {
		if (integer == null) {
			return null;
		}
		return Arrays.stream(Country.values())
				.filter(c -> c.getId() == integer)
				.findFirst()
				.orElse(null);
	}
}
