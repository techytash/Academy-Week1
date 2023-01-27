package introtojava;

import java.util.Scanner;

	public class AdventureGame {
	 public static void main(String[] args) {
		  Scanner scan = new Scanner(System.in);
		  System.out.println("\n\n You are on an island surrounded by water. \n Which way do you want to go (n,e,s,w)?");
		  String command = scan.nextLine();
		  if (command.equals("n")) 
	  {
		    System.out.println("You enter the forest and hear some rustling. \nThere may be tigers here or maybe it's just monkeys.");
	  	} else if (command.equals("s")) {
			 System.out.println("You see different flocks of birds heading in the opposite direction. \nThere may be danger or weather issues ahead.");
	  	} else if (command.equals("e")) {
	  		System.out.println("Wow, a stream! This could be drinking water. \nThere has to be a way to collect some water to drink.");
	  	} else if (command.equals("w")) {
	  		System.out.println("Looks like there's a small building or shed up ahead. \nMaybe there's some food or tools.");
	  	} else {
		    // Add else-ifs for s, e, and an else for any other input
		    
		    
		  System.out.println("End of adventure!");   
		  scan.close();
	  	}
	}

}
