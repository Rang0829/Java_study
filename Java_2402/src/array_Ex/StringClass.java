package array_Ex;

public class StringClass {

	public static void main(String[] args) {
		String str = "ABCDE";
		char ch = str.charAt(4);
		String str2 = str.substring(1, 4);
		String str3 = str.substring(2);
		String str4 = str.substring(3, str.length());
		System.out.println(ch);
		System.out.println(str2);
		System.out.println(str3);
		System.out.println(str4);
	}
}
