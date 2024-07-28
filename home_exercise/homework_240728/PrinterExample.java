package homework_240728;

class Printer{
	
	Printer(){}
	
	void println(int p){
		System.out.println(p);
	}
	
	void println(boolean p){
		System.out.println(p);
	}
	
	void println(double p){
		System.out.println(p);
	}
	
	void println(String p){
		System.out.println(p);
	}
	
}

public class PrinterExample {

	public static void main(String[] args) {

		Printer p = new Printer();
		
		p.println(10);
		p.println(true);
		p.println(5.7);
		p.println("홍길동");
		
		
		
	}

}
