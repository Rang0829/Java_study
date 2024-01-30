package cha;

public class Double2 {

	public static void main(String[] args) {
		
		double dnum = 1;
		
		for(int i = 0; i < 10000; i++) { // 더하기를 10,000번 반복한다.
			dnum = dnum + 0.1;
		}
		System.out.println(dnum);
	}
}
