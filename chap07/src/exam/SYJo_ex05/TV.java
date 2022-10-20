package exam.SYJo_ex05;

public class TV extends Controller {

	public TV(boolean power) {
		super(power);
	}

	@Override
	String getName() {
		return "TV";
	}

}
