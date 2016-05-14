package Operation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


import Table.Organization;
import Table.Company;
import Table.School;
import Table.Alumni;




public class Insert {
	private static String url="jdbc:mysql://localhost/";
	private static String username="j430003023";
	private static String password="123456";
	private static String Driver="com.mysql.jdbc.Driver";
	
	// Store a company to database...
	// Return the id of company...
	public static int company(Company company){
		try{
			// Connect to database...
			Class.forName(Driver);
			Connection connection = DriverManager.getConnection(url, username, password);
			
			// Store the company information to database...
			String store = "INSERT INTO `j430003023`.`company` (`id`, `name`, `country`, `city`) VALUES (NULL, '"+company.getName()+"', '"+ company.getCountry()+"', '"+company.getCity()+"')";
			Statement statement = connection.createStatement();
			statement.executeUpdate(store);	
			statement.close();
			
			// Return the id of company...
			String search="SELECT `id` FROM `j430003023`.`company` WHERE `name` LIKE '" + company.getName() +"'";
			statement = connection.createStatement();
			ResultSet result = statement.executeQuery(search);
			result.next();
			int reslutID= result.getInt("id");
			statement.close();
			
			// Close database...
			connection.close();
			
			return reslutID;
			
		}catch(ClassNotFoundException e) {
		
			e.printStackTrace();
		
			return -1;
		
		} catch(SQLException e) {
		
			e.printStackTrace();
			e.getMessage();
			return -2;
		
		}
	}
	
	// Store a school to database...
	// Return the id of school...
	public static int school(School school){
		try{
			// Connect to database...
			Class.forName(Driver);
			Connection connection = DriverManager.getConnection(url, username, password);
			
			// Store the school information to database...
			String store = "INSERT INTO `j430003023`.`school` (`id`, `name`, `country`, `city`, `top100`) VALUES (NULL, '"+school.getName()+"', '"+ school.getCountry()+"', '"+school.getCity()+"')";
			Statement statement = connection.createStatement();
			statement.executeUpdate(store);	
			statement.close();
			
			// Return the id of school...
			String search="SELECT `id` FROM `j430003023`.`school` WHERE `name` LIKE '" + school.getName() +"'";
			statement = connection.createStatement();
			ResultSet result = statement.executeQuery(search);
			result.next();
			int reslutID= result.getInt("id");
			statement.close();
			
			// Close database...
			connection.close();
			
			return reslutID;
			
		}catch(ClassNotFoundException e) {
		
			e.printStackTrace();
		
			return -1;
		
		} catch(SQLException e) {
		
			e.printStackTrace();
			e.getMessage();
			return -2;
		
		}
	}
	
	// Store a alumni to database...
	// Return the corresponding id of alumni...
	public static int alumni(Alumni alumni){
		try{
			// Connect to database...
			Class.forName(Driver);
			Connection connection = DriverManager.getConnection(url, username, password);
			
			// Store the alumni information to database...
			String store = "INSERT INTO `j430003023`.`alumni` (`studentID`, `name`, `sex`, `major`, `state`, `graYear`, `id`) VALUES ('"+ alumni.getStudentID() + "', '" + alumni.getName() + "', '" + alumni.getSex() + "', '" + alumni.getMajor() + "', '" + alumni.getState() +"', '" + alumni.getGraYear() + "', '" + alumni.getID() + "')";
			Statement statement = connection.createStatement(); 
			statement.executeUpdate(store);	
			statement.close();
			
			// Return the id of company...
			String search="SELECT `id` FROM `j430003023`.`alumni` WHERE `studentID` LIKE '" + alumni.getStudentID() +"'";
			statement = connection.createStatement();
			ResultSet result = statement.executeQuery(search);
			result.next();
			int reslutID = result.getInt("id");
			statement.close();
			
			// Close database...
			connection.close();
			
			return reslutID;
			
		}catch(ClassNotFoundException e) {
		
			e.printStackTrace();
		
			return -1;
		
		} catch(SQLException e) {
		
			e.printStackTrace();
			e.getMessage();
			return -2;
		
		}
	}
}
