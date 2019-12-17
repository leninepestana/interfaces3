package entities;

public class Printer extends Device {
	
	public Printer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Printer(String serialNumber) {
		super(serialNumber);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void processDoc(String doc) {
		// TODO Auto-generated method stub
		System.out.println("Printer processing: " + doc);
	}
	
	public String print() {
		return "Printing document";
	}
}
