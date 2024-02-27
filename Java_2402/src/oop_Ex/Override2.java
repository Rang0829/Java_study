package oop_Ex;

class Point4 extends Object {
	int x;
	int y;
	
	Point4(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public String toString() {
	
		return "x : " + x + ", y : " + y;
	}
}


public class Override2 {
	public static void main(String[] args) {
		Point4 p = new Point4(3, 5);
		
//		Point4 p = new Point4();
//		p.x = 3;
//		p.y = 5;
		
		System.out.println(p);
		System.out.println(p.toString());
		System.out.println("p.x = " + p.x);
		System.out.println("p.y = " + p.y);
	}

}
