package homework_240728;

import java.util.Scanner;

public class DoubleDivision {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫 번째 수 : ");
		double num1 = sc.nextDouble();
		
		System.out.print("두 번째 수 : ");
		double num2 = sc.nextDouble();
		
		if(num2 == 0 || num2 == 0.0) 
			System.out.println("결과 : 무한대");			
		else
		System.out.println("결과 : " + num1 / num2);
	
	
	}

}
