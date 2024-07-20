
class Sum {
	int num, sum;

	void setNum(int num) {
		this.num = num;
	}

	int getSum() {

		for (int i = 1; i <= num; i++) {
			sum += i;
		}

		return sum;
	}

}

public class SumMain {

	public static void main(String[] args) {

		Sum sum = new Sum();
		sum.setNum(50);

		System.out.println(sum.getSum());

	}

}
