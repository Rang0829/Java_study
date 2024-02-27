package pkg_Ex1;

public class MyParentTest { // 접근 제어자 public (소스 파일 이름과 일치)
	private int prv;   // 같은 클래스.
			int dft;   // 같은 패키지.
	protected int prt; // 같은 패키지 + 자손(다른 패키지).
	public int pub;    // 접근 제한 X
	
	public void printMembers() {
		System.out.println(prv);  // ok.
		System.out.println(dft);  // ok.
		System.out.println(prt);  // ok.
		System.out.println(pub);  // ok.
	}
}

class MyParent {   // 접근 제어자 default

	public static void main(String[] args) {
		MyParentTest p = new MyParentTest();
//		System.out.println(p.prv);   // 같은 클래스 벗어나서 에러.
		System.out.println(p.dft);   // ok.
		System.out.println(p.prt);   // ok.
		System.out.println(p.pub);   // ok.

	}

}
