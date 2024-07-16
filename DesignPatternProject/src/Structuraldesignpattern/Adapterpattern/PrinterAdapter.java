package Structuraldesignpattern.Adapterpattern;

public class PrinterAdapter implements Printer {

	LegacyPrinter oldPrinter;
	
	public PrinterAdapter() {
		oldPrinter = new LegacyPrinter();
	}
	
	@Override
	public void print() {
		// TODO Auto-generated method stub
		
		oldPrinter.printDocument();
		
		
	}

	
}
