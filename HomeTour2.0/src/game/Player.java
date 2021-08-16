package game;

import fixtures.Room;

public class Player {

	private Room currentRoom;
	
	public void init() {
	RoomManager r = new RoomManager();
	r.init();
		
	setCurrentRoom(r.startingRoom);
	}

	public Room getCurrentRoom() {
		return currentRoom;
	}

	public void setCurrentRoom(Room currentRoom) {
		this.currentRoom = currentRoom;
	}

}
