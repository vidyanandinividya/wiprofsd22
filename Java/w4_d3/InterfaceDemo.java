package w4_d3;

public class InterfaceDemo {
	private static FlightManager flightmanager=new FlightManager();

	public static void main(String[] args) {
		loadVendors();
		// TODO Auto-generated method stub
		System.out.println("Get all Flights....");
		for(FlightService fs:flightmanager.getListVendors())
		{
			fs.getAllFlights();
		}
		System.out.println("Do Booking");
		for(FlightService fs:flightmanager.getListVendors())
		{
			fs.doBooking();
		}

	}
	private static void loadVendors()
	{
		flightmanager.addVendor(new AirIndia());
		flightmanager.addVendor(new Emirates());
	}

}
