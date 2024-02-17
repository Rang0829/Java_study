package array_Ex;

import java.util.Arrays;

public class Array4 {
	public static void main(String[] args) {

		int[] iArr1 = new int[5];
		int[] iArr2 = new int[5];
//		int[] iArr3 = new int[] {100, 90, 80, 70, 60};
		int[] iArr3 = {100, 90, 80, 70, 60};
		char[] chArr = {'a', 'b', 'c', 'd'};
		
		for (int i = 0; i < iArr1.length; i++) {
			iArr1[i] = i + 1;
		}
		
		for (int i = 0; i < iArr2.length; i++) {
			iArr2[i] = (int)(Math.random() * 5) + 1;
		}
		
		// 배열에 저장된 값을 출력한다.
		for (int i = 0; i < iArr1.length; i++) {
			System.out.print(iArr1[i] + ",");
		}
		
		System.out.println();
		
		System.out.println(Arrays.toString(iArr2));
		System.out.println(Arrays.toString(iArr3));
		System.out.println(Arrays.toString(chArr));
		System.out.println(iArr1);
		System.out.println(iArr2);
		System.out.println(iArr3);
		System.out.println(chArr);		
	}
}