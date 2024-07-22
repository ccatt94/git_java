
class BankAccount {
	String accNumber;
	String ssNumber;
	int balance= 0;
	
	
	// 디폴트 생성자 : 개발자가 생성자를 한개라도 만들었을시 컴파일러가 자동으로 만들어 주지 않음
	BankAccount(){ 
		
	}
	
	//생성자 함수 만들기(리턴타입없음) 초기화 생성자
	BankAccount(String acc, String ss, int balance) {
		this();
		
		this.accNumber = acc;
		this.ssNumber = ss;
		this.balance = balance;
	}
	
	//해당 객체 초기화 함수
	void initBankAccount(String acc, String ss, int bal) {
		accNumber = acc;
		ssNumber = ss;
		balance = bal;
	}
	
	void thisExample() {
		deposit(1000);
		withdraw(1000);
	}
	
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
		if(acc != null)
		acc.checkMyBalance();
	}
}


public class BankAccountMain {
	
	public static void main(String[] args) {
		
		BankAccount noh = new BankAccount(); // 컴파일러가 디폴트 생성자를 만들어줌
		
		BankAccount choi = new BankAccount("12-34-56", "940828-", 0); //생성자 함수 호출
//		choi.initBankAccount("12-34-56", "940828-202020", 0); //초기화 함수
		
		
		// 두 개의 인스턴스 생성
//		BankAccount yoon = new BankAccount();
//		BankAccount park = new BankAccount();
		
		// 각 인스턴스를 대상으로 예금을 진행 
//		yoon.deposit(5000);
//		park.deposit(3000);
		
		// 각 인스턴스를 대상으로 출금을 진행
//		yoon.withdraw(2000);
//		park.withdraw(2000);
		
		// 각 인스턴스를 대상으로 잔액을 조회
//		yoon.checkMyBalance();
//		park.checkMyBalance();
//		
//		park.checkBalance(yoon);
//		park.checkBalance(park);
//		
//		System.out.println("--------------------");
//		
//		park = null;
//		yoon = null;
//		
//		System.out.println(park);
//		System.out.println(yoon);
		
		
		// null값으로 초기화하면 주소값 없어짐
//		park.checkBalance(yoon);
//		park.checkBalance(park);
		
//		BankAccount ref1 = new BankAccount();
//		BankAccount ref2 = ref1; // 주소값이 같음
//		
//		ref1.deposit(3000);
//		ref2.deposit(2000);
//		ref1.withdraw(400);
//		ref2.withdraw(300);
//		ref1.checkMyBalance();
//		ref2.checkMyBalance();
		
		
	}

}
