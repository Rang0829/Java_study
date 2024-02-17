package array_Ex;

public class Array5 {
	public static void main(String[] args) {

		int sum = 0;
		float average = 0f;
		
		int[] score = {100, 87, 100, 100, 90};
	
//		sum += score[0];
//		sum += score[1];
//		sum += score[2];
//		sum += score[3];
//		sum += score[4];
		
		for (int i = 0; i < score.length; i++) {
			sum += score[i];
		}
		
		average = sum / (float)score.length; // 계산 결과를 float형으로 받기 위해 형변환한다.
		
		System.out.println("총점 : " + sum);
		System.out.println("평균 : " + average);
	}
}
