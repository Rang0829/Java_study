package loop_Ex;

import java.util.Scanner;

public class BreakName2 {
	  public static void main(String[] args){

		    int menu = 0;
		    int num = 0;

		    Scanner scanner = new Scanner(System.in);

		    outer:     // while문에 outer라는 이름을 붙인다.
		    while(true) { // 무한 반복문
		      System.out.println("(1) square");
		      System.out.println("(2) square root");
		      System.out.println("(3) log");
		      System.out.print("원하는 메뉴(1~3)을 선택하세요. (종료 시, 0) : ");

		      String tmp = scanner.nextLine();   // 화면에서 입력 받은 내용을 tmp에 저장한다.
		      menu = Integer.parseInt(tmp);   // 입력받은 문자열(tmp)을 숫자로 변환한다.

		      if(menu==0) {
		        System.out.println("프로그램을 종료합니다.");
		        break;
		      } else if (!(1 <= menu && menu <= 3)) {
		        System.out.println("메뉴를 잘못 선택하셨습니다. (종료 시, 0)");
		        continue;
		      }

		      for(;;) {   // 무한 반복문. while(true)로 변환 가능하다.
		        System.out.print("계산할 값을 입력해 주세요. (계산 종료 시, 0 / 전체 종료 시, 99) : ");
		          tmp = scanner.nextLine();   // 화면에서 입력받은 내용을 tmp에 저장한다.
		          num = Integer.parseInt(tmp);   // 입력받은 문자열(tmp)을 숫자로 변환한다.

		          if(num==0)   // 계산을 종료하여 for문을 벗어난다.
		            break;

		          if(num==99)   // 전체를 종료하여 for문과 while문을 벗어난다.
		            break outer;

		          switch(menu) {
		            case 1:
		              System.out.println("result = " + num * num);
		            case 2:
		              System.out.println("result = " + Math.sqrt(num));
		            case 3:
		              System.out.println("result = " + Math.log(num));
		              break;
		          }
		        } // for(;;)
		      } // while 끝
				System.out.println("프로그램이 종료되었습니다.");
		}
    } // main 끝