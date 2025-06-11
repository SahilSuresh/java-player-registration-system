package main;

import java.util.ArrayList;

import lib.Player;

public class PlayerApp {

	public static String execute(ArrayList<Player> participants, int number) {
		
		
		StringBuilder GamerTag = new StringBuilder();
		
		for (Player i: participants) {
			if (i.getGamerTag().toLowerCase().contains(i.getName().getFamilyName().toLowerCase())
					&& i.getGamerTag().endsWith(Integer.toString(number))) {
				
				String FirstPart = i.getName().getFirstName().toUpperCase() + ", ";
				
				String SecondPart = i.getName().getFamilyName().toLowerCase() + "\n";
				
				GamerTag.append (FirstPart + SecondPart);
				
			}
					
		}
				
		return GamerTag.toString();
	}
	
}
