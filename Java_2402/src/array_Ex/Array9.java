package array_Ex;

import java.util.Arrays;

public class Array9 {

	public static void main(String[] args) {
		// index : 0~3-1
		String[] strArr = {"가위", "바위", "보"};
		System.out.println(Arrays.toString(strArr));
		
		for (int i = 0; i < 5; i++) {
			int tmp = (int)(Math.random()*3);
		System.out.println(strArr[tmp]);   // 0~2
		}
	}
}
