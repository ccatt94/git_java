package day_2024_07_31;

interface Printable2{
	public void print(String doc);
	
	default void printCMYK(String doc) {
		System.out.println("칼라 되지롱" + doc);
	}    
}
//삼성전자 개발자
class SPrinterDriver implements Printable2{

	@Override
	public void print(String doc) {
		System.out.println("From Samsung printer");
		System.out.println(doc);
	}
	
}
//LG전자 개발자
class LPrinterDriver implements Printable2{
	
	@Override
	public void print(String doc) {
		System.out.println("From LG printer");
		System.out.println(doc);
	}
	
}

interface ColorPrintable extends Printable2{
	void printCMYK(String doc);
}

class Prn909Drv implements ColorPrintable{

	@Override
	public void print(String doc) {
		System.out.println("흑백" + doc);
	}

	@Override
	public void printCMYK(String doc) {
		System.out.println("컬러" + doc);
	}
	
}


public class PrinterMain {

	public static void main(String[] args) {

		String myDoc = "This is a report about.... ";
		
		Printable2 prn = new SPrinterDriver();
		prn.print(myDoc);
		
		prn = new LPrinterDriver();
		prn.print(myDoc);
	
		ColorPrintable colorPrn = new Prn909Drv();
		colorPrn.print("메롱");
		colorPrn.printCMYK("메롱");
	}

}
