package day_240726;

class MoneyArr {

	int[] money = new int[4];

	int totalMoney;

	public MoneyArr(int m) {
		this.totalMoney = m;
		money[0] = 500;
		money[1] = 100;
		money[2] = 50;
		money[3] = 10;
	}

	void getMoney() {

		for (int i = 0; i < money.length; i++) {
			System.out.println(money[i] + "원 : " + totalMoney / money[i] + "개");
			totalMoney = totalMoney % money[i];
		}
	}

}

public class RandomCurrency {

	public static void main(String[] args) {

		int randMoney = (int) (Math.random() * 5000 + 1);
		System.out.println(randMoney + "원");

		MoneyArr moneyArr = new MoneyArr(randMoney);
		moneyArr.getMoney();

	}
}