package game;

import java.util.Map;
import java.util.Scanner;
import java.util.Map.Entry;

import fixtures.Fixture;
import fixtures.Room;


public class Main {
	
	public static void main(String[] args) {
		
		Player one = new Player();
		one.init();
		
		System.out.println("go will move to the room specified \nlights will flip the light switch \nsit you will set down in current room\n");
		while(true){	
			String[] a = null;
		Map<String, Room> exits = printRoom(one);	
		try {
		a = collectInput(one);
		}catch(java.lang.NullPointerException exception ) {
			System.out.println("Can not go that way");
			
		}
		parse(a, one,exits);
			
			
		}
		
		

	}
		
	private static Map<String, Room> printRoom(Player one) {
		
		
		System.out.println(one.getCurrentRoom().getname()+"\n");
		System.out.println(one.getCurrentRoom().getLongDescription()+"\n");
		Room room = new Room(one.getCurrentRoom().getname(), one.getCurrentRoom().getShortDescription(), one.getCurrentRoom().getLongDescription());
		
		Map<String, Room> exits = room.getExits(one.getCurrentRoom());
		
		return exits;
		
	}

	private static String[] collectInput(Player one) {
		Scanner s = new Scanner(System.in);
		String in = s.nextLine();
		String[] input = in.split(" ");
		return input;

	}
		
	private static void parse(String[] command,Player one,  Map<String, Room> exits) {
		Room room = new Room(null, null, null);
		Room currentRoom = null;
		String zero = command[0];
		
		switch(zero){
		case "go":
			try {
			currentRoom = room.getExit(command[1], exits,one);
			one.setCurrentRoom(currentRoom);
			}catch(java.lang.ArrayIndexOutOfBoundsException exception){
				System.out.println("Please enter a direction after go");
			}
			break;
		case "lights":
			System.out.println("The light switch was flipped for the "+one.getCurrentRoom().getname()+"\n");
			break;
		case "sit":
			System.out.println("You sat on the "+one.getCurrentRoom().getname() +"'s floor");
			break;
		default:
			System.out.println("Please enter a action(go, lights, sit)");
		}
		
	}

}
