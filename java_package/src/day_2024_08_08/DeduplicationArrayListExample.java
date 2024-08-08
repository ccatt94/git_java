package day_2024_08_08;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class DeduplicationArrayListExample {

	public static void main(String[] args) {
		
		//[Java] new ArrayList<>() 와 Arrays.asList() 차이점 및 비교 학습 하기
		//일반 배열을 ArrayList로 변환
		List<String> lst = Arrays.asList("Box", "Toy", "Box", "Toy"); 
		ArrayList<String> list = new ArrayList<>(lst);

		for (String str : list) {
			System.out.print(str.toString() + "\t");
		}
		System.out.println();

		HashSet<String> set = new HashSet<>(list);

		list = new ArrayList<>(set);

		for (String str : list) {
			System.out.print(str.toString() + "\t");
		}
		
	}
}
