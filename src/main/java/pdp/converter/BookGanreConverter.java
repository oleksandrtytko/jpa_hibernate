package pdp.converter;

import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;
import pdp.entity.BookGanre;

import java.util.Arrays;

@Converter(autoApply = true)
public class BookGanreConverter implements AttributeConverter<BookGanre, Integer> {

	@Override
	public Integer convertToDatabaseColumn(BookGanre bookGanre) {
		if (bookGanre == null) {
			return null;
		}
		return bookGanre.getId();
	}

	@Override
	public BookGanre convertToEntityAttribute(Integer integer) {
		if (integer == null) {
			return null;
		}
		return Arrays.stream(BookGanre.values())
				.filter(t -> t.getId() == integer)
				.findFirst()
				.orElse(null);
	}
}
