
class Person {
	private int regiNum;
	private int passNum;

	Person(int regiNum, int passNum) {
		this.regiNum = regiNum;
		this.passNum = passNum;
	}

	Person(int regiNum) {
		this(regiNum, 0);
	}

	void showPersonalInfo() {
		System.out.println("주민번호 : " + regiNum);

		if (passNum != 0)
			System.out.println("여권번호 : " + passNum);
		else
			System.out.println("여권을 소지하고 있지 않습니다.");
	}
}

public class OverladingExample {

	public static void main(String[] args) {

		Person jung = new Person(335577, 112233);
		Person hong = new Person(775544);

		jung.showPersonalInfo();
		hong.showPersonalInfo();

	}

}
