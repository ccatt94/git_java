
import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		String input1 = scanner.nextLine();
		String input2 = scanner.nextLine();
		String input3 = scanner.nextLine();
		
		System.out.println("1. 이름 : " + input1);
		System.out.println("2. 주민번호 : " + input2);
		System.out.println("3. 전화번호 : " + input3);
		
	}

}
