package day_240726;

import java.util.Arrays;

public class RandomMultiple {

	public static void main(String[] args) {

		int[] multiple = new int[100];

		for (int i = 0; i < multiple.length; i++) {
			multiple[i] = (int) (Math.random() * 100 + 1);
			if (multiple[i] % 3 == 0) {
				System.out.print(multiple[i] + " ");
			}
		}

	}
}