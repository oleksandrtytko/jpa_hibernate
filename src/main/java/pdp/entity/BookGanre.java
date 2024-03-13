package pdp.entity;

public enum BookGanre {

	SCIENCE(0, "science"),
	NOVEL(1, "novel"),
	FANTASTIC(2, "fantastic");

	int id;
	String name;

	BookGanre(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}
}
