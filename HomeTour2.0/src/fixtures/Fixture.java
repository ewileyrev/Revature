package fixtures;

public class Fixture {
	
	private String name;
	private String shortDescription;
	private String longDescription;
	
	public Fixture(String name, String shortDescription, String longDescription) {
		this.name = name;
		this.setShortDescription(shortDescription);
		this.setLongDescription(longDescription);
		}
	
	//used to get the name of the room
	public String getname() {
		return this.name;
	}
	
	//used to get the short of the room
	public String getShortDescription() {
		return shortDescription;
	}
	
	//used to set the short description of the room
	public void setShortDescription(String shortDescription) {
		this.shortDescription = shortDescription;
	}

	//used to get the long description
	public String getLongDescription() {
		return longDescription;
	}

	//used to set the long description
	public void setLongDescription(String longDescription) {
		this.longDescription = longDescription;
	}
	}
