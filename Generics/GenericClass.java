package Generics;

public class GenericClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*IntegerPrinter<> ip=new IntegerPrinter("Wiley edge");
		ip.print();*/
		 Printer<Cat> printer=new Printer(new Cat());
		 printer.print();
	}

}
