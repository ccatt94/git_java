
public class StarExercise {

	public static void main(String[] args) {

		for (int i = 1; i <= 4; i++) {

			for (int j = i; j < 4; j++)
				System.out.print(" ");
			for (int j = 3; j <= 2 * i + 1; j++) {
				System.out.print("*");
			}

			System.out.println();
		}

	}
}