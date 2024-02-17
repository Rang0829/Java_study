package array_Ex;

import java.util.Arrays;

public class Array8 {

	public static void main(String[] args) {
		// index는 0~45-1로 0~44
		int[] ball = new int[45];   // 45개의 정수 값 저장하기 위해 초기화 한다.
		
		// 배열의 각 요소에 1~45 값을 저장한다.
		for (int i = 0; i < ball.length; i++)
			ball[i] = i + 1;   // ball[0]에 1이 저장돼서 1부터 값이 시작된다.
		System.out.println(Arrays.toString(ball));
		
		int tmp = 0;   // 두 값을 바꾸는데 사용할 임시 변수.
		int j = 0;     // 임의의 값을 얻어서 저장할 변수.
		
		// 배열의 i번째 요소와 임의의 ㅛㅇ소에 저장된 값을 서로 바꿔서 값을 출력한다.
		// 0번째부터 5번째 요소까지 모두 6개만 바꾼다.		
		for (int i = 0; i < 6; i++) {
			j = (int)(Math.random() * 45);
			tmp = ball[i];
			ball[i] = ball[j];
			ball[j] = tmp;
			System.out.println(Arrays.toString(ball));
		}
		
		// 배열 ball의 앞에서부터 6개의 요소를 출력한다.
		for (int i = 0; i < 6; i++)
			System.out.printf("ball[%d]=%d%n", i, ball[i]);			
	}
}
