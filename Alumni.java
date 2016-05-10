package Table;

public class Alumni {
	// Attributes for Alumni...
	private String name;
	private char[] studentID;
	private boolean sex; // True for man, false for woman...
	private String major;
	private int graYear;
	private int state;
	private char[] id;
	
	Alumni(String name, char[] studentID, boolean sex, String major, int graYear,int state, char[] id){
		this.name = name;
		this.studentID = studentID;
		this.sex = sex;
		this.major = major;
		this.graYear = graYear;
		this.state = state;
		this.id = id;
	}
	
	
}
