package cmq;
//By Nicholas Carone & Nicholas DeFranco
//Deliverable 2

import java.util.Scanner;

public class Game {
	public static void main(String[] args){
		System.out.println("Welcome to Coffee Maker Quest 2.0");
		
		//Setting up components of game
		Menu menu = new Menu();
		Rooms map = new Rooms();
		Commands commands = new Commands();
		Scanner in = new Scanner(System.in);
		int current;
		String input;
		
		//Loop that will make game run
		while(true){
			//Description of Room
			System.out.println("");
			current = menu.getRoom();
			map.printRoom(current);
			map.printFurniture(current);
			map.printDoor(current);
			
			//Instruction handler
			System.out.println("\n INSTRUCTIONS (N,S,L,I,H,D) > ");
			input = in.nextLine();
			
			//Valid Command was entered
			if(commands.validCommand(input)){
				commands.doCommand(input, map, menu);
			}
			//Invalid Command was entered
			else{
				commands.printInvalid();
			}
		}
		
	}
}
