package if_Ex;

public class SwitchCase1 {

  public static void main(String[] args) {
    int ranking = 1; // 정수형 변수 ranking에 1을 대입한다.
	char medalColor; // 문자형 변수 medalColor를 선언한다.
		
	switch(ranking) {
 	  case 1 : medalColor = 'G';
	  		  break;
	  case 2 : medalColor = 'S';
			  break;
	  case 3 : medalColor = 'B';
			  break;
	  default :
			  medalColor = 'A';
	  }
	  System.out.println(ranking + "등 메달의 색깔은 " + medalColor + "입니다.");
	}
}