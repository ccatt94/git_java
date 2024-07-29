package day_2024_07_29;

class Box{
	private int num;
	private String contents;
	
	public Box(int num, String contents){
		this.num = num;
		this.contents = contents;
	}
	
	public int getBoxNum() {
		return num;
	}
	
	public String toString() {
		return contents;
	}
}

public class ForEachMain {

	public static void main(String[] args) {
		
		Box[] ar = new Box[2];
		ar[0] = new Box(101, "Coffee");
		ar[1] = new Box(202, "Computer");
		
		//배열에서 번호가 202인 Box를 찾아 그 내용물을 출력하는 반복문
		for(Box e : ar) {
			if(e.getBoxNum() == 202) {
				System.out.println(e);
			}
		}
		
	}
	
}
