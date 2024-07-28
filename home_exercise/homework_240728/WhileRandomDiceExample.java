package homework_240728;

public class WhileRandomDiceExample {

	public static void main(String[] args) {

		int dice1 = 0;
		int dice2 = 0;

		while (true) {

			dice1 = (int) (Math.random() * 6 + 1);
			dice2 = (int) (Math.random() * 6 + 1);

			System.out.println("(" + dice1 + "," + dice2 + ")");

			if ((dice1 + dice2) == 5) {
				break;
			}
		}

	}

}
