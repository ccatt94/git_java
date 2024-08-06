package day_2024_08_06;

import java.util.Scanner;

interface Stack {
	int length(); // 현재 스택에 저장된 개수 리턴
	int capacity(); // 스택의 전체 저장 가능한 개수 리턴
	String pop(); // 스택의 톱(top)에 저장
	boolean push(String val); // 스택의 톱(top)에 저장된 문자 리턴
}

class StringStack2 implements Stack {

	private int size;
	private String[] arrStack;
	private int index; // top
	
	public StringStack2() {
		arrStack = new String[3];
		index = 0;
	}

	public StringStack2(int size) {
		index = 0;
		this.size = size;
		arrStack = new String[size];
	}

	@Override
	public int length() {
		return index;
	}

	@Override
	public int capacity() {
		return size - index;
	}

	@Override
	public String pop() {
		return arrStack[--index];

	}

	@Override
	public boolean push(String val) {
		String[] arrTemp;

		if (index == arrStack.length) {

			arrTemp = new String[arrStack.length * 2];

			for (int i = 0; i < arrStack.length; i++) {
				arrTemp[i] = arrStack[i];
			}

			arrStack = arrTemp;

		}

		arrStack[index++] = val;

		return true;

	}
}



public class StackAppNewArrayMain {

	public static void main(String[] args) {

		
		StringStack2 stack2 = new StringStack2();
		
		stack2.push("happy");
		stack2.push("sunny");
		stack2.push("day");
		stack2.push("smile");
		
		// for문 조건에 length()를 그대로 넣을경우 pop()함수로 인해 index값이 작아지기 때문에 새로운 변수에 값을 지정하여 조건에 사용하면 값이 변하지 않음
		int length = stack2.length();  
		
		for (int i = 0; i < length; i++) {
			System.out.print(stack2.pop() + " ");
		}
		
	

	}
}