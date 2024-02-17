package array_Ex;

public class Array6 {

	public static void main(String[] args) {
		
		int[] score = {79, 88, 91, 34, 100, 55, 96};
		
		int max = score[0];   // 배열의 첫번째 값으로 최대값을 초기화 한다.
		int min = score[0];   // 배열의 첫번째 값으로 최소값을 초기화 한다.
		
		for (int i = 1; i < score.length; i++) {   // 배열의 두번째 인덱스부터 읽기 위해 변수 i의 값을 1로 초기화 한다.
			if (score[i] > max) {
				max = score[i];
			} else if (score[i] < min) {
				min = score[i];
			}
		} // for 끝

		System.out.println("최대값 : " + max);
		System.out.println("최소값 : " + min);
	}
}