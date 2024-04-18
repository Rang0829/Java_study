package Exception_Ex;

class MethodException1 {
	public static void main(String[] args) throws Exception {
		method1();	 // 같은 클래스내의 stati c멤버이므로 객체 생성없이 직접 호출 가능.
  	}	// main메서드의 끝.

	static void method1() throws Exception {
		method2();
	}	// method1의 끝.

	static void method2() throws Exception {
		throw new Exception();
	}	// method2의 끝.
}