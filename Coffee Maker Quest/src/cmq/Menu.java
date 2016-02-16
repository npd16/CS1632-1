package cmq;

import java.util.*;

public class Menu {

	private int current;
	public boolean coffee, cream, sugar;
	ArrayList<String> inventory;
	
	public Menu(){
		current = 0;
		inventory = new ArrayList<String>();
		coffee = false;
		cream = false;
		sugar = false;;
	}
	
	public int getRoom(){
		return current;
	}
	
	public void updateRoom(String d,Rooms map){
		if(d.equalsIgnoreCase("N") && map.nRoomExist(current)){
			current++;
		}
		else if(d.equalsIgnoreCase("S") && map.sRoomExist(current)){
			current--;
		}
		else{
			System.out.println("A door does not exist in that direction, please choose another way!");
		}
	}
	
	public void addItem(String item){
        inventory.add(item);
    }
	
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
