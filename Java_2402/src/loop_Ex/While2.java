package loop_Ex;

public class While2 {

	  public static void main(String[] args) {

	    int sum = 0;
	    int i = 0; // 1을 1씩 증가시켜서 sum에 계속 더해나간다.

	    while(sum <= 100) {
	      System.out.printf("%d - %d%n", i, sum);
	      sum += ++i;
    }
  }
}