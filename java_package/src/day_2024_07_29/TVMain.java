package day_2024_07_29;

class TV {
	private int size;

	public TV(int size) {
		this.size = size;
	}

	// 상속 관련 - 자손에서는 언제든지 접근 가능(패키지와 상관없이)
	protected int getSize() {
		return size;
	}
}

class ColorTV extends TV {
	private int color;

	public ColorTV(int size, int color) {
		super(size);
		this.color = color;
	}

	public void printProperty() {
		System.out.println(super.getSize() + "인치 " + color + "컬러");
	}

}

//ColorTV를 상속받는 IPTV 클래스를 작성하라
class IPTV extends ColorTV {
	String ip;
	int color;
	
	IPTV(String ip, int size, int color){
		super(size, color);
		this.color = color;
		this.ip = ip;
	}
	
	public void printProperty() {
		System.out.println(ip + "주소에 " + super.getSize() + "인치 " + color + "컬러");
	}
	
}

public class TVMain {

	public static void main(String[] args) {

		ColorTV myTV = new ColorTV(32, 1024);
		myTV.printProperty();

		IPTV iptv = new IPTV("192.1.1.2", 32, 2048); //
		iptv.printProperty();
	}

}
