
public class MultipleExercise2 {

	public static void printStar(int n) {
		for(int i = 1; i<=n; i++) {
			for(int j = 1; j<=n; j++)
			System.out.print("*");
		System.out.println();	
		}
		
	}
	
	
	
	public static void main(String[] args) {

		for (int i = 2; i <= 9; i++) {
			for (int j = 1; j <= 9; j++)
				System.out.println(i + " x " + j + " = " + i * j);

			System.out.println();
		}

		
		
		for (int i = 2; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				if (i % 2 == 0)
					System.out.println(i + " x " + j + " = " + i * j);
			}
			System.out.println();

		}

		
		
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		
		
		
		for (int i = 1; i <= 5; i++) {
			
			for (int j = i; j < 5; j++) 
				System.out.print(" ");
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
				
			}
			System.out.println();
		}
		System.out.println();
		
		
		
		for (int i = 1; i <= 5; i++) {
			
			for(int j = 0; j <= 5-i; j++) {
				System.out.print("*");
			
			}
			System.out.println();
		}
		System.out.println();
		
		
		
		printStar(5);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}