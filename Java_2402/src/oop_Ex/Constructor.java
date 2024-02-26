package oop_Ex;

class Data_1 {
	int value;
//  Data_1() {} // 기본 생성자가 자동으로 추가돼 있지만 수동 추가를 습관화하자.
}

class Data_2 {
	int value;

    Data_2() {} // 기본 생성자 생성.
	Data_2(int x) {   // 매개변수가 있는 생성자.
		value = x;
	}
}

class Constructor {
	public static void main(String[] args) {
		Data_1 d1 = new Data_1();
		Data_2 d2 = new Data_2();
// 생성자 호출. 매개 변수가 있는 생성자가 있어도 기본 생성자를 호출하기 때문에 없으면 compile error 발생.
	}
}