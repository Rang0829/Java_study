package array_Ex;

public class Array2 {
	  public static void main(String[] args) {
	// index 범위는 0~n-1
	int[] arr = new int[6]; // 길이가 n인 int 배열 arr을 생성.
	System.out.println("arr.length=" + arr.length);
	
	for (int i = 0; i < arr.length; i++) {
		System.out.println("arr[" + i + "]=" + arr[i]);
		}
	}
}
