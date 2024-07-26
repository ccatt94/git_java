package day_240726;

import java.util.Arrays;

public class ArrayAlphabet {

	public static void main(String[] args) {

		char[] alphabet = new char[26];

		for (int i = 0; i < alphabet.length; i++) {
			alphabet[i] = (char) (65 + i);
			System.out.print(alphabet[i] + " ");
		}

	}
}