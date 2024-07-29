package Test0729;

import java.util.Arrays;

public class Test072902 {

	public static void main(String[] args) {

		int[] randInt = new int[5];
		
		int max = 0;
		
		for(int i = 0; i < randInt.length; i++) {
			randInt[i] = (int) (Math.random()*100+1);
			if(randInt[i] > max) {
				max = randInt[i];
			}
		}
		System.out.println(Arrays.toString(randInt));
		System.out.println(max);
	}

}
