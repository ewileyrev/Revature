package fixtures;

import game.Player;
import game.RoomManager;

public class Room extends Fixture{
	
	private Room[] exits;

	public Room(String name, String shortDescription, String longDescription) {
		super(name, shortDescription, longDescription);
		this.exits = new Room[4]; // size is your choice
	}
		
	public Room[] getExits(Room currentRoom) {
		RoomManager r = new RoomManager();
		r.init();
		String a = currentRoom.getname();
		switch (a) {
		case "The Living Room":
			System.out.println("Exits");
			System.out.println("North: " + r.rooms[5].getname());
			System.out.println("East: "+r.rooms[1].getname());
			System.out.println("West: "+r.rooms[4].getname());
			
			exits[0] = r.rooms[5];
			exits[1] = r.rooms[1];
			exits[3] = r.rooms[4];

			
			break;
		case "The Dinning Room":
			System.out.println("Exits");
			System.out.println("North: "+r.rooms[2].getname());
			System.out.println("west: "+r.rooms[0].getname());
			
			exits[0] = r.rooms[2];
			exits[3] = r.rooms[0];
			
			break;
		case "The Kitchen":
			System.out.println("Exits");
			System.out.println("North "+r.rooms[3].getname());
			System.out.println("South: "+r.rooms[1].getname());
			
			exits[0] = r.rooms[3];
			exits[2] = r.rooms[1];
					
			break;
		case "The Laundary Room":
			System.out.println("Exits");
			System.out.println("South: "+r.rooms[2].getname());
						
			exits[2] = r.rooms[2];
			
			break;
		case "The Master Bedroom":
			System.out.println("Exits");
			System.out.println("East: "+r.rooms[0].getname());
			System.out.println("West: "+r.rooms[8].getname());
			
			exits[1] = r.rooms[0];
			exits[3] = r.rooms[8];
					
			break;
		case "A small Hallway":
			System.out.println("Exits");
			System.out.println("North: "+r.rooms[6].getname());
			System.out.println("East: "+r.rooms[7].getname());
			System.out.println("South: "+r.rooms[0].getname());
			System.out.println("West: "+r.rooms[9].getname());
			
			exits[0] = r.rooms[6];
			exits[1] = r.rooms[7];
			exits[2] = r.rooms[0];
			exits[3] = r.rooms[9];
			
			break;
		case "Downstairs Bathroom":
			System.out.println("Exits");
			System.out.println("South: "+r.rooms[5].getname());
			
			exits[2] = r.rooms[5];
			
			break;
		case "Downstairs Bedroom":
			System.out.println("Exits");
			System.out.println("West: "+r.rooms[5].getname());
			
			exits[3] = r.rooms[5];
			
			break;
		case "The Master Bathroom":
			System.out.println("Exits");
			System.out.println("East: "+r.rooms[4].getname());
			
			exits[1] = r.rooms[4];
			
			break;
		case "A small upstairs Hallway":
			System.out.println("Exits");
			System.out.println("East: "+r.rooms[11].getname());
			System.out.println("South: "+r.rooms[5].getname());
			System.out.println("Weat: "+r.rooms[10].getname());
			
			exits[1] = r.rooms[11];
			exits[2] = r.rooms[9];
			exits[3] = r.rooms[10];
			
			break;
		case "Upstairs Bathroom":
			System.out.println("Exits");
			System.out.println("East: "+r.rooms[9].getname());
			
			exits[1] = r.rooms[9];
			
			break;
		case "Upstairs Bedroom":
			System.out.println("Exits");
			System.out.println("West: "+r.rooms[9].getname());
			
			exits[3] = r.rooms[9];
			
			break;
		
		}
		return exits;
		
	}
		
	public int getExit(String direction) {
		int a = 0;
	switch(direction) {
		case "north":
			a = 0;
			break;
		case "east":
			a = 1;
			break;
		case "south":
			a = 2;
			break;
		case "west":
			a=3;	
			break;
		}
	return a;
		
		
	}



}
