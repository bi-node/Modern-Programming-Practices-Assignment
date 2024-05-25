package backend;

public abstract  class Box {
	int value;
	Position position;
	Box(int value, Position position) {
		this.value = value;
		this.position = position;
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	public Position getPosition() {
		return position;
	}
	public void setPosition(Position position) {
		this.position = position;
	}
	
	
	
	

	
	

}
