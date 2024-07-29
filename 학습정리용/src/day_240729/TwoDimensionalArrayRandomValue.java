package day_240729;

public class TwoDimensionalArrayRandomValue {

	public static void main(String[] args) {

		int[][] randIntArr = new int[4][3];
		
		for(int i = 0; i < randIntArr.length; i++) {
			for(int j = 0; j < randIntArr[i].length; j++) {
				randIntArr[i][j] = (int) (Math.random()*100+1);
				System.out.print(randIntArr[i][j] + "\t");
			}
			System.out.println();
		}
		
	}
}