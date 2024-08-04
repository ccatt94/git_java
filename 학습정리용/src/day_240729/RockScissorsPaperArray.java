package day_240729;

import java.util.Scanner;

class RspPlayer {
	private String name, rsp;
	public static final String[] rspArr = { "가위", "바위", "보" };

	RspPlayer(String name) {
		this.name = name;
		int num = (int) (Math.random() * 3);
		rsp = rspArr[num];
	}

	RspPlayer(String name, String rsp) {
		this.name = name;
		this.rsp = rsp;
	}

	public void getResult(RspPlayer player) {

		System.out.print(player.name + " = " + player.rsp + ", " + this.name + " = " + this.rsp + ", ");

		if (this.rsp.equals(player.rsp)) {
			System.out.println("비겼습니다.");
			return;
		}

		if (player.rsp.equals("가위")) {

			if (this.rsp.equals("바위")) {
				System.out.println(this.name + "가 이겼습니다.");
			} else if (this.rsp.equals("보")) {
				System.out.println(player.name + "가 이겼습니다.");
			}

		}

		if (player.rsp.equals("바위")) {

			if (this.rsp.equals("보")) {
				System.out.println(this.name + "가 이겼습니다.");
			} else if (this.rsp.equals("가위")) {
				System.out.println(player.name + "가 이겼습니다.");
			}

		}

		if (player.rsp.equals("보")) {

			if (this.rsp.equals("가위")) {
				System.out.println(this.name + "가 이겼습니다.");
			} else if (this.rsp.equals("바위")) {
				System.out.println(player.name + "가 이겼습니다.");
			}

		}

	}

}

public class RockScissorsPaperArray {

	public static void main(String[] args) {

		System.out.println("컴퓨터와 가위 바위 보 게임을 합니다.");

		while (true) {

			RspPlayer computer = new RspPlayer("컴퓨터");
			RspPlayer user;

			Scanner sc = new Scanner(System.in);

			System.out.print("가위 바위 보!>>");
			String rsp = sc.nextLine();
			user = new RspPlayer("사용자", rsp);

			computer.getResult(user);

			System.out.println("그만하시겠습니까? 그만 or no");
			rsp = sc.next();

			if (rsp.equals("그만")) {
				System.out.println("게임을 종료합니다.");
				sc.nextLine();
				sc.close();
				return;
			}

		}

	}

}
