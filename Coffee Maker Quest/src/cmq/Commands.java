package cmq;

import java.util.*;

public class Commands {

	private ArrayList<String> commands;
	
	public Commands(){
		commands = new ArrayList<String>();
		commands.add("N");
		commands.add("S");
		commands.add("L");
		commands.add("I");
		commands.add("H");
		commands.add("D");
	}
	
	public boolean validCommand(String c){
		return commands.contains(c.toUpperCase());
	}
	
	public void printHelp(){
		System.out.println("Command List:");
		System.out.println("N: Move north if a northern door exists.");
		System.out.println("S: Move south if a southern door exists.");
		System.out.println("L: Look to see if any ingredients are in the room.");
		System.out.println("I: Displays current inventory.");
		System.out.println("H: Displays this help screen.");
		System.out.println("D: Drink the finished cup of coffee if you possess all the ingredients.");
	}
	
	public void printInvalid(){
		System.out.println("What?");
	}
	
	public void doCommand(String c, Rooms map, Menu m){
		int current = m.getRoom();
		
		if(c.equalsIgnoreCase("N") || c.equalsIgnoreCase("S")){
            m.updateRoom(c, map);
        }
		else if(c.equalsIgnoreCase("L")){
            // Check to see if there is something in this room
            if(map.itemExist(current)){
                System.out.println("There might be something here...");
                String item = map.getItem(current);
                System.out.println("You found some " + item + "! It has been added to your inventory.");
                m.addItem(item);
            }
            else {
                System.out.println("You don't see anything out of the ordinary.");
            }
        }
		else if(c.equalsIgnoreCase("I")){
            m.printInventory();
        }
		else if(c.equalsIgnoreCase("H")){
            printHelp();
        }
		else if(c.equalsIgnoreCase("D")){
				m.printInventory();
				System.out.println("");
				
				if(m.coffee == true && m.cream == false && m.sugar == false){
					System.out.println("Without cream, you get an ulcer and cannot study.\nYou lose!");
					System.exit(1);
				}
				else if(m.coffee == false && m.cream == true && m.sugar == false){
					System.out.println("You drink the cream, but without caffeine, you cannot study. \nYou lose!");
					System.exit(1);
				}
				else if(m.coffee == false && m.cream == false && m.sugar == true){
					System.out.println("You eat the sugar, but without caffeine, you cannot study.\nYou lose!");
					System.exit(1);
				}
				else if(m.coffee == true && m.cream == true && m.sugar == false){
					System.out.println("Without sugar, the coffee is too bitter. You cannot study.\nYou lose!");
				}
				else if(m.coffee == true && m.cream == false && m.sugar == true){
					System.out.println("Without cream, you get an ulcer and cannot study.\nYou lose!");
					System.exit(1);
				}
				else if(m.coffee == false && m.cream == true && m.sugar == true){
					System.out.println("You drink the sweetened cream, but without caffeine, you cannot study.\nYou lose!");
					System.exit(1);
				}
				else if(m.coffee == false && m.cream == false && m.sugar == false){
					System.out.println("You drink the air, as you have no coffee, sugar, or cream."
							+ "\nThe air is invigorating, but not invigorating enough. "
							+ "You cannot study.\nYou lose!");
					System.exit(1);
				}
				else{
					System.out.println("You drink the beverage and are ready to study!\nYou win!");
					System.exit(0);
				}
	        }
	}
	
}
