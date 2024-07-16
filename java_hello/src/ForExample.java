
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
		
		
		
		
		
	}
}
