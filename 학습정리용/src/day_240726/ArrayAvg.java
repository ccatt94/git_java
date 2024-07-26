package day_240726;

import java.util.Arrays;

public class ArrayAvg {

	public static void main(String[] args) {

		int[] arrNum = new int[10];
		int sum = 0;
		double avg = 0;

		System.out.print("랜덤한 정수들 : ");
		for (int i = 0; i < arrNum.length; i++) {
			arrNum[i] = (int) (Math.random() * 10 + 1);
			sum += arrNum[i];
			System.out.print(arrNum[i] + " ");
		}
		System.out.println();
		avg = (double) sum / arrNum.length;
		System.out.println("평균은 : " + avg);

	}
}