
public class Student {
	// Attributes...
	private int ID;
	private String name;
	private char grade;
	private boolean sleeping;
		
	// Constructors...
	Student(int ID,String name){
		// Judgment..
		if(ID > 0){this.ID = ID;}
		else{this.ID = 0;}
		
		this.name = name;
	}
	
	Student(int ID,String name,char grade){
		// Judgment..
		if(ID > 0){this.ID = ID;}
		else{this.ID = 0;}
		
		this.name = name;
		this.grade = grade;
	}
	
		
	// Methods...
	public int getID(){
		return ID;
	}
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name = name;
	}
	public char getGrade(){
		return grade;
	}
	public void setGrade(char grade){
		this.grade = grade;
	}
	public boolean isSleeping(){
		return sleeping;
		
	}
	public void goToSleep(){
		if(grade < 'F' && grade >='A'){ grade = (char)((int)grade + 1);}
		else{grade = 'F';}
		
	}
	public void wakeUp(){
		if(sleeping == true){ sleeping = false;}
	}
	
	// Test this class...
	public static void TestStudent(){
		int p = 233;
		int z = 0;
		int n = -666;
		String s = "hhh";
		String r = "bbb";
		char g = 'A';
		char gg = 'B';		
		// Check constructor() and getID()...
		// ID > 0...
		Student a = new Student(p,s);
		System.out.println("The positive number ID check is");
		System.out.println(a.getID() == p);
		// ID = 0...
		Student b = new Student(z,s);
		System.out.println("The zero number ID check is");
		System.out.println(b.getID() == z);
		// ID < 0...
		Student c = new Student(n,s);
		System.out.println("The negative number ID check is");
		System.out.println(c.getID() == n);
		
		// Check constructor() getName() and setName()...
		System.out.println("The name check is");
		System.out.println(s.equals(a.getName()));
		a.setName(r);
		System.out.println("The set && reset name check is");
		System.out.println(r.equals(a.getName()));
		
		// Check constructor()2 setGrade() and getGrade()...
		Student d = new  Student(p,s,gg);
		System.out.println("The grade check is");
		System.out.println(d.getGrade() == gg);
		d.setGrade(g);
		System.out.println("The set && reset grade check is");
		System.out.println(d.getGrade() == g);
		
		// Check isSleeping() goToSleep() wakeUp()...
		System.out.println("The isSleeping check is");
		System.out.println(d.isSleeping());
		d.goToSleep();
		System.out.println("The goToSleep check is");
		System.out.println(d.getGrade() == gg);
		d.wakeUp();
		System.out.println("The wakeUp check is");
		System.out.println(d.isSleeping());
	}

}