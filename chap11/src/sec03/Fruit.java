package sec03;

import java.util.Objects;

public class Fruit {
	private String name;

	public Fruit(String name) {
		this.name = name;
	}

//	@Override
//	public int hashCode() {
//		return Objects.hash(name);
//	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Fruit other = (Fruit) obj;
		return Objects.equals(name, other.name);
	}

	@Override
	public String toString() {
		return "Fruit [name=" + name + "]";
	}

}
