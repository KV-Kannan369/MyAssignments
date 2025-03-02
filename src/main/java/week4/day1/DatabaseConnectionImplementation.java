package week4.day1;

public class DatabaseConnectionImplementation implements DatabaseConnection{
	
	@Override
	public void connect() {
		
		System.out.println("Database Connected");
	}

	@Override
	public void disconnect() {
		System.out.println("Database DisConnected");
		
	}

	@Override
	public void executeUpdate() {
		System.out.println("Database Updated");
	}


	public static void main(String[] args) {
		DatabaseConnectionImplementation db = new DatabaseConnectionImplementation();
		db.connect();
		db.disconnect();
		db.executeUpdate();

	}

	
}
