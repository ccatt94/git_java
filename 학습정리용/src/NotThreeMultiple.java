
public class NotThreeMultiple {

	public static void main(String[] args) {
		
		int sum = 0;
		
		for(int i = 0; i <= 100; i++) {
			if(i % 3 != 0) {
				sum += i;
			}
		}
		System.out.println("1부터 100까지의 수 중 3의 배수가 아닌 값들의 합 : " + sum);
		
		
	}

}