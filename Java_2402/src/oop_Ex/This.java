package oop_Ex;

class This {
	static {
		System.out.println("static { }");
	}

	{
		System.out.println("{ }");
	}

	public This() {
		System.out.println("this");
	}

	public static void main(String args[]) {
		System.out.println("This bt = new This; ");
		This bt = new This();

		System.out.println("This bt2 = new This(); ");
		This bt2 = new This();
	}
}