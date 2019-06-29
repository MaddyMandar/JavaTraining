package assignment.day12;

public class Address {

	private String streetAdrs;
	private String areaAdr;
	private String cityAdrs;
	private String stateAdrs;
	
	public Address(String streetAdrs, String areaAdr, String cityAdrs, String stateAdrs) {
		super();
		this.streetAdrs = streetAdrs;
		this.areaAdr = areaAdr;
		this.cityAdrs = cityAdrs;
		this.stateAdrs = stateAdrs;
	}

	public Address() {
		super();
		
	}
	
	public void displayAddress() {
		System.out.println(this.streetAdrs + "\t" + this.areaAdr + "\t" + this.cityAdrs + "\t" + this.stateAdrs);
	}
	
	
}
