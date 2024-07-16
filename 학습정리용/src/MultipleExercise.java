
public class MultipleExercise {

	public static void main(String[] args) {
		
		int count = 0;
		
		for(int i = 1; i <= 1000; i++) {
			if((i % 5 ==0) && (i % 7 ==0)) {
				count++;
			}
		}
		System.out.println("갯수 : " + count);
	}

}