package Table;

public class School extends Organization{
	// Attributes...
	private String name;
	private String country;
	private String city;
	private boolean top100;
	
	// Constructor...
	School(String name, String country , String city, boolean top100){
		super(name,country,city);
		this.top100 = top100;	
	}
	
	public void setTop100(boolean top100){ this.top100 = top100;}
	
	public boolean getTop100(){ return top100;}
}
