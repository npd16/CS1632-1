package cmq;

import java.util.Scanner;

public class Game {
	public static void main(String[] args){
		System.out.println("Welcome to Coffee Maker Quest 2.0");
		
		Menu menu = new Menu();
		Rooms map = new Rooms();
		Commands commands = new Commands();
		Scanner in = new Scanner(System.in);
		int current;
		String input;
		
		while(true){
			System.out.println("");
			current = menu.getRoom();
			map.printRoom(current);
			map.printFurniture(current);
			map.printDoor(current);
			
			System.out.println("\n INSTRUCTIONS (N,S,L,I,H,D) > ");
			input = in.nextLine();
			
			if(commands.validCommand(input)){
				commands.doCommand(input, map, menu);
			}
			else{
				commands.printInvalid();
			}
			
			
		}
		
	}
}
