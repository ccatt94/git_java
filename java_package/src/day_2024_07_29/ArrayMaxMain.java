package day_2024_07_29;

import java.util.Arrays;

public class ArrayMaxMain {

	public static void main(String[] args) {

		int[] ar = {1,2,3,4,5};
		
		//배열 요소 전체 출력
		for(int e : ar) {
			System.out.print(e + " ");
		}
		System.out.println("");
		
		int sum = 0;
		
		for(int e : ar) {
			sum += e;
		}
		
		System.out.println("sum : " + sum);
		
		
		
		
		
		System.out.println("========================================================");
		
		int[] arr = {1,2,3};
		
		for (int i : arr) {
			System.out.println(i);
		}
		
		System.out.println("========================================================");
		
		
		int[] arrint = new int[5];

		// 입력

		for (int i = 0; i < arrint.length; i++) {
			arrint[i] = (int) (Math.random() * 100 + 1);
		}

		// max값과 min값 구하기
		int max = arrint[0];
		int min = arrint[0];
		
		for (int i = 0; i < arrint.length; i++) {
			
			if (max < arrint[i]) {
				max = arrint[i];
			}else if(min > arrint[i]) {
				min = arrint[i];
			}

		}

		// 출력
		System.out.println(Arrays.toString(arrint));
		System.out.println("최대값 : " + max);
		System.out.println("최소값 : " + min);
	}
}
