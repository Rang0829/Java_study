package if_Ex;

import java.util.Scanner;

public class If3 {
	
	public static void main(String[] args) {
		
		int score = 0; // 점수 저장 변수.
		char grade = 'D'; // 학점 저장 변수. 'D'를 저장하면 else 생략이 가능하다.
		
		System.out.println("점수를 입력해 주세요. : ");
		Scanner scanner = new Scanner(System.in);
		score = scanner.nextInt();
// 화면을 통해 입력받은 숫자를 score에 저장한다.
		
		if (score >= 90) {
			grade = 'A';
		} else if (score >= 80) {
			grade = 'B';
		} else if (score >= 70) {
			grade = 'C';
		}
//			else {
//			grade = 'D';
//		}
		System.out.println("당신의 학점은 " + grade + "입니다.");
	}

}
