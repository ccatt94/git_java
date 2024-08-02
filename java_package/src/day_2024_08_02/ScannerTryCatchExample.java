package day_2024_08_02;

import java.util.Scanner;

public class ScannerTryCatchExample {

	public static void main(String[] args) {

		final int COUNT = 8;
		double[] arrGrade = new double[COUNT];
		Scanner sc = new Scanner(System.in);

		System.out.println("8학기 학점을 순서대로 입력하세요");
		double sum = 0;
		for (int i = 0; i < arrGrade.length; i++) {
//			// 매번 객체 새로 생성하여 값 입력받기 때문에 catch블록에 sc.nextLine() 넣지 않아도 무한 루프 타지 않지만 메모리 과부하
//			Scanner sc = new Scanner(System.in);
			System.out.print((i + 1) + "학기 학점 → ");

			try {
				arrGrade[i] = sc.nextDouble();
				sum += arrGrade[i];
			} catch (Exception e) {
				System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
				i--;
				sc.nextLine();
				continue;
			}

		}
		System.out.println("총점 : " + sum + "평균" + (sum / arrGrade.length));
	}
}
