package pdp.entity;

public enum Country {

	UKRAINE(0),
	UK(1),
	USA(2);

	int id;

	Country(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}
}
