package day_240724;

import java.util.Scanner;

public class RockScissorsPaperGame {

	public static void main(String[] args) {

		
		
		while (true) {
			System.out.println("가위, 바위, 보 중 하나를 입력하세요.");
			Scanner sc = new Scanner(System.in);

			int com = (int) (Math.random() * 3 + 1);
			String user = sc.nextLine();

			switch (com) {
			case 1:
				System.out.println("가위");
				if (user.equals("가위")) {
					System.out.println("비겼습니다.");
				} else if (user.equals("바위")) {
					System.out.println("이겼습니다.");
				} else if (user.equals("보")) {
					System.out.println("졌습니다.");
				}
				break;
				
			case 2:
				System.out.println("바위");
				if (user.equals("가위")) {
					System.out.println("졌습니다.");
				} else if (user.equals("바위")) {
					System.out.println("비겼습니다.");
				} else if (user.equals("보")) {
					System.out.println("이겼습니다.");
				}
				break;
				
			case 3:
				System.out.println("보");
				if (user.equals("가위")) {
					System.out.println("이겼습니다.");
				} else if (user.equals("바위")) {
					System.out.println("졌습니다.");
				} else if (user.equals("보")) {
					System.out.println("비겼습니다.");
				}
				break;
				
			}
			
			System.out.println("계속하시겠습니까?(Y/N)");
			String quit = sc.next();
			if (quit.equals("Y") || quit.equals("y"))
				continue;
			else {
				System.out.println("프로그램을 종료합니다.");
				break;
				
			}
		}

		
		
	}
}
