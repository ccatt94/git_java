
public class OddSum {

	public static void main(String[] args) {
		
		int sum = 0;
		
		for(int i = 1; i <= 100; i++) {
			if(i % 2 == 1) {
				sum += i;
			}
		}
		
		System.out.println("1부터 100까지의 홀수들의 합 : " + sum);
		
	}

}