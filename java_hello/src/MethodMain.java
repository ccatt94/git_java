
public class MethodMain {
	
	public static void add(int num1, int num2) {
		int result;
		result = num1 + num2;
		System.out.println(result);
	}
	
	public static void sayHello() {
		System.out.println("say hello");
	}
	
	public static void sayHello2() {
		for(int i = 0; i < 5; i++)
			System.out.println("say hello");
	}
	
	public static void printHello() {
//		System.out.println("Hello world");
		sayHello2();
	}

	public static void printStart(int n) {
		for(int i=1; i <= n; i++) {
			for(int j=1; j <= i; j++)
			System.out.print("*");
		System.out.println();
		}
	}
	
	public static void main(String[] args) {

//		add(3,4);
		printStart(4);
		
	}
}
