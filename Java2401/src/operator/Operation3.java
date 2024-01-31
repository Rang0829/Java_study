package operator;

public class Operation3 {

	public static void main(String[] args) {

		int gameScore = 150;
		int lastScore1 = ++gameScore;
		System.out.println("lastScore1 = ++gameScore 실행:: lastScore1 : "
				+ lastScore1 + ", gameScore : " + gameScore);
		 
		lastScore1 = gameScore++;
		System.out.println("lastScore1 = gameScore++ 실행:: lastScore1 : "
				+ lastScore1 + ", gameScore : " + gameScore);
		
		int lastScore2 = --gameScore;
		System.out.println("lastScore2 = --gameScore 실행:: lastScore2 : "
				+ lastScore2 + ", gameScore : " + gameScore);
			
		lastScore2 = gameScore--;
		System.out.println("lastScore2 = gameScore-- 실행:: lastScore2 : "
				+ lastScore2 + ", gameScore : " + gameScore);		
	}
}