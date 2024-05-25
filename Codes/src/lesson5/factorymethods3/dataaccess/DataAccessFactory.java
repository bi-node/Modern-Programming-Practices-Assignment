package lesson5.factorymethods3.dataaccess;

public class DataAccessFactory {
	public static DataAccess getDataAccess() {
		return new DataAccessSystem();
	}
}
