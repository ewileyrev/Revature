package game;

import fixtures.Room;

public class RoomManager {
public Room[] rooms = new Room[12];
Room startingRoom;

	//defines the rooms 
public void init() {

		
		Room living = new Room(
				"The Living Room",
				"A living room with a couch and tv",
				"The living room to the house. A dining room is open to the east. A door to the west leading to the master bedroom, and a hallway to the north."
				);
		this.rooms[0] = living;
		this.startingRoom = living;
		
		Room DiningRoom = new Room(
				"The Dining Room",
				"A dinning room with a table",
				"This open dining room has window to the east and south to let in the morning sun. A glass table seats in the middle of the room."
				);
		this.rooms[1] = DiningRoom;
		
		Room Kitchen = new Room(
				"The Kitchen",
				"Kitchen with cooking food",
				"A long kitchen with black countertops and food in the oven."
				);
		this.rooms[2] = Kitchen;
				
		Room laundryRoom = new Room(
				"The laundry Room",
				"A small laundry room",
				"A small room with only a washer and dryer in it."
				);
		this.rooms[3] = laundryRoom;
		
		Room MasterRoom = new Room(
				"The Master Bedroom",
				"A big bedroom",
				"The best bedroom in the house with a master bath connected to the west of it."
				);
		this.rooms[4] = MasterRoom;
		
		Room Hall = new Room(
				"A small Hallway",
				"A hallway",
				"A small hallway used to move upstairs to the west, a bathroom to the north and a bedroom to the east."
				);
		this.rooms[5] = Hall;
		
		Room Bath1 = new Room(
				"Downstairs Bathroom",
				"A half bath bathroom",
				"A small half bath for guess to use."
				);
		this.rooms[6] = Bath1;
		
		Room Bed1 = new Room(
				"Downstairs Bedroom",
				"A small downstairs bedroom",
				"A small bedroom that is being used as a gameroom."
				);
		this.rooms[7] = Bed1;
		
		Room Masterbath = new Room(
				"The Master Bathroom",
				"A master bathroom",
				"A big bathroom that is connected to the master bedroom to the east."
				);
		this.rooms[8] = Masterbath;
		
		Room Hall2 = new Room(
				"A small upstairs Hallway",
				"A upstairs hallway",
				"A hallyway upstiars that connects to a bedroom to the east and a bathroom to the west."
				);
		this.rooms[9] = Hall2;
		
		Room Bath2 = new Room(
				"Upstairs Bathroom",
				"A upstairs bathroom",
				"A bathroom upstairs for the upstair bedroom."
				);
		this.rooms[10] = Bath2;
		
		Room Bed2 = new Room(
				"Upstairs Bedroom",
				"A upstairs bedroom",
				"A upstairs bedroom with a beautiful view out the window to the east."
				);
		this.rooms[11] = Bed2;
		
	}





}
