package loop_Ex;

public class Break1 {

	  public static void main(String[] args){

		  int sum = 0;
		  int i = 0;

		  while(true) {
		    if(sum > 100)
		      break; // 자신이 속한 하나의 반복문을 벗어난다.
		    ++i;
		    sum += i;
		  }

		  System.out.println("i=" + i);
		  System.out.println("sum=" + sum);
		  }
}
