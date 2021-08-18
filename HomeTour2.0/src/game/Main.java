package game;

import java.util.Map;
import java.util.Scanner;
import java.util.Map.Entry;

import fixtures.Fixture;
import fixtures.Room;


public class Main {
	static Scanner s = new Scanner(System.in);

	//the main part of the game
	public static void main(String[] args) {
		boolean game = true;
		Player one = new Player();
		one.init();
		
		System.out.println("go will move to the room specified \nlights will flip the light switch \nsit you will set down in current room\n");
		while(game){	
		String[] a = null;
		Map<String, Room> exits = printRoom(one);
		//try and catch to see if the input option is valid
		try {
		a = collectInput(one);
		}catch(java.lang.NullPointerException exception ) {
			System.out.println("Can not go that way");
			
		}
		game = parse(a, one,exits);
	
		}
		
		System.out.println("out");

	}
		
	//prints out description on the room and its exit
	private static Map<String, Room> printRoom(Player one) {
		System.out.println(one.getCurrentRoom().getname()+"\n");
		System.out.println(one.getCurrentRoom().getLongDescription()+"\n");
		Room room = new Room(one.getCurrentRoom().getname(), one.getCurrentRoom().getShortDescription(), one.getCurrentRoom().getLongDescription());
		
		Map<String, Room> exits = room.getExits(one.getCurrentRoom());
		
		return exits;
		
	}

	//takes the user input and put it into an array of commands and direction
	private static String[] collectInput(Player one) {
		String in = s.nextLine();
		String[] input = in.split(" ");
		return input;

	}
		
	//used to determine action being done and change current room if needed
	private static boolean parse(String[] command,Player one,  Map<String, Room> exits) {
		Room room = new Room(null, null, null);
		Room currentRoom = null;
		String zero = command[0];
		
		//used to control what action is performed 
		switch(zero){
		case "go":
			
			//checks to see if a direction was entered
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
		case "quit":
			System.out.println("Quitting");
			return false;
		default:
			System.out.println("Please enter a action(go, lights, sit)");
		}
		return true;
	}

}
