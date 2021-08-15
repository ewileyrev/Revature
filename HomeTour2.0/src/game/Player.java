package game;

import fixtures.Room;

public class Player {

	Room currentRoom;
	
	public void init() {
	RoomManager r = new RoomManager();
	r.init();
		
	currentRoom= r.startingRoom;
	}

}
