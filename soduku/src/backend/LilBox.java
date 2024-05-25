package backend;

public class LilBox extends Box {
	LilBox(int value, Position position, Boxie boxie) {
		super(value, position);
		this.boxie=boxie;
		// TODO Auto-generated constructor stub
	}

	Boxie boxie;
	
	public String getRow()
	{
		return boxie.getPosition().getX();
	}
	
	public String getColumn()
	{
		return boxie.getPosition().getY();
	}
	

}
