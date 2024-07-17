
public class StarExample {

	public static void main(String[] args) {

		// *을 5번 개행 출력
		
		for (int i = 1; i <= 5; i++) {
			System.out.println("*");
		}
		System.out.println();

		// *을 한 줄로 5개 출력

		for (int i = 1; i <= 5; i++) {
			System.out.print("*");
		}
		System.out.println("\n");

		// *****을 5줄 출력
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();

		// *을 한개씩 추가해서 5줄 출력
		for (int i = 1; i <= 5; i++) { // 세로 칸수(층수 결정)
			for (int j = 1; j <= i; j++) { // 가로 방수 결정
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();

		// *을 5*5 -> 1*1 출력
		for (int i = 5; i >= 1; i--) { // 세로 칸수(층수 결정)
			for (int j = 1; j <= i; j++) { // 가로 방수 결정
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();

		// *을 한개씩 추가해서 5줄 출력(오른쪽 정렬) 5->1
		for (int i = 1; i <= 5; i++) {

			for (int j = 1; j < i; j++) {
				System.out.print(" ");
			}

			for (int j = i; j <= 5; j++) {
				System.out.print("*");
			}

			System.out.println();
		}
		System.out.println();

		// *을 한개씩 추가해서 5줄 출력(오른쪽 정렬) 1 -> 5
		for (int i = 1; i <= 5; i++) {

			for (int j = i; j < 5; j++) {
				System.out.print(" ");
			}

			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}

			System.out.println();
		}

	}
}
