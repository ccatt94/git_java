
public class BreakExample {

	public static void main(String[] args) {

		// 1부터 1000까지의 숫자 중 7의 배수이자 11의 배수인 첫번째 수

		for (int i = 1; i <= 1000; i++) {

			if ((i % 7 == 0) && (i % 11 == 0)) {
				System.out.println("1부터 1000까지의 숫자 중 7의 배수이자 11의 배수인 첫번째 수 : " + i);
				break;

			}

		}

		// 처음 만나는 5의 배수이자 7의 배수인 수를 찾는 반복문

		int num = 1;
		boolean search = false;

		while (num < 100) {
			
			if (((num % 5) == 0) && ((num % 7) == 0)) {
				search = true;
				break;		// while문 탈출
			}
			
			num++;
		}
		if (search)
			System.out.println("찾는 정수 : " + num);
		else
			System.out.println("5의 배수이자 7의 배수인 수를 찾지 못했습니다.");

		
		
		
		
		
		
	}

}
