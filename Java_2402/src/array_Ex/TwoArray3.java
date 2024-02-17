package array_Ex;

import java.util.Scanner;

public class TwoArray3 {

	public static void main(String[] args) {

		String[][] words = {
				{"chair", "의자"},      // words[0][0], words[0][1]
				{"computer", "컴퓨터"}, // words[1][0], words[1][1]
				{"integer", "정수"}    // words[2][0], words[2][1]
		};
		
		Scanner scanner = new Scanner(System.in); // 입력한 정답 한 줄을 받는다.
		
		for (int i = 0; i < words.length; i++) {
			System.out.printf("Q%d. %s의 뜻은?", i + 1, words[i][0]);
			// %d는 숫자 정수 출력 지시자, %s는 문자열 출력 지시자.
			
			String tmp = scanner.nextLine();
			
			if (tmp.equals(words[i][1])) {
				System.out.printf("정답입니다.%n%n");
				// %n은 줄바꿈 지시자.
			} else {
				System.out.printf("틀렸습니다. 정답은 %s입니다.%n%n", words[i][1]);
			}
		}
	}
}
