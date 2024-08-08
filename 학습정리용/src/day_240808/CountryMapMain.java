package day_240808;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountryMapMain {

	public static void main(String[] args) {

		Map<String, Integer> countryMap = new HashMap<>();

		Scanner sc = new Scanner(System.in);
		System.out.println("나라 이름과 인구를 입력하세요.(예: Korea 5000)");

		
		String country = " ";
		int population = 0;
		
		while (true) {
			System.out.print("나라 이름, 인구 >>");
			country = sc.next();
			
			if (country.equals("그만")) {
				break;
			}
			
			population = sc.nextInt();
			countryMap.put(country, population);

			
			
		}
		
		while (true) {
			System.out.print("인구 검색 >>");
			
			String key = sc.next();
			
			if (key.equals("그만")) {
				break;
			}
			
			countryMap.get(country);
			System.out.println( key + "의 인구는 " + population);

//			if (!countryMap.containsKey(key) {
//				System.out.println(key + " 나라는 없습니다.");
//				continue;
//			}
			
			
			
		}
		sc.close();
	}

}
