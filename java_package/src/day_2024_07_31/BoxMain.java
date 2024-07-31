package day_2024_07_31;

class Box {
    public void simpleWrap() { 
        System.out.println("Simple Wrapping");
    }
}

class PaperBox extends Box {
    public void paperWrap() {
        System.out.println("Paper Wrapping");
    }
}

class GoldPaperBox extends PaperBox {
    public void goldWrap() {
        System.out.println("Gold Wrapping");
    }
}

public class BoxMain {

	public static void main(String[] args) {

		Box box1 = new Box();
		PaperBox box2 = new PaperBox();
		GoldPaperBox box3 = new GoldPaperBox();
		
		//같은 클래스 내에 있는 객체 호출하기 위해 사용
		wrapBox(box1);
		wrapBox(box2);
		wrapBox(box3);
		
	}
	
	public static void wrapBox(Box box) {
		if(box instanceof GoldPaperBox) {
			((GoldPaperBox)box).goldWrap();
		}else if(box instanceof PaperBox) {
			PaperBox pBox = (PaperBox) box;
			pBox.paperWrap();

//			((PaperBox)box).paperWrap();  // 위 코드와 같은 의미
			
		}else {
			box.simpleWrap();
		}
	}

}
