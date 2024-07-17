
public class ForExample {

	public static void main(String[] args) {

		// 1부터 100까지의 합 5050
		int sum = 0;
		
		for(int i = 1; i <= 100 ; i++) {
			sum+=i;
		}
		System.out.println("1 ~ 100까지의 합 : " + sum);
		
		
		// 3단 구구단 출력
		// 3*1=3
		
		int dan = 3;
		int total = 0;
		
		for(int i = 1; i <= 9 ; i++ ) {
			total = dan * i;
			System.out.println(dan + " * " + i + " = " + total);
		}
		
		
		// 홀수만 출력
		// 1 3 5 7 9 ... 99
		
		for(int odd = 1; odd <= 100; odd += 2) {
			System.out.println(odd);
		}
		
		
		// 홀수만 출력
		// 두번째 방법
		for(int odd = 1; odd <= 100; odd++) {
			if(odd % 2 == 1) {
				System.out.println(odd);
			}
		}
		
		
		// 100 98 96 ... 2
		for(int even = 100; even >= 2; even -= 2) {
			System.out.println(even);
		}
		
		
		//1부터 100까지의 수 중 3의 배수가 아닌 수들의 합
		sum = 0;
		for(int i = 1; i <= 100; i++) {
			if(i % 3 != 0) {
				sum += i;
			}
		}
		System.out.println("1 ~ 100까지의 수 중 3의 배수가 아닌 수들의 합은 : " + sum);
		
		
		//1부터 100까지 3의 배수의 합
		sum = 0;
		int i = 1;
		
		while(i <= 100) {
			
			if(i % 3 == 0) {
				sum += i;
			}
			
		i++;
		}
		System.out.println("1 ~ 100까지 3의 배수의 합은 : " + sum);
		
		
		//구구단
		for(i=2; i<=9; i++) {
			System.out.println(i+"단입니다.");
		
			for(int j=1; j<=9; j++)
				System.out.println(i + " x " + j + " = " + (i*j) );
			
			System.out.println();
		}	
		
		
		// 짝수단만 출력
		for (i = 2; i <= 9; i++) {

			if (i % 2 != 0)
				continue;
			
				for (int j = 1; j <= 9; j++)
					System.out.println(i + " x " + j + " = " + (i * j));

			System.out.println();
		}
		
		
		// 구구단의 결과물이 홀수인 식만 출력
		for (i = 2; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				int result = i * j;
				if (result % 2 != 0) {
					System.out.println(i + " x " + j + " = " + result);
				}			
		}
			System.out.println();
		}
		
		
		
		// 3의 배수인 단만 출력하시오.(3,6,9단만 출력)
		for(i=2; i<=9; i++) {
			
			if(i % 3 == 0) {
			for(int j=1; j<=9; j++)
				System.out.println(i + " x " + j + " = " + (i * j));
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
	}
}
