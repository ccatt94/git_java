package day_240724;

class Star {

	void printStar(int num) {
		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	void reverseStar(int num) {
		for (int i = 1; i <= num; i++) {
			for (int j = 0; j <= num - i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}

public class ClassSystem2 {

	public static void main(String[] args) {

		Star star = new Star();

		star.printStar(5);
		star.reverseStar(5);

	}

}