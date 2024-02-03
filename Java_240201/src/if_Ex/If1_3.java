package if_Ex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class If1_3 {
	
	public static void main(String[] args) throws IOException {
	
	BufferedReader inbr = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("성별을 입력하세요(M/F) : ");
	char gender = inbr.readLine().charAt(0);
	if (gender == 'F' || gender == 'f') {
		System.out.println("여성입니다.");
	}
	else {
		System.out.println("남성입니다.");
	}
	
	String a = new String("한");
	String b = new String("한");
	System.out.println(a==b);
	}
}