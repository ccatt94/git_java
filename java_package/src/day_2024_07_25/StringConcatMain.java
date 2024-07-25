package day_2024_07_25;

public class StringConcatMain {

	public static void main(String[] args) {

		int num = 1;
		String str = "Spring";
		
		switch(str) {
			case "Spring":
				System.out.println("봄입니다.");
		}
		
		switch(num) {
		case 1:
		case 2:
		case 3:
			System.out.println("봄입니다.");
		}
		
		switch(num) {
		case 1,2,3:
			System.out.println("봄입니다.");
		}
		

		
	}
}
