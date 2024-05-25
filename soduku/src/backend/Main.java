package backend;

public class Main {
	
	public static void main(String[] args) {
		Position position=new Position("A", "1");
		Position p=new Position("X", "P");
		Boxie boxie=new Boxie(0, p);
		
		LilBox box=new LilBox(4, position, boxie);
		System.out.println(box.getColumn());
		
		
		
	}

}
