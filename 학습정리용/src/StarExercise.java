
public class StarExercise {

	public static void main(String[] args) {

		for (int i = 1; i <= 4; i++) {
			for (int j = i; j < 4; j++)
				System.out.print(" ");
			for (int j = 1; j <= 7 ; j+=2) {
					System.out.print("*");
			}
			System.out.println();
		}
	}
}