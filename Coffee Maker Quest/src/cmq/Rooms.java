package cmq;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Rooms {
	private ArrayList<String> roomDesc;
	private ArrayList<String> nDoorDesc;
	private ArrayList<String> sDoorDesc;
	private ArrayList<String> furnitureList;
	private Map<String,String> itemList;
	
	//Adds all of the descriptors into the appropriate Array Lists or Hash Maps
	public Rooms(){
		roomDesc = new ArrayList<String>();
		roomDesc.add("Small");
		roomDesc.add("Funny");
		roomDesc.add("Refinanced");
		roomDesc.add("Dumb");
		roomDesc.add("Bloodthirsty");
		roomDesc.add("Rough");
		
		nDoorDesc = new ArrayList<String>();
		sDoorDesc = new ArrayList<String>();
		nDoorDesc.add("Magenta");
		nDoorDesc.add("Beige");
		sDoorDesc.add("Massive");
		nDoorDesc.add("Dead");
		sDoorDesc.add("Smart");
		nDoorDesc.add("Vivacious");
		sDoorDesc.add("Slim");
		nDoorDesc.add("Purple");
		sDoorDesc.add("Sandy");
		sDoorDesc.add("Minimalist");
		
		furnitureList = new ArrayList<String>(); 
        furnitureList.add("Quaint sofa");
        furnitureList.add("Sad record player");
        furnitureList.add("Tight pizza");
        furnitureList.add("Flat energy drink");
        furnitureList.add("Beautiful bag of money");
        furnitureList.add("Perfect air hockey table");
        
        itemList = new HashMap<String,String>();
        itemList.put(roomDesc.get(2), "Coffee");
        itemList.put(roomDesc.get(0), "Cream");
        itemList.put(roomDesc.get(5), "Sugar");
	}
	
	//Does the room exist
	public boolean roomExist(String s){
		return roomDesc.contains(s);
	}
	
	//Does the item exist
	public boolean itemExist(int current){
        return itemList.containsKey(roomDesc.get(current));       
    }
	
	//Checks if a north room or door exists
	public boolean nRoomExist(int current){
		if (current >= 0 && current < 5)
			return true;
		else
			return false;
	}
	//Checks if a south room or door exists
	public boolean sRoomExist(int current){
		if (current > 0 && current <= 5)
			return true;
		else
			return false;
	}
	
	//Prints the description of the room
	public void printRoom(int current){
		System.out.println("You see a " + roomDesc.get(current) + " room.");
	}
	
	//Prints north and south doors if available
	public void printDoor(int current){
		if(nRoomExist(current)){
			System.out.println("A " + nDoorDesc.get(current) + " door leads North");
		}
		if(sRoomExist(current)){
			System.out.println("A " + sDoorDesc.get(current-1) + " door leads South");
		}
	}
	
	//Gets the item that was in the current room
	public String getItem(int current){
        return itemList.get(roomDesc.get(current));
    }
    
	
	//Prints out which furniture it has in it
	public void printFurniture(int current){
        System.out.println("It has a " + furnitureList.get(current));
    }
}
