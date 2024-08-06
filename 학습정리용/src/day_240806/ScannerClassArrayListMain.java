package day_240806;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ScannerClassArrayListMain {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<Integer>();

		Scanner sc = new Scanner(System.in);

		System.out.println("정수 입력(-1이 입력될 때까지)>>");
		while (true) {
			int num = sc.nextInt();
			int max = 0;

			list.add(num);
			if (num == -1) {
				for (int i = 0; i < list.size(); i++) {
					if (max < list.get(i)) {
						max = list.get(i);
					}
				}
				System.out.println("가장 큰 수 : " + max);
				return;
			}

		}

	}
}