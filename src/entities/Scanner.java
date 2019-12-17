package entities;

public class Scanner extends Device {

	
	
	public Scanner() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Scanner(String serialNumber) {
		super(serialNumber);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void processDoc(String doc) {
		// TODO Auto-generated method stub
		System.out.println("Scan processing: " + doc);
	}
	
	public String scan() {
		return "Scanning document";
	}
	
}
