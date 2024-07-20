
class Gugudan{
	int i, j, num;
	
	void printGuGu(int num) {
		for(int i = 1; i <= num; i++) {
			System.out.println(i+"단");
			for(int j = 1; j <= 9; j++) {
				System.out.println(i + " x " + j + " = " + i*j);
			}
			System.out.println();
		}
		System.out.println();
	}
}

public class GugudanMain {

	public static void main(String[] args) {
		
		Gugudan gugudan = new Gugudan();
		
		gugudan.printGuGu(10); // 1~10단 출력 
		gugudan.printGuGu(20); // 1~20단 출력 
		
	}

}