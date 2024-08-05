package Test0805;

import java.util.Scanner;

public class Test080501 {

	public static void main(String[] args) {

		final int COUNT = 8;
		double[] gradeArr = new double[COUNT];
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println(gradeArr.length + "학기 학점을 순서대로 입력하세요.");
		
		double sum = 0;
		for(int i = 0; i < gradeArr.length; i++) {
			System.out.print((i+1) + "학기 학점 → ");
			
			try {
			gradeArr[i] = sc.nextDouble();
			sum += gradeArr[i];
			}catch (Exception e) {
				System.out.println("잘못된 입력입니다. 다시 입력하세요.");
				i--;
				sc.nextLine();
				continue;
			}
			
		}
		System.out.println(gradeArr.length + "학기 총 평균 평점은 " + sum/gradeArr.length + "점입니다.");
	}

}
