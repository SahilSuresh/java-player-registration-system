package main;

import lib.Name;
import lib.Register;

public class RegisterApp {

	public static String execute(Name nm, Register regst) {	
		
		
		regst.removeName(1);
		
		regst.addName(nm);
		
		StringBuilder gmail= new StringBuilder();
		
		for(int i = 0; i < regst.sizeOfRegister(); i++) {
			
			if (regst.getName(i).getFirstName().contains("a") ||
					regst.getName(i).getFirstName().contains("e")) {
				
				String firstName = regst.getName(i).getFirstName().toLowerCase().substring(0, 1) + ".";
				
				String secondName =  regst.getName(i).getFamilyName().toLowerCase().substring(0,3) + "@email.com\n";
				
				 gmail.append(firstName + secondName);
				
			}
		}
	
		
		return gmail.toString();
	}
}