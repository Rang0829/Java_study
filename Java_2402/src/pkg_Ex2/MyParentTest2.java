package pkg_Ex2;

import pkg_Ex1.MyParentTest;

class MyChild extends MyParentTest {
	public void printMembers() {
//		System.out.println(prv);  // 같은 클래스 벗어나서 에러.
//		System.out.println(dft);  // 같은 패키지 벗어나서 에러.
		System.out.println(prt);  // 다른 패키지더라도 자손이기 때문에 ok.
		System.out.println(pub);  // ok.
	}
}

public class MyParentTest2 {

	public static void main(String[] args) {
		MyParentTest p = new MyParentTest();
//		System.out.println(p.prv);   // 같은 클래스 벗어나서 에러.
//		System.out.println(p.dft);   // 같은 패키지 벗어나서 에러.
//		System.out.println(p.prt);   // 다른 패키지에 다른 클래스라서 에러.
		System.out.println(p.pub);   // ok.
	}
}
