package entities;

public class ConcretePrinter extends Device implements Printer {
	
	public ConcretePrinter() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ConcretePrinter(String serialNumber) {
		super(serialNumber);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void processDoc(String doc) {
		// TODO Auto-generated method stub
		System.out.println("Printer processing: " + doc);
	}
	
	@Override
	public String print() {
		return "Printing document";
	}
}
