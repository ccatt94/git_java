
public class FunctionStar {

	public static void printStar(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++)
				System.out.print("*");
			System.out.println();
		}
		System.out.println();
	}
	
	public static void printStar2(int a) {
		for (int i = 1; i <= a; i++) {
			for (int j = i; j <= a; j++)
				System.out.print("*");
			System.out.println();
		}
		System.out.println();
	}	
	
	public static void printStar3(int a) {
		for (int i = 1; i <= a; i++) {
			for (int j = i; j < a; j++)
				System.out.print(" ");
			for (int j = 1; j <= i; j++)
				System.out.print("*");
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		
		printStar(4);
		printStar2(4);
		printStar3(4);
	}

}