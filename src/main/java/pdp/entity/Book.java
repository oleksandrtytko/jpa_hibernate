package pdp.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import lombok.Data;

import java.util.List;

@Data
@Entity
public class Book {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String name;
	private BookGanre bookGanre;


	@ManyToMany(cascade = CascadeType.PERSIST)
	@JoinTable(name = "book_to_author",
	joinColumns = @JoinColumn(name = "book_id", referencedColumnName = "id"),
	inverseJoinColumns = @JoinColumn(name = "author_id", referencedColumnName = "id"))
	private List<Author> authorList;
}
