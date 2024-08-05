package day_240805;

import java.util.Scanner;

class GamblingGame{

	
	
	
	
}

class Player{
	static final int NUM = 3;
	final int[] rndInt;
	private int idx;
	private String p;
	
	Player(String p){
		this.p = p;
		this.rndInt = new int[NUM];
	}
	
	public void getNum() {
		for(int idx = 0; idx < rndInt.length; idx++) {
			rndInt[idx] = (int) (Math.random()*3);
		}
		if(rndInt[0] == rndInt[1]) {
			if(rndInt[1] == rndInt[2]) {
				if(rndInt[0] == rndInt[2]) {
					System.out.println(p + ":");
					System.out.print("\t " + rndInt[0] + "\t " + rndInt[1] + "\t " + rndInt[2]);
					System.out.print("\t" + p +"님 승리!!");
					System.out.println();
				}
			}
		}else {
		System.out.println(p + ":");
		System.out.print("\t " + rndInt[0] + "\t " + rndInt[1] + "\t " + rndInt[2]);
		System.out.print("\t 아쉽군요!");
		System.out.println();
		}
	}
	public void getResult() {
		
	}
}


public class GamblingGameMain{
	
	public static void main(String[] args) {
	
		System.out.println("***** 겜블링 게임을 시작합니다. *****");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 선수 이름>>");
		Player p1 = new Player(sc.nextLine());
		
		System.out.print("두번째 선수 이름>>");
		Player p2 = new Player(sc.nextLine());
		
		GamblingGame game = new GamblingGame();
		
		
			p1.getNum();
			p2.getNum();
		
	}
}