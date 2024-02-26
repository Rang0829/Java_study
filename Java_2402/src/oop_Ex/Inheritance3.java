package oop_Ex;

class Point2 {
	int x;
	int y;
}

class CircleC {   // 포함
	Point2 p = new Point2();
	int r;
}


public class Inheritance3 {

	public static void main(String[] args) {
		CircleC c2 = new CircleC();
		c2.p.x = 1;
		c2.p.y = 2;
		c2.r = 3;
		System.out.println("c2.p.x = " + c2.p.x);
		System.out.println("c2.p.y = " + c2.p.y);
		System.out.println("c2.r = " + c2.r);
		
	}

}
