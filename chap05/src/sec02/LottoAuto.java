package sec02;

public class LottoAuto extends Lotto {
	int[] randomNum = new int[6]; // 반복해서 랜덤값 넣을 변수
	int[] resultCount = { 0, 0, 0, 0, 0, 0 }; // 등수 카운트
	int repeatCount = 0; // 메크로 반복 횟수
	int count = 0; // 입력 받을 반복 횟수
	Lotto lotto = new Lotto(); // 로또 클래스 생성

	// 생성자로 반복 횟수 받기
	public LottoAuto(int count) {
		this.count = count;
		if (count == 0)
			System.out.println("1등이 나올때까지 무한 실행");
		System.out.println(count + "번 실행");
		lottoMacro();
	}

	// 매크로 실행 메서드
	private void lottoMacro() {
		int tmp;
		if (count == 0) {
			while (true) {
				tmp = lotto.lotto(randomNumCreate());
				repeatCount++;
				switch (tmp) {
				case 6 -> {
					if (lotto.getBonusNumber())
						resultCount[0]++;
					else
						resultCount[1]++;
				}
				case 5 -> resultCount[2]++;
				case 4 -> resultCount[3]++;
				case 3 -> resultCount[4]++;
				default -> resultCount[5]++;
				}
				if (tmp == 6 && lotto.getBonusNumber())
					break;
			}
		} else {
			while (count > 0) {
				tmp = lotto.lotto(randomNumCreate());
				repeatCount++;
				switch (tmp) {
				case 6 -> {
					if (lotto.getBonusNumber())
						resultCount[0]++;
					else
						resultCount[1]++;
				}
				case 5 -> resultCount[2]++;
				case 4 -> resultCount[3]++;
				case 3 -> resultCount[4]++;
				default -> resultCount[5]++;
				}
				count--;
			}

		}
		lottoMacroResult();
	}

	// 매크로 돌릴때마다 새로운 랜덤값 넣기
	private int[] randomNumCreate() {
		for (int i = 0; i < randomNum.length; i++) {
			randomNum[i] = (int) (Math.random() * 45) + 1;
		}
		sameNumberCheck(randomNum);
		return randomNum;
	}

	// 랜덤값 넣을때 중복 체크
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

	// 매크로 종료 결과 출력
	private void lottoMacroResult() {
		System.out.println("로또 매크로 종료.\n매크로 결과 :\n총 반복 횟수 : " + repeatCount);
		for (int i = 0; i < resultCount.length - 1; i++) {
			System.out.println(i + 1 + "등 횟수 : " + resultCount[i]);
		}
		System.out.println("꽝 횟수 : " + resultCount[5]);
		lotto.getAnswerNumber();
	}
}
