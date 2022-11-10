package exam.ex06;

public class Population {
	String name;
	double populate;

	public Population(String name, double populate) {
		super();
		this.name = name;
		this.populate = populate;
	}

	public String getName() {
		return name;
	}

	public double getPopulate() {
		return populate;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPopulate(double populate) {
		this.populate = populate;
	}

	@Override
	public String toString() {
		return name + "(" + populate + ")";
	}

}
