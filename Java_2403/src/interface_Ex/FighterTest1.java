package interface_Ex;

abstract class Unit {
	int x, y;
	abstract void move(int x, int y);
	void stop() {System.out.println("멈춥니다.");}
}

interface Fightable {
	void move(int x, int y);   // public abstract 생략.
	void attack(Fightable f);  // public abstract 생략.
}

class Fighter extends Unit implements Fightable {
	// 오버라이딩 규칙 : 조상(public)보다 접근 제어자의 범위가 좁으면 안된다.
	public void move(int x, int y) {
		System.out.println("[" + x + ", " + y + "]로 이동");
	}
	
	public void attack(Fightable f) {
		System.out.println(f + "를 공격");
	}
}

public class FighterTest1 {

	public static void main(String[] args) {
		Fighter f = new Fighter();
		f.move(100, 200);
		Fighter f2 = new Fighter();
		f.attack(f2);
	}
}
