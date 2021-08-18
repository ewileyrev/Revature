package game;

import fixtures.Room;

public class Player {

	private Room currentRoom;
	
	//used to set the players current room
	public void init() {
	RoomManager r = new RoomManager();
	r.init();
	//sets the starting room of the player
	setCurrentRoom(r.startingRoom);
	}

	//gets the current room the player is in
	public Room getCurrentRoom() {
		return currentRoom;
	}

	//changes the room the player is in
	public void setCurrentRoom(Room currentRoom) {
		this.currentRoom = currentRoom;
	}

}
