package entities;

public class ComboDevice extends Device implements Printer, Scanner{

	public ComboDevice(String serialNumber) {
		super(serialNumber);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String scan() {
		// TODO Auto-generated method stub
		return "Scanning ComboDevice document";
	}

	@Override
	public String print() {
		// TODO Auto-generated method stub
		return "Printing ComboDevice document";
	}

	@Override
	public void processDoc(String doc) {
		// TODO Auto-generated method stub
		System.out.println("ComboDevice processing: " + doc);
	}
}
