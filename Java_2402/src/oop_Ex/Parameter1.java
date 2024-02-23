package oop_Ex;

class Data {
	int x;
}

class Parameter1 {
	public static void main(String[] args) {
		Data d = new Data();
		d.x = 10;
		System.out.println("main() : x = " + d.x);

		change(d.x);
		System.out.println("After change(d.x)");
		System.out.println("main() : x = " + d.x);
	}

	static void change(int x) { // 기본형 매개변수라서 읽기만 가능! 변경 불가.
		x = 1000;
		System.out.println("change() : x = " + x);
	}
}