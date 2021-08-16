package fixtures;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import game.Player;
import game.RoomManager;


public class Room extends Fixture{
	Map<String,Room> living = new HashMap<>();
	Map<String,Room> dinning = new HashMap<>();
	Map<String,Room> kitchen = new HashMap<>();
	Map<String,Room> laundary = new HashMap<>();
	Map<String,Room> master = new HashMap<>();
	Map<String,Room> hall = new HashMap<>();
	Map<String,Room> bath1 = new HashMap<>();
	Map<String,Room> bed1 = new HashMap<>();
	Map<String,Room> mbath = new HashMap<>();
	Map<String,Room> hall2 = new HashMap<>();
	Map<String,Room> bath2 = new HashMap<>();
	Map<String,Room> bed2 = new HashMap<>();
	
	public void init() {
		RoomManager r = new RoomManager();
		r.init();
		living.put("North", r.rooms[5]);
		living.put("East", r.rooms[1]);
		living.put("West", r.rooms[4]);
		
		dinning.put("North", r.rooms[2]);
		dinning.put("West", r.rooms[0]);
		
		kitchen.put("North", r.rooms[3]);
		kitchen.put("South", r.rooms[1]);

		laundary.put("South",r.rooms[2]);

		master.put("East",r.rooms[0]);
		master.put("West",r.rooms[8]);
		
		hall.put("North",r.rooms[6]);
		hall.put("East",r.rooms[7]);
		hall.put("South",r.rooms[0]);
		hall.put("West",r.rooms[9]);

		bath1.put("South",r.rooms[5]);

		bed1.put("West",r.rooms[5]);

		mbath.put("East",r.rooms[4]);

		hall2.put("East",r.rooms[11]);
		hall2.put("South",r.rooms[5]);
		hall2.put("West",r.rooms[10]);

		bath2.put("East",r.rooms[9]);

		bed2.put("West",r.rooms[9]);


	}

	public Room(String name, String shortDescription, String longDescription) {
		super(name, shortDescription, longDescription);
		
	}
		
	public Map<String, Room> getExits(Room currentRoom) {
		RoomManager r = new RoomManager();
		r.init();
		init();
		String a = currentRoom.getname();
		
		
		switch (a) {
		case "The Living Room":
			
			for (Entry<String, Room> entry : living.entrySet()) {
			    System.out.println(entry.getKey()+": "+entry.getValue().getname());
			}
			
			return living;
		case "The Dinning Room":
			for (Entry<String, Room> entry : dinning.entrySet()) {
			    System.out.println(entry.getKey()+": "+entry.getValue().getname());
			}
			
			return dinning;
		case "The Kitchen":
			for (Entry<String, Room> entry : kitchen.entrySet()) {
			    System.out.println(entry.getKey()+": "+entry.getValue().getname());
			}
			
			return kitchen;
		case "The Laundary Room":
			for (Entry<String, Room> entry : laundary.entrySet()) {
			    System.out.println(entry.getKey()+": "+entry.getValue().getname());
			}
			
			return laundary;
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
		
	public Room getExit(String direction, Map<String, Room> Room,Player one) {
		//inputs: direction and exits
		init();
		//look at keys and display value
		Room room = one.getCurrentRoom();
		RoomManager r = new RoomManager();
		r.init();
		try {
		for (Entry<String, Room> entry : Room.entrySet()) {
			String a=entry.getKey().toString().toLowerCase();
			if(a.equalsIgnoreCase(direction))
			{
				room =entry.getValue();
		    
		    return room;
			}
		}}catch(java.lang.NullPointerException exception ) {
		
		}
		System.out.println("Can not go that way");
		return room;

		
		
		
	}



}
