package entities;

public class ConcreteScanner extends Device implements Scanner {

	
	
	public ConcreteScanner() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ConcreteScanner(String serialNumber) {
		super(serialNumber);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void processDoc(String doc) {
		// TODO Auto-generated method stub
		System.out.println("Scan processing: " + doc);
	}
	
	@Override
	public String scan() {
		return "Scanning document";
	}
	
}
