package day_2024_08_02;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileMain {
	
	// unchecked exception
	public static void print() throws ArrayIndexOutOfBoundsException {
		System.out.println("안녕하세요.");
	}
	
	// checked exception = 해당 함수를 호출한 곳에서 에러 처리하라는 의미
//	public static void print2() throws Exception {
//		int a = 0/0;
//		System.out.println("안녕하세요.");
//	}
	public static void main(String[] args){
		
//		print();
//		try {
//			print2();
//		} catch (Exception e) {
//		}
		

		File file = new File("abcd.txt");
		
		try {
			Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println(line);
            }
            scanner.close();		
		} catch (FileNotFoundException e) {
			System.out.println("파일이 없습니다.");
			e.printStackTrace();
		}

		
		
		
	}
}
