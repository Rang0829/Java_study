package loop_Ex;

import java.util.Scanner;

public class Continue2 {
	public static void main(String[] args) {

		int menu = 0;
		int num = 0;

		Scanner scanner = new Scanner(System.in);

		while (true) { // 무한 반복문
			System.out.println("(1) square");
			System.out.println("(2) square root");
			System.out.println("(3) log");
			System.out.print("원하는 메뉴(1~3)을 선택하세요. (종료 시, 0) : ");

			String tmp = scanner.nextLine(); // 화면에서 입력 받은 내용을 tmp에 저장한다.
			menu = Integer.parseInt(tmp); // 입력받은 문자열(tmp)을 숫자로 변환한다.

			if (menu == 0) {
				System.out.println("프로그램을 종료합니다.");
				break;
			} else if (!(1 <= menu && menu <= 3)) {
				System.out.println("메뉴를 잘못 선택하셨습니다. (종료 시, 0)");
				continue;
			}

			System.out.println("선택하신 메뉴는 " + menu + "번입니다.");
		}
	}
}
