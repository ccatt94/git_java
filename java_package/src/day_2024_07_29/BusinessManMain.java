package day_2024_07_29;

class Man{
	String name;
	
	public Man() {}
	
	public Man(String name) {
		this.name = name;
	}
	
	public void tellYourName(){
		System.out.println("My name is " + name);
	}
}

class BusinessMan extends Man{
	
	String company, position;
	
	public BusinessMan(String name, String company, String position) {
		//부모 생성자 호출
		super(name);
		
		this.name = name;
		super.name = name;
		
		
		this.company = company;
		this.position = position;
	}
	
	public void tellYourInfo() {
		System.out.println("My company is " + company);
		System.out.println("My position is " + position);
		super.tellYourName();
	}
}

public class BusinessManMain {

	public static void main(String[] args) {
		
		BusinessMan businessman = new BusinessMan("홍길동","홍길동컴퍼니","staff");
		
		businessman.tellYourInfo();
		
		
		
	}

}
