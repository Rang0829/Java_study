package if_Ex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class If2_2 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader inbr = new BufferedReader(new InputStreamReader(System.in));
				System.out.print("점수를 입력하세요 : ");
		int score = Integer.parseInt(inbr.readLine());
		char grade;
		
		grade = (score >= 90 ? 'A' : (score >= 80 ? 'B': (score >= 70 ? 'C' : (score >= 60 ? 'D' :'F'))));

		System.out.println("성적은 " + score + "이고, 학점은 " + grade + "입니다.");
	}
}