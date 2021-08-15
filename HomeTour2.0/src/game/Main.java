package game;

import java.util.Scanner;

import fixtures.Fixture;
import fixtures.Room;


public class Main {
	
	public static void main(String[] args) {
		
		Player one = new Player();
		one.init();
		while(true){
		Room[] exits = printRoom(one);
		String[] a = collectInput(one);
		parse(a, one,exits);
		
		}
		

	}
		
	private static Room[] printRoom(Player one) {
		System.out.println(one.currentRoom.getname()+"\n");
		System.out.println(one.currentRoom.getLongDescription()+"\n");
		Room room = new Room(one.currentRoom.getname(), one.currentRoom.getShortDescription(), one.currentRoom.getLongDescription());
		Room[] exits = room.getExits(one.currentRoom);
		return exits;
	}

	private static String[] collectInput(Player one) {
		Scanner s = new Scanner(System.in);
		String in = s.nextLine();
		String[] input = in.split(" ");
		return input;

	}
		
	private static void parse(String[] command,Player one,  Room[] exit) {
		Room room = new Room(null, null, null);
		int a = room.getExit(command[1]);
		one.currentRoom = exit[a];
		System.out.println("");
		
	}

}
