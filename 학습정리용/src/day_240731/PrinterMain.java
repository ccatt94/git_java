package day_240731;

interface Printable { // MS가 정의하고 제공한 인터페이스
public void print(String doc);
}

class SPrinterDriver implements Printable{

	@Override
	public void print(String doc) {
		System.out.println("From Samsung printer");
		System.out.println(doc);
	}
	
}

class LPrinterDriver implements Printable{
	
	@Override
	public void print(String doc) {
		System.out.println("From LG printer");
		System.out.println(doc);
	}
	
}
public class PrinterMain {

	public static void main(String[] args) {

		String myDoc = "This is a report about...";
		
		Printable prn = new SPrinterDriver();
		prn.print(myDoc);
		System.out.println();
		
		prn = new LPrinterDriver();
		prn.print(myDoc);

	}
}