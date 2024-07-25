package Test0725;

class InstCnt{
	static int num = 0;
	
	InstCnt() {
		num++;
		System.out.println("인스턴스 생성 : " + num);
	}
	
}



public class Test072501 {

	public static void main(String[] args) {

		InstCnt cnt1 = new InstCnt();
		InstCnt cnt2 = new InstCnt();
		InstCnt cnt3 = new InstCnt();
		

	}

}
