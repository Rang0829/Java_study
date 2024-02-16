package loop;

import java.util.Scanner;

	public class While_Ex3 {
		public static void main(String[] args) {

		int num = 0;
		int sum = 0;
		System.out.print("숫자를 입력하세요.(예:12345) : ");

		Scanner scanner = new Scanner(System.in);
		String tmp = scanner.nextLine();
		num = Integer.parseInt(tmp);

		while (num != 0) {
			sum += num % 10;
			System.out.printf("sum = %3d num = %d%n", sum, num);

			num /= 10;
		}

		System.out.println("각 자리 수의 합 : " + sum);

		int i = 0; // 1을 1씩 증가시켜서 sum에 계속 더해나간다.

		while (sum <= 100) {
			System.out.printf("%d - %d%n", i, sum);
			sum += ++i;
		}
	}
}