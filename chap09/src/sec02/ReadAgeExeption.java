package sec02;

public class ReadAgeExeption extends Exception {
	public ReadAgeExeption() {
		super("유효하지 않은 나이가 입력되었습니다.");
	}
}
