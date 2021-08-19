package fixtures;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import game.Player;
import game.RoomManager;


public class Room extends Fixture{
	
	//create a map of each room to find the exits
	Map<String,Room> living = new HashMap<>();
	Map<String,Room> dining = new HashMap<>();
	Map<String,Room> kitchen = new HashMap<>();
	Map<String,Room> laundry = new HashMap<>();
	Map<String,Room> master = new HashMap<>();
	Map<String,Room> hall = new HashMap<>();
	Map<String,Room> bath1 = new HashMap<>();
	Map<String,Room> bed1 = new HashMap<>();
	Map<String,Room> mbath = new HashMap<>();
	Map<String,Room> hall2 = new HashMap<>();
	Map<String,Room> bath2 = new HashMap<>();
	Map<String,Room> bed2 = new HashMap<>();
	
	
	//used to define the rooms exits
	public void init() {
		RoomManager r = new RoomManager();
		r.init();
		//living Room exits
		living.put("North", r.rooms[5]);
		living.put("East", r.rooms[1]);
		living.put("West", r.rooms[4]);
		
		//dining Room exits
		dining.put("North", r.rooms[2]);
		dining.put("West", r.rooms[0]);
		
		//kitchen exits
		kitchen.put("North", r.rooms[3]);
		kitchen.put("South", r.rooms[1]);

		//laundry exits
		laundry.put("South",r.rooms[2]);

		//master bedroom exits
		master.put("East",r.rooms[0]);
		master.put("West",r.rooms[8]);
		
		//downstairs hallway exits
		hall.put("North",r.rooms[6]);
		hall.put("East",r.rooms[7]);
		hall.put("South",r.rooms[0]);
		hall.put("West",r.rooms[9]);
		
		//downstairs bathroom
		bath1.put("South",r.rooms[5]);

		//downstairs bedroom
		bed1.put("West",r.rooms[5]);

		//master bath
		mbath.put("East",r.rooms[4]);

		//upstairs hallway
		hall2.put("East",r.rooms[11]);
		hall2.put("South",r.rooms[5]);
		hall2.put("West",r.rooms[10]);

		//upstairs bathroom
		bath2.put("East",r.rooms[9]);

		//upstairs bedroom
		bed2.put("West",r.rooms[9]);


	}

	public Room(String name, String shortDescription, String longDescription) {
		super(name, shortDescription, longDescription);
		
	}
		
	//display exits of current room and returns the exits
	public Map<String, Room> getExits(Room currentRoom) {
		RoomManager r = new RoomManager();
		r.init();
		init();
		String a = currentRoom.getname();
		
		//used to display the exits for the current room and return the room map
		switch (a) {
		case "The Living Room":
			
			for (Entry<String, Room> entry : living.entrySet()) {
			    System.out.println(entry.getKey()+": "+entry.getValue().getname());
			}
			
			return living;
		case "The dining Room":
			for (Entry<String, Room> entry : dining.entrySet()) {
			    System.out.println(entry.getKey()+": "+entry.getValue().getname());
			}
			
			return dining;
		case "The Kitchen":
			for (Entry<String, Room> entry : kitchen.entrySet()) {
			    System.out.println(entry.getKey()+": "+entry.getValue().getname());
			}
			
			return kitchen;
		case "The laundry Room":
			for (Entry<String, Room> entry : laundry.entrySet()) {
			    System.out.println(entry.getKey()+": "+entry.getValue().getname());
			}
			
			return laundry;
		case "The Master Bedroom":
			for (Entry<String, Room> entry : master.entrySet()) {
			    System.out.println(entry.getKey()+": "+entry.getValue().getname());
			}
					
			return master;
		case "A small Hallway":
			for (Entry<String, Room> entry : hall.entrySet()) {
			    System.out.println(entry.getKey()+": "+entry.getValue().getname());
			}
			
			return hall;
		case "Downstairs Bathroom":
			for (Entry<String, Room> entry : bath1.entrySet()) {
			    System.out.println(entry.getKey()+": "+entry.getValue().getname());
			}
			
			return bath1;
		case "Downstairs Bedroom":
			for (Entry<String, Room> entry : bed1.entrySet()) {
			    System.out.println(entry.getKey()+": "+entry.getValue().getname());
			}
			
			return bed1;
		case "The Master Bathroom":
			for (Entry<String, Room> entry : mbath.entrySet()) {
			    System.out.println(entry.getKey()+": "+entry.getValue().getname());
			}
			
			return mbath;
		case "A small upstairs Hallway":
			for (Entry<String, Room> entry : hall2.entrySet()) {
			    System.out.println(entry.getKey()+": "+entry.getValue().getname());
			}
			
			return hall2;
		case "Upstairs Bathroom":
			for (Entry<String, Room> entry : bath2.entrySet()) {
			    System.out.println(entry.getKey()+": "+entry.getValue().getname());
			}
			
			return bath2;
		case "Upstairs Bedroom":
			for (Entry<String, Room> entry : bed2.entrySet()) {
			    System.out.println(entry.getKey()+": "+entry.getValue().getname());
			}
			
			return bed2;
		
		}
		
		return null;
		
		
	}
		
	//returns next room if direction is valid
	public Room getExit(String direction, Map<String, Room> Room,Player one) {
		//inputs: direction and exits
		init();
		//look at keys and display value
		Room room = one.getCurrentRoom();
		RoomManager r = new RoomManager();
		r.init();
		
		//checks to see if the direction entered is valid and return the new room
		for (Entry<String, Room> entry : Room.entrySet()) {
			String a=entry.getKey().toString().toLowerCase();
			if(a.equalsIgnoreCase(direction))
			{
				room =entry.getValue();
		    
		    return room;
			}
		}
		System.out.println("Please enter a valid direction");
		return room;

		
		
		
	}
}
