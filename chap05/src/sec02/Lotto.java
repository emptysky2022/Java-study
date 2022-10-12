package sec02;

public class Lotto {
	// 답은 클래스 실행시 선언 후 바뀌지 않음
	private final int[] answer = new int[7];
	// 2등과 1등을 판별하는 보너스 정답 유무
	private boolean bonusNumber = false;

	// 생성자에서 답에 값 넣기
	public Lotto() {
		int[] tmp = new int[7];
		for (int i = 0; i < tmp.length; i++) {
			tmp[i] = (int) (Math.random() * 45) + 1;
		}
		tmp = sameNumberCheck(tmp);
		for (int i = 0; i < tmp.length; i++) {
			answer[i] = tmp[i];
		}

	}

	// 중복 번호 체크
	private int[] sameNumberCheck(int[] tmp) {
		for (int i = 0; i < tmp.length; i++) {
			int j = tmp.length - 1;
			while (j > i) {
				if (tmp[j] == tmp[i]) {
					tmp[j] = (int) (Math.random() * 45) + 1;
					continue;
				}
				j--;
			}
		}
		return tmp;
	}

	// 정답이 맞았는지 체크
	private int numberCheck(int[] arr) {
		int count = 0;
		for (int i = 0; i < answer.length - 1; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (answer[i] == arr[j]) {
					count++;
					break;
				}
			}
		}
		if (count == 6)
			return count;
		for (int i = 0; i < arr.length; i++) {
			if (answer[6] == arr[i]) {
				bonusNumber = true;
				count++;
				break;
			}
		}
		return count;
	}

	// 정답 번호 출력
	public void getAnswerNumber() {
		System.out.print("정답 번호는 ");
		for (int i = 0; i < answer.length - 1; i++) {
			System.out.print(answer[i] + " ");
		}
		System.out.println(" + 보너스 번호 " + answer[6] + "입니다!");
	}

	// 보너스 번호 맞췄는지 확인
	public boolean getBonusNumber() {
		return bonusNumber;
	}

	// 로또 실행 결과 출력
	public int lotto(int[] arr) {
		bonusNumber = false;
		int result = numberCheck(arr);
		switch (result) {
		case 6 -> {
			if (getBonusNumber())
				System.out.println("1등입니다!!");
			else
				System.out.println("2등입니다.");
		}
		case 5 -> System.out.println("3등입니다.");
		case 4 -> System.out.println("4등입니다.");
		case 3 -> System.out.println("5등입니다.");
		default -> System.out.println("꽝입니다.");
		}
		return result;
	}

}
