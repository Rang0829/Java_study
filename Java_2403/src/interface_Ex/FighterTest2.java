package interface_Ex;

abstract class Unit2 {
	int x, y;
	abstract void move(int x, int y);
	void stop() {System.out.println("멈춥니다.");}
}

interface Fightable2 {
	void move(int x, int y);   // public abstract 생략.
	void attack(Fightable f);  // public abstract 생략.
}

class Fighter2 extends Unit implements Fightable2 {
	// 오버라이딩 규칙 : 조상(public)보다 접근 제어자의 범위가 좁으면 안된다.
	public void move(int x, int y) {
		System.out.println("[" + x + ", " + y + " ]로 이동");
	}
	
	public void attack(Fightable f) {
		System.out.println(f + "를 공격");
	}
	
	// 싸울 수 있는 상대를 불러오는 메서드.
	Fightable getFightable() {
		Fightable f = new Fighter();
		return f;
	}
}

public class FighterTest2 {

	public static void main(String[] args) {
//		Fighter f = new Fighter();
//		Unit f = new Fighter(); // Unit에는 attack()이 없어서 호출 불가.
		Fighter2 f = new Fighter2();
		Fightable f2 = f.getFightable();
	}
}
