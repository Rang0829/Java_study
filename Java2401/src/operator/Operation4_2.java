package operator;

public class Operation4_2 {

	public static void main(String[] args) {
		
		int num = 10;
		boolean isEven;
		isEven = (num % 2 == 0) ? true : false;
// num을 2로 나누었을 때 나머지 값이 0이 나오면 짝수이기 때문에 나머지 연산자를 사용한다.
// 나머지 값이 0이면 참이라서 true 출력, 아니라면 거짓이라서 false 출력된다.
		System.out.println(isEven);
	}
}