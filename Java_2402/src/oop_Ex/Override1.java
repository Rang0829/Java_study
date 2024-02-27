package oop_Ex;

class Point3 {
	int x;
	int y;
	String getLocation() {
		return "x : " + x + ", y : " + y;
	}
}

class Point3D extends Point3 {
	int z;
	
	// 조상의 getLocation()을 오버라이딩 한다.
	String getLocation() {
		return "x : " + x + ", y : " + y + ", z : " + z;
	}
}

public class Override1 {
	public static void main(String[] args) {
		Point3D p = new Point3D();
		p.x = 3;
		p.y = 5;
		p.z = 7;
		System.out.println(p.getLocation());
	}

}
