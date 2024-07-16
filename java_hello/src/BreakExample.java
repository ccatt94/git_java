
public class BreakExample {

	public static void main(String[] args) {
		
		//1부터 1000까지의 숫자 중 7의 배수이자 11의 배수인 첫번째 수
		
		for(int i = 1; i <= 1000; i++) {
			
			if( (i % 7 == 0) && (i % 11 == 0) ) {
				System.out.println("1부터 1000까지의 숫자 중 7의 배수이자 11의 배수인 첫번째 수 : " + i);
				break;
				
			}
			
		}
		
		
		
		
		
		
		
		
		
		
	}

}
