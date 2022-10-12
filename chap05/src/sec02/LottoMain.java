package sec02;

import java.util.Scanner;

public class LottoMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Lotto lotto = new Lotto();
		int[] arr = new int[6];
		System.out.print("로또 번호를 입력해주세요. : ");
		for (int i = 0; i < 6; i++) {
			arr[i] = sc.nextInt();
		}
		lotto.lotto(arr);
		lotto.getAnswerNumber();

		System.out.print("로또 매크로 횟수 입력(0입력시 1등 나올때까지 반복) : ");
		int tmp = sc.nextInt();
		LottoAuto lottoAuto = new LottoAuto(tmp);

	}
}
