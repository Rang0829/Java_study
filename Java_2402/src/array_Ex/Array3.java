package array_Ex;

// ctrl + shift + o 단축키는 자동으로 import문 추가
import java.lang.reflect.Array;
import java.util.Arrays;

public class Array3 {
	public static void main(String[] args) {
		  
		  int[] iArr = {100, 90, 80};
		  for (int i = 0; i < iArr.length; i++) {
			  System.out.println(iArr[i]);			  
		  }
		  
		  System.out.println(Arrays.toString(iArr));
	}
}