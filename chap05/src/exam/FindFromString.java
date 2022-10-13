package exam;

public class FindFromString {
	static int countChar(String s, char c) {
		int count = 0;

		// 나의 뻘짓

//		while (s.length() != 0) {
//			if (s.indexOf(c) != -1) {
//				count++;
//				s = s.substring(s.indexOf(c) + 1);
//				continue;
//			} else
//				break;
//		}

		// 문제에서 제시했던 charAt() 사용한 정답
		for (int i = 0; i < s.length(); i++) {
			if (c == s.charAt(i))
				count++;
		}

		return count;
	}

	public static void main(String[] args) {
		String s = "counting star";
		char c = 't';

		System.out.println(countChar(s, c));
	}
}
