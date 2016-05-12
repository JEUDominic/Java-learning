package Table;

public class Alumni {
	// Attributes for Alumni...
	private String name;
	private char[] studentID;
	private boolean sex; // True for man, false for woman...
	private String major;
	private int graYear;
	private int state;// 0 for home, 1 for school, -1 for company...
	private int id;
	
	// Constructor...
	Alumni(char[] studentID, String name, boolean sex, String major, int state, int graYear, int id){
		this.name = name;
		this.studentID = studentID;
		this.sex = sex;
		this.major = major;
		this.graYear = graYear;
		this.state = state;
		this.id = id;
	}
	
	// Methods...
	public void setStudentID(char[] studentID){ this.studentID = studentID;}
	public void setName(String name){ this.name = name;}
	public void setSex(boolean sex){ this.sex = sex;}
	public void setMajor(String major){ this.major = major;}
	public void setState(int state){this.state = state;}
	public void setGraYear(int graYear){this.graYear = graYear;}
	public void setID(int id){this.id = id;}
	
	public char[] getStudentID(){ return studentID;}
	public String getName(){ return name;}
	public boolean getSex(){ return sex;}
	public String getMajor(){ return major;}
	public int getState(){ return state;}
	public int getGraYear(){ return graYear;}
	public int getID(){return id;}
	
	
}
