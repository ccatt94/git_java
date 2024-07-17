
public class WhileExample {

	public static void main(String[] args) {

		int count = 1;

		while (count <= 1000) {
			System.out.println(count + "번" + ": Hello World");
			count++;
		}

		// do while 사용
		count = 1;

		do {
			System.out.println(count + "번" + ": Hello World");
			count++;
		} while (count <= 100);

		// for문 사용

		for (int i = 0; i < 100; i++) {
			System.out.println(i + "번" + ": Hello World");
		}

		// 1 부터 100까지의 수에서 3의 배수이자 4의 배수인 수의 갯수

		int num = 0;
		count = 0;

		while (num++ <= 100) {

			if (((num % 3) != 0) || ((num % 4) != 0))
				continue;

			count++;
			System.out.println(num);
		}
		System.out.println("총 " + count + "개");

	}

}
