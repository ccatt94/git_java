package day_240731;

class Buyer {
	int money = 1000;
	Product[] cart = new Product[3]; // 구입한 제품을 저장하기 위한 배열
	int i = 0; // Product배열 cart에 사용될 index

	void buy(Product p) {

		if (money < p.price) {
			System.out.println("잔액이 부족하여 " + p + "을/를 살 수 없습니다.");
		} else if (money >= p.price) {
			money -= p.price;
			add(p);
		}
	}

	void add(Product p) {
		Product[] newCart = null;

		if (i >= cart.length) {
			newCart = new Product[cart.length * 2];

			for (int idx = 0; idx < cart.length; idx++) {
				newCart[idx] = cart[idx];
			}
			cart = newCart;
		}
		cart[i++] = p;

	}

	void summary() {
		int sum = 0;
		System.out.print("구입한 물건 : ");

		for (int idx = 0; idx < i; idx++) {
			System.out.print(cart[idx].toString() + ", ");
			sum += cart[idx].price;
		}
		System.out.println();
		System.out.println("사용한 금액 : " + sum);
		System.out.println("남은 금액 : " + money);

	}
}

class Product {
	int price; // 제품의 가격

	Product(int price) {
		this.price = price;
	}
}

class Tv extends Product {
	Tv() {
		super(100);
	}

	public String toString() {
		return "Tv";
	}
}

class Computer extends Product {
	Computer() {
		super(200);
	}

	public String toString() {
		return "Computer";
	}
}

class Audio extends Product {
	Audio() {
		super(50);
	}

	public String toString() {
		return "Audio";
	}
}

public class BuyerMain {

	public static void main(String[] args) {

		Buyer b = new Buyer();
		b.buy(new Tv());
		b.buy(new Computer());
		b.buy(new Tv());
		b.buy(new Audio());
		b.buy(new Computer());
		b.buy(new Computer());
		b.buy(new Computer());
		b.summary();

	}
}