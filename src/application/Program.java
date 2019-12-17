package application;

import entities.Printer;
import entities.Scanner;

public class Program {
	public static void main(String[] args) {
		
		Printer p = new Printer("12467");
		System.out.println("Printer Serial Number: " + p.getSerialNumber());
		p.processDoc("A letter to my friend");
		p.print();
		
		System.out.println("---------------------");
		
		Scanner s = new Scanner("89-89-356");
		System.out.println("Scanner Serial Number: " + s.getSerialNumber());
		s.processDoc("A letter to my friend");
		System.out.println(s.scan());;
	}
}
