package day_240807;

import java.util.ArrayList;
import java.util.Scanner;

public class ScannerGradeArrayList {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		ArrayList listGrade = new ArrayList();
		final int COUNT = 6;

		System.out.println(COUNT + "개의 학점을 빈 칸으로 분리 입력(A/B/C/D/F)");
		System.out.print(">>");

		for (int i = 0; i < COUNT; i++) {
			String str = sc.next();
			listGrade.add(str);
		}

//		int sum = 0;
		double sum = 0;
		for (int i = 0; i < COUNT; i++) {

			if (listGrade.get(i).equals("A")) {
				listGrade.set(i, 4.0);
			} else if (listGrade.get(i).equals("B")) {
				listGrade.set(i, 3.0);
			} else if (listGrade.get(i).equals("C")) {
				listGrade.set(i, 2.0);
			} else if (listGrade.get(i).equals("D")) {
				listGrade.set(i, 1.0);
			} else if (listGrade.get(i).equals("F")) {
				listGrade.set(i, 0.0);
			}

//			sum += (int) listGrade.get(i);
			sum += (double) listGrade.get(i);

		}
		double avg = sum / (double) listGrade.size();
		System.out.println(avg);

	}

}
