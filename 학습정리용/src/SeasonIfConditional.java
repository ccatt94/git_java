
public class SeasonIfConditional {

	public static void main(String[] args) {

		int month = 1;

		if ((month == 3) || (month == 4) || (month == 5)) {
			System.out.println("봄입니다.");
		} else if ((month == 6) || (month == 7) || (month == 8)) {
			System.out.println("여름입니다.");
		} else if ((month == 9) || (month == 10) || (month == 11)) {
			System.out.println("가을입니다.");
		} else {
			System.out.println("겨울입니다.");
		}

	}

}