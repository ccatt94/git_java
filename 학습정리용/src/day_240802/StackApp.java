package day_240802;

import java.util.Scanner;

interface Stack{
	int length(); //현재 스택에 저장된 개수 리턴
    int capacity(); //스택의 전체 저장 가능한 개수 리턴
    String pop(); //스택의 촙에 실수 저장
    boolean push(String val); //스택의 촙에 저장된 실수 리턴
}

public class StackApp implements Stack {
	private String[] stackArr;
	private int size, idx;
	
	public StackApp(int size) {
		stackArr = new String[size];
		idx = 0;
	}
	
	@Override
	public int length() {
		return idx;
	}

	@Override
	public int capacity() {
		return size;
	}


	@Override
	public String pop() {
		// TODO Auto-generated method stu
		return null;
	}


	@Override
	public boolean push(String val) {
		if (idx == stackArr.length) {
			return false;
		} else {
			stackArr[idx++] = val;
			return true;
		}
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("총 스택의 저장 공간의 크기 입력>>");
		
		
		int size = sc.nextInt();
		Stack stack = new StackApp(size);
		
		for (int i = 0; i < size; i++) {
			System.out.print("문자열 입력>>");
			String input = sc.nextLine();
			stack.push(input);
		}
		
		int count = stack.length();
		
		
		

	}
}