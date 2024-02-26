package oop_Ex;

class OriginalTv {   // 멤버 5개
	boolean power; // 전원상태(on/off)
	int channel;	// 채널

	void power()       {   power = !power; }
	void channelUp()   {   ++channel;      }
	void channelDown() {   --channel;      }
}

class SmartTv extends OriginalTv {  // SmartTv는 Tv에 캡션(자막)을 보여주는 기능을 추가
	// 부모 멤버 5개 + 자식 멤버 2개 = 7개
	boolean caption;     // 캡션상태(on/off)
	void displayCaption(String text) {
		if (caption) {   // 캡션 상태가 on(true)일 때만 text를 보여 준다.
			System.out.println(text);
		}
	}
}

class Inheritance1 {
	public static void main(String args[]) {
		SmartTv stv = new SmartTv();  // SmartTv 객체 생성.
		stv.channel = 10;			// 조상 클래스로부터 상속받은 멤버
		stv.channelUp();			// 조상 클래스로부터 상속받은 멤버
		System.out.println(stv.channel);
		stv.displayCaption("Hello, World!");
		stv.caption = true;	// 캡션(자막) 기능을 켠다.	       
		stv.displayCaption("Hello, World!");
	}
}