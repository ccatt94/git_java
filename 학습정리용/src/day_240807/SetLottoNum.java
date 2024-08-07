package day_240807;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetLottoNum {

	public static void main(String[] args) {

		Set<Integer> lottoNum = new HashSet<>();
		final int LOTTO = 6;

		while (lottoNum.size() < LOTTO) {
			int num = (int) (Math.random() * 45 + 1);
			lottoNum.add(num);
		}

		System.out.print(lottoNum);

	}

}
