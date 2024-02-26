package oop_Ex;

class Point {
	int x;
	int y;
}

class Circle extends Point {   // 상속
	int r;
}


public class Inheritance2 {

	public static void main(String[] args) {
		Circle c = new Circle();
		c.x = 1;
		c.y = 2;
		c.r = 3;
		System.out.println("c.x = " + c.x);
		System.out.println("c.y = " + c.y);
		System.out.println("c.r = " + c.r);
		
	}

}
