package Test0729;

import java.util.Arrays;

public class Test072901 {

	public static void main(String[] args) {

		final int LOTTO_NUM = 6;
		
		int[] lotto = new int[LOTTO_NUM];
		
		for(int i = 0; i < lotto.length; i++) {
			lotto[i] = (int) (Math.random()*6+1);
			
			for(int j = 0; j < i; j++) {
				if(lotto[i] == lotto[j]) {
					i--;
					break;
				}
			}
			
		}
		System.out.println(Arrays.toString(lotto));
	}

}
