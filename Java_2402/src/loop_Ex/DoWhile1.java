package loop_Ex;

import java.util.Scanner;

	public class DoWhile1 {
		public static void main(String[] args) {

	    int input = 0;
	    int answer = 0;

	    answer = (int)(Math.random() * 100) + 1;
	// 1~100 사이의 임의의 수를 저장한다.
	    Scanner scanner = new Scanner(System.in);

	    do {
	      System.out.print("1과 100 사이의 정수를 입력해 주세요. : ");
	      input = scanner.nextInt();

	      if (input > answer) {
	        System.out.println("더 작은 수로 다시 시도해 주세요.");
	      } else if (input < answer) {
	        System.out.println("더 큰 수로 다시 시도해 주세요.");
	      }
	    } while (input != answer);

	      System.out.println("정답입니다.");
	  }
	}