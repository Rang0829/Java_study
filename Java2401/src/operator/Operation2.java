package operator;

public class Operation2 {

  public static void main(String[] args) {

      int mathScore = 90;
      int engScore = 70;
		
	  int totalScore = mathScore + engScore; // 총점을 구한다.
	  System.out.println(totalScore);
		
	  double avgScore = totalScore / 2.0; // 평균을 구한다.
	  System.out.println(avgScore);
		
	  int korScore = 80;
		
      int totalScore2 = mathScore + engScore + korScore; // 총점을 구한다.
	  System.out.println(totalScore2);
		
      double avgScore2 = totalScore2 / 3.0; // 평균을 구한다.
	  System.out.println(avgScore2);
	}
}