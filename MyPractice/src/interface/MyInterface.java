package interface;
import javax.swing.table.DefaultTableModel;

public interface MyInterface {
	
	default double sum(int x, int y)
	{
		return x+y;
	}
	static double applyDistance()
	{
		return 34.35;
	}
	

}
