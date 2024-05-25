package polymorphism.employee;

public class Commission extends Hourly{
	private double totalSales;
	private double commission;

	public Commission(String eName, String eAddress, String ePhone, String socSecNumber, 
			double rate,  double commission) {
		super(eName, eAddress, ePhone, socSecNumber, rate);
		
		this.commission=commission;
		totalSales=0;
		// TODO Auto-generated constructor stub
	}
	
	public void addSales(double totalSales)
	{
		this.totalSales+=totalSales;
	}
	
}
