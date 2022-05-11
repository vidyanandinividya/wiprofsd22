package w4_d3;

import java.util.ArrayList;
import java.util.List;

public class FlightManager {
	private List<FlightService> listVendors=null;
	public FlightManager()
	{
		listVendors=new ArrayList<FlightService>();
	}
	public void addVendor(FlightService fs)
	{
		this.listVendors.add(fs);
	}
	public List<FlightService> getListVendors()
	{
		return listVendors;
	}
}
