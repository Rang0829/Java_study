package Exception_Ex;

class TryCatch2 {
	public static void main(String[] args) {
			System.out.println(1);
			try {
				System.out.println(0/0);
				System.out.println(2); 	// 실행되지 않는다.
			} catch (ArithmeticException ae)	{
				System.out.println(3);
			}	// try-catch 끝.
			System.out.println(4);
	}	// main 메서드 끝.
}