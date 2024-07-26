package day_2024_07_26;

import java.util.Arrays;

/*
 * 4. 로또: 1~45, 6개 공, 중복 숫자 제거
 */

public class LottoMain {

	public static void main(String[] args) {

		int[] intArr = new int[3];
		intArr[0] = 0;
		intArr[1] = 1;
		intArr[2] = 2;
		System.out.println(Arrays.toString(intArr));
	
		
		int[] intArr2 = {0,1,2};
		System.out.println(Arrays.toString(intArr2));
		
		
		String[] season = {"spring","summer","fall","winter"};
		String[] season2 = {new String("spring"),new String("summer"),new String("fall"),new String("winter")};
		System.out.println(Arrays.toString(season));
		System.out.println(Arrays.toString(season));

		for(int i = 0; i < season.length; i++) {
			System.out.println(season[i]);
		}
		
		
		
		
		
		
		final int LOTTO_COUNT = 6;

		int[] lottoNum = new int[LOTTO_COUNT];

		// 입력
		for (int i = 0; i < lottoNum.length; i++) {
			lottoNum[i] = (int) (Math.random() * 45 + 1);

			for (int j = 0; j < i; j++) {
				if (lottoNum[j] == lottoNum[i]) {
					i--;
					break;
				}

			}
		}

		System.out.println(Arrays.toString(lottoNum));

		// 출력
//		for(int i = 0; i < lottoNum.length; i++) {
//			System.out.println(lottoNum[i]);
//		}

	}
}
