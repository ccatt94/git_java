package day_240729;

import java.util.Scanner;

class RockScissorsPaper{
	
	
	
}

public class RockScissorsPaperArray {

	public static void main(String[] args) {

		String[] str = { "가위", "바위", "보" };
		System.out.println("컴퓨터와 가위 바위 보 게임을 합니다.");

		Scanner sc = new Scanner(System.in);
		System.out.print("가위 바위 보!>>");
		
		String user = sc.nextLine();
		int com = (int) (Math.random() * 3 + 1);
		

		switch (com) {
		case 1:
			System.out.println("사용자 = " + user + ", 컴퓨터 = 가위");
			if (user.equals("가위")) {
				System.out.print("비겼습니다.");
			} else if (user.equals("바위")) {
				System.out.print("컴퓨터가 이겼습니다.");
			} else if (user.equals("보")) {
				System.out.print("사용자가 이겼습니다.");
			}
			break;

		case 2:
			System.out.println("사용자 = " + user + ", 컴퓨터 = 바위");
			if (user.equals("가위")) {
				System.out.println("사용자가 이겼습니다.");
			} else if (user.equals("바위")) {
				System.out.println("비겼습니다.");
			} else if (user.equals("보")) {
				System.out.println("컴퓨터가 이겼습니다.");
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

//		System.out.println("계속하시겠습니까?(Y/N)");
//		String quit = sc.next();
//		if (quit.equals("Y") || quit.equals("y")) 
//			
//		
//		else 
//			System.out.println("프로그램을 종료합니다.");
			
		
	}

}
