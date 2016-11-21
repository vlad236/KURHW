package Task6;
public class House {
	private int id;
	private int flatNumber;
	private int square;
	private int floor;
	private int countRooms;
	private String street;
	private String buildType;
	private int lifetime;
	
	public House(int id, int flatNumber, int square, int floor, int countRooms, String street, String buildType, int lifetime) {
		this.id = id;
		this.flatNumber = flatNumber;
		this.square = square;
		this.floor = floor;
		this.countRooms = countRooms;
		this.street = street;
		this.buildType = buildType;
		this.lifetime = lifetime;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getFlatNumber() {
		return flatNumber;
	}
	public void setFlatNumber(int flatNumber) {
		this.flatNumber = flatNumber;
	}
	public int getSquare() {
		return square;
	}
	public void setSquare(int square) {
		this.square = square;
	}
	public int getCountRooms() {
		return countRooms;
	}
	public void setCountRooms(int countRooms) {
		this.countRooms = countRooms;
	}
	public int getFloor() {
		return floor;
	}
	public void setFloor(int floor) {
		this.floor = floor;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getBuildType() {
		return buildType;
	}
	public void setBuildType(String buildType) {
		this.buildType = buildType;
	}
	public int getLifetime() {
		return lifetime;
	}
	public void setLifetime(int lifetime) {
		this.lifetime = lifetime;
	}
}
