package application;

import entities.ComboDevice;
import entities.ConcretePrinter;
import entities.ConcreteScanner;

public class Program {
	public static void main(String[] args) {
		
		ConcretePrinter p = new ConcretePrinter("12467");
		System.out.println("Printer Serial Number: " + p.getSerialNumber());
		p.processDoc("A letter to my friend");
		p.print();
		
		System.out.println("---------------------");
		
		ConcreteScanner s = new ConcreteScanner("89-89-356");
		System.out.println("Scanner Serial Number: " + s.getSerialNumber());
		s.processDoc("A letter to my friend");
		System.out.println(s.scan());
		
		System.out.println("---------------------");
		
		ComboDevice cd = new ComboDevice("86-23-65");
		System.out.println("ComboDevice Serial Number: " + cd.getSerialNumber());
		cd.processDoc("letter");
		System.out.println(cd.print());
		System.out.println(cd.scan());
	}
}
