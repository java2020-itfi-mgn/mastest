package lesson14;

import java.io.Serializable;

class Human implements Serializable {
	private final String	family;
	private final String	name;
	private final String	patroname;

	public Human(String family, String name, String patroname) {
		this.family = family;
		this.name = name;
		this.patroname = patroname;
	}

	@Override
	public String toString() {
		return "Human [family=" + family + ", name=" + name + ", patroname=" + patroname + "]";
	}
	
	
}