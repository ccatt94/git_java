
class BankAccount {
	int balance= 0;
	
	// 예금 입금
	public int deposit(int amount) {
		balance += amount;
		return balance;
	}
	
	//예금 출금
	public int withdraw(int amount) {
		balance -= amount;
		return balance;
	}
	
	//예금 조회
	public int checkMyBalance() {
		System.out.println("잔액 : " + balance);
		return balance;
	}
	
	//파라미터로 객체 받아오기
	public void checkBalance(BankAccount acc) {
		acc.checkMyBalance();
	}
}


public class BankAccountMain {
	public static void main(String[] args) {
		// 두 개의 인스턴스 생성
		BankAccount yoon = new BankAccount();
		BankAccount park = new BankAccount();
		
		// 각 인스턴스를 대상으로 예금을 진행 
		yoon.deposit(5000);
		park.deposit(3000);
		
		// 각 인스턴스를 대상으로 출금을 진행
		yoon.withdraw(2000);
		park.withdraw(2000);
		
		// 각 인스턴스를 대상으로 잔액을 조회
		yoon.checkMyBalance();
		park.checkMyBalance();
		
		park.checkBalance(yoon);
		park.checkBalance(park);
		
		BankAccount ref1 = new BankAccount();
		BankAccount ref2 = ref1; // 주소값이 같음
		
		ref1.deposit(3000);
		ref2.deposit(2000);
		ref1.withdraw(400);
		ref2.withdraw(300);
		ref1.checkMyBalance();
		ref2.checkMyBalance();
		
		
	}

}
