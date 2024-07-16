
public class WhileExample {

	public static void main(String[] args) {

		int count = 1;

		while (count <= 1000) {
			System.out.println(count + "번" + ": Hello World");
			count++;
		}

		
		//do while 사용
		count = 1;
		
		do {
			System.out.println(count + "번" + ": Hello World");
			count++;
		}while(count <= 100);
		
		
		//for문 사용
		
		for(int i = 0; i < 100 ; i++) {
			System.out.println(i + "번" + ": Hello World");
		}
		
		
		
	}

}
