package operator;

public class Operation1 {
	
	public static void main(String[] args) {

		int myAge = 23;
		int teacherAge = 38;
		
		boolean value = (myAge > 25); // myAge에 대입된 23이 25보다 크다?
		System.out.println(value); // 위의 식이 참이면 true, 거짓이면 false가 출력된다.
		
		System.out.println(myAge <= 25); // myAge에 대입된 23이 25보다 작거나 같다는 식이 참이면 true, 거짓이면 false가 출력된다.
		System.out.println(myAge == teacherAge); // myAge에 대입된 23과 teacherAge에 대입된 38이 동일한 값이라는 식이 참이면 ture, 거짓이면 false가 출력된다.
		
		char ch; // char에 변수 ch을 선언한다.
		ch = (myAge > teacherAge) ? 'T' : 'F'; // teacherAge보다 myAge 값이 크다?
		
		System.out.println(ch); // 위의 식이 참이면 T(왼쪽 항), 거짓이면 F(오른쪽 항)가 출력된다.
	}

}