package if_Ex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class If1_1 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader inbr = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("나이를 입력하세요. : ");
		int age = Integer.parseInt(inbr.readLine());
		
		if (age >= 8) {
			System.out.println("학교에 다닙니다.");
		}
		else {
			System.out.println("학교에 다니지 않습니다.");
		}
	}
}