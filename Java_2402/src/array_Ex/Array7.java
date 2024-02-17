package array_Ex;

import java.util.Arrays;

public class Array7 {

	public static void main(String[] args) {
		
		int[] numArr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
		System.out.println(Arrays.toString(numArr));
		
		for (int i = 0; i < numArr.length; i++) {
			int n = (int)(Math.random() * 10); // 0~9 중에 하나의 값을 임의로 출력한다.
			int tmp = numArr[i];
			numArr[i] = numArr[n];
			numArr[n] = tmp;
		}
		System.out.println(Arrays.toString(numArr));
	}
}