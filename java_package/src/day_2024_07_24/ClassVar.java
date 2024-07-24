package day_2024_07_24;

class InstCnt{
	static int instNum = 0;
	
	public InstCnt() {
		instNum++;
		System.out.println("인스턴스 생성: " + instNum);
	}
}

class AA{
	public AA() {
		System.out.println("AA" + "생성");
	}
	
	public void println() {
		System.out.println("메롱!!");
	}
}

class System2{
	static AA out = new AA();
}

public class ClassVar {
	static int var = 10;
	public static void main(String[] args) {
		System.out.println(var);
		int num = 10;
		System.out.println(num);
		
		
		
		
		InstCnt cnt1 = new InstCnt();
		InstCnt cnt2 = new InstCnt();
		InstCnt cnt3 = new InstCnt();
		
		System2.out.println();
		
	}
}
