package oop_Ex;

class MethodCall {
	public static void main(String args[]) {
		MyMath mm = new MyMath();
		long result1 = mm.add(5L, 3L);   // add 메서드를 호출한다.
		long result2 = mm.subtract(5L, 3L);
		long result3 = mm.multiply(5L, 3L);
		double result4 = mm.divide(5L, 3L);
		long result5 = mm.max(5, 3); // 둘 중에 큰 값을 반환하는 메서드.
		long result6 = mm.max2(5, 3);
		mm.printGugudan(3);   // 구구단 3단  출력
		
		System.out.println("add(5L, 3L) = " + result1);
		System.out.println("subtract(5L, 3L) = " + result2);
		System.out.println("multiply(5L, 3L) = " + result3);
		System.out.println("divide(5L, 3L) = " + result4);
		System.out.println("max(5, 3) = " + result5);	
		System.out.println("max2(5, 3) = " + result6);
	}
 }

 class MyMath {
	 
	void printGugudan (int dan) {
		if (!(2 <= dan && dan <= 9))
			return;
			
		for (int i = 1; i <= 9; i++) {
			System.out.printf("%d * %d = %d%n", dan, i, dan * i);
		}
		return; // 반환형이 void라면 생략이 가능하다.
	}
	long add(long a, long b) {
		long result = a + b;
		return result;  // 메서드 작업을 마치면 메서드를 호출한 곳으로 돌아간다.
	//	return a + b;	// 위의 두 줄을 이와 같이 한 줄로 간단히 할 수 있다.
	}
	
	long subtract(long a, long b) { return a - b; }
	long multiply(long a, long b) { return a * b; }
	double divide(double a, double b) {
		return a / b;
	}

		// 두 값을 받아서 둘 중에 큰 값을 반환하는 메서드를 작성해 보자.
	long max(long a, long b) {
		long result5 = 0;
		if (a > b) {
			result5 = a;
		} else {
			result5 = b;
		}
		return result5;
	}
	
	long max2 (long a, long b) {
		long result6 = 0;
		return a > b ? a : b; // 삼항 연산자
	}
	
	long max3 (long a, long b) {
		if (a > b)
			return a;   // 조건식이 참일 때만 실행하는 return
		else
			return b;   // 조건식이 거짓일 때 실행하는 return (거짓일 때도 return 꼭!!!)
	}

 }
