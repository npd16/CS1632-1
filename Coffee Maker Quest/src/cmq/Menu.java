package cmq;
//By Nicholas Carone & Nicholas DeFranco
//Deliverable 2

import java.util.*;

public class Menu {

	public int current;
	public boolean coffee, cream, sugar;
	ArrayList<String> inventory;
	
	public Menu(){
		current = 0;
		inventory = new ArrayList<String>();
		coffee = false;
		cream = false;
		sugar = false;;
	}
	
	//Get current room
	public int getRoom(){
		return current;
	}
	
	//Moving to a new room
	public int updateRoom(String d,Rooms map){
		if(d.equalsIgnoreCase("N") && map.nRoomExist(current)){
			current++;
			return 1;
		}
		else if(d.equalsIgnoreCase("S") && map.sRoomExist(current)){
			current--;
			return -1;
		}
		else{
			System.out.println("A door does not exist in that direction, please choose another way!");
			return 0;
		}
	}
	
	//Add item to the inventory
	public void addItem(String item){
        inventory.add(item);
    }
	
	//Printing out inventory
	public void printInventory(){ 
		//It'll check the ingredients in inventory and print them out accordingly
        for(String str : inventory){
        	if(str.equalsIgnoreCase("Coffee")){
        		System.out.println("You have a cup of delicious coffee.");
                coffee = true;
            }
            else if(str.equalsIgnoreCase("Cream")){
                System.out.println("You have some fresh cream.");
                cream = true;
            }
            else if(str.equalsIgnoreCase("Sugar")){
                System.out.println("You have some tasty sugar.");
                sugar = true;
            }
        }
        //If we don't have an ingredient
        if(!coffee){
            System.out.println("YOU HAVE NO COFFEE!");
        }
        if(!cream){
            System.out.println("YOU HAVE NO CREAM!");
        }
        if(!sugar){
            System.out.println("YOU HAVE NO SUGAR!");
        }     
    }
	
}
