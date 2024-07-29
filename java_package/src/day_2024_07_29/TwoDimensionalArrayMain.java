package day_2024_07_29;

public class TwoDimensionalArrayMain {

	public static void main(String[] args) {

		
		// 4x4의 2차원 배열, 1~10까지 범위의 정수 랜덤 생성,  정수 16개를 배열에 저장후 출력
		{
			int[][] arr = new int[4][4];

			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr[i].length; j++) {
					arr[i][j] = (int) (Math.random() * 10 + 1);
					System.out.print(arr[i][j] + "\t");
				}
				System.out.println();
			}
		
		}
		System.out.println("==========================================");
		
		
		// 2차원 배열 초기화
		{
		int [][] arr = {
				{11},
				{22, 33},
				{44, 55, 66}	
		};
		
		// 배열의 구조대로 내용 출력
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
		
		
		System.out.println("==========================================");
		
		
		}
		
		
		//2차원 배열 예시
		{
			int[][] arr = new int[3][4];
			int num = 1;

			// 배열에 값을 저장
			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr[i].length; j++) {
					arr[i][j] = num;
					num++;
				}
			}

			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr[i].length; j++) {
					System.out.print(arr[i][j] + "\t");
				}
				System.out.println();
			}
		}
	
	
	}

}
