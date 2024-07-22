package day_240722;

class Phone{
	String name, tel;
	
	Phone(){
		this.name = "없음";
		this.tel = "없음";
	}
	
	Phone(String name, String tel){
		this.name = name;
		this.tel = tel;
	}
	
	void show() {
		System.out.println("이름 : " + name);
		System.out.println("전화 번호 : " + tel);
	}
}

public class PhoneMain {

	public static void main(String[] args) {
		Phone phone = new Phone("홍길동", "010-0000-0000");
		phone.show();

		phone = new Phone("홍길순", "010-1111-1111");
		phone.show();

		phone = new Phone();
		phone.show();

	}

}
