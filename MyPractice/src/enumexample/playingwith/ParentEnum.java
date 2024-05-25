package enumexample.playingwith;



public interface ParentEnum {
	public double multiply(int x, int y);
	default double add(int x, int y)
	{
		return x+y;
	}
	public double divide(int x, int y);
	

}
