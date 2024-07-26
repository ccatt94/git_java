package day_240726;

import java.util.Arrays;

public class RandomMaxValue {

	public static void main(String[] args) {

		int[] arrNum = new int[5];
		int max = 0;

		for (int i = 0; i < arrNum.length; i++) {
			arrNum[i] = (int) (Math.random() * 100 + 1);

			if (arrNum[i] > max) {
				max = arrNum[i];
			}

		}
		System.out.println(Arrays.toString(arrNum));
		System.out.println("5개의 숫자 중 가장 큰 값 : " + max);

	}
}