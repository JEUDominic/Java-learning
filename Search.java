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

public class Search {
	
	private static String url="jdbc:mysql://localhost/";
	private static String username="j430003023";
	private static String password="123456";
	private static String Driver="com.mysql.jdbc.Driver";
	
	// Input the name of a company, check if it exist in the database...
	// If it exist, return the id of company...
	// If it does't exist, return -1...
	// If there are other wrong, return -2...
	public static int companyCheck(String name){
		try{
			Class.forName(Driver);
			Connection connection = DriverManager.getConnection(url, username, password);
			String search="SELECT `id` FROM `j430003023`.`company` WHERE `name` LIKE '" + name + "'";
			Statement state = connection.createStatement();
			ResultSet result = state.executeQuery(search);
			result.next();
			int reslutID = result.getInt("id");
			state.close();
			connection.close();
			return reslutID;
		}
		catch(ClassNotFoundException e){
			e.printStackTrace();
			return -1;
		}
		catch(SQLException e) {
			e.printStackTrace();
			e.getMessage();
			return -2;
		
		}
	}
	
	// Input the name of a school, check if it exist in the database...
	// If it exist, return the id of school...
	// If it does't exist, return -1...
	// If there are other wrong, return -2...
	public static int schoolCheck(String name){
		try{
			Class.forName(Driver);
			Connection connection = DriverManager.getConnection(url, username, password);
			String search="SELECT `id` FROM `j430003023`.`school` WHERE `name` LIKE '" + name + "'";
			Statement state = connection.createStatement();
			ResultSet result = state.executeQuery(search);
			result.next();
			int reslutID = result.getInt("id");
			state.close();
			connection.close();
			return reslutID;
		}
		catch(ClassNotFoundException e){
			e.printStackTrace();
			return -1;
		}
		catch(SQLException e) {
			e.printStackTrace();
			e.getMessage();
			return -2;
		
		}
	}
	
	// Input the student ID, return an object of student...
	public static Alumni alumni(String studentID){
		try{
			Class.forName(Driver);
			Connection connection = DriverManager.getConnection(url, username, password);
			String search="SELECT * FROM `j430003023`.`alumni` WHERE `studentID` LIKE '" + studentID + "'";
			Statement statement = connection.createStatement();
			ResultSet result = statement.executeQuery(search);
			result.next();
			String name = result.getString("name");
			int sex = result.getInt("sex");
			String major = result.getString("major");
			int graYear = result.getInt("graYear");
			int state = result.getInt("state");
			int id = result.getInt("id");
			Alumni alumni = new Alumni(studentID,name,sex,major,state,graYear,id);
		
			
			
			statement.close();
			connection.close();
			return alumni;
		}
		catch(ClassNotFoundException e){
			e.printStackTrace();
			return null;
		}
		catch(SQLException e) {
			e.printStackTrace();
			e.getMessage();
			return null;
		
		}
	}
	// Input the student ID, return the state of studentID...
	// If the state is company(2), return 2...
	// If the state is school(1), return 1...
	// If the state is at home(0), return 0...
	// If the studentID is not found in database, return -1...
	// If there are some other wrong, return -2...
	public static int state(String studentID){
		try{
			Class.forName(Driver);
			Connection connection = DriverManager.getConnection(url, username, password);
			String search="SELECT `state` FROM `j430003023`.`alumni` WHERE `studentID` LIKE '" + studentID + "'";
			Statement state = connection.createStatement();
			ResultSet result = state.executeQuery(search);
			result.next();
			int reslutState = result.getInt("state");
			state.close();
			connection.close();
			return reslutState;
		}
		catch(ClassNotFoundException e){
			e.printStackTrace();
			return -1;
		}
		catch(SQLException e) {
			e.printStackTrace();
			e.getMessage();
			return -2;
		
		}
	}
	
	// Input the student ID, return the corresponding id...
	// If the studentID is not found in database, return -1...
	// If there are some other wrong, return -2...
	public static int id(String studentID){
		try{
			Class.forName(Driver);
			Connection connection = DriverManager.getConnection(url, username, password);
			String search="SELECT `id` FROM `j430003023`.`alumni` WHERE `studentID` LIKE '" + studentID + "'";
			Statement state = connection.createStatement();
			ResultSet result = state.executeQuery(search);
			result.next();
			int reslutID = result.getInt("id");
			state.close();
			connection.close();
			return reslutID;
		}
		catch(ClassNotFoundException e){
			e.printStackTrace();
			return -1;
		}
		catch(SQLException e) {
			e.printStackTrace();
			e.getMessage();
			return -2;
		
		}
	}
	
	// Input the id and state, return the corresponding organization...
	// Return an object...
	public static Organization orgnization(int id, int state){
		try{
			if(state == 1){
				Class.forName(Driver);
				Connection connection = DriverManager.getConnection(url, username, password);
				String search="SELECT * FROM `j430003023`.`school` WHERE `id` LIKE '" + id + "'";
				Statement school = connection.createStatement();
				ResultSet result = school.executeQuery(search);
				result.next();
				String sname = result.getString("name");
				String scountry = result.getString("country");
				String scity = result.getString("city");
				int top100 = result.getInt("top100");
				school.close();
				connection.close();
				School orgnazation = new School(sname,scountry,scity,top100);
				return orgnazation;
			}else{
				Class.forName(Driver);
				Connection connection = DriverManager.getConnection(url, username, password);
				String search="SELECT * FROM `j430003023`.`company` WHERE `id` LIKE '" + id + "'";
				Statement company = connection.createStatement();
				ResultSet result = company.executeQuery(search);
				result.next();
				String cname = result.getString("name");
				String ccountry = result.getString("country");
				String ccity = result.getString("city");
				company.close();
				connection.close();
				Company orgnazation = new Company(cname,ccountry,ccity);
				return orgnazation;
			}
			
		}
		catch(ClassNotFoundException e){
			e.printStackTrace();
		}
		catch(SQLException e) {
			e.printStackTrace();	
		}
		return null;
	}

	
	public static String getPassword(String id){
		try{
			Class.forName(Driver);
			Connection connection = DriverManager.getConnection(url, username, password);
			String sql="SELECT `password` FROM `j430003023`.`user` WHERE `id` = " + id;
			Statement state = connection.createStatement();
			ResultSet result = state.executeQuery(sql);
			result.next();
			String resultpassword = result.getString("password");
			state.close();
			connection.close();
			return resultpassword;
		}
		catch(ClassNotFoundException e){
			e.printStackTrace();
			return "Not Found";
		}
		catch(SQLException e) {
			e.printStackTrace();
			return e.getMessage();
		
		}
	}
	public static String insertID(String id, char[] user_password){
		try{
			Class.forName(Driver);
			
			
			Connection connection = DriverManager.getConnection(url, username, password);
			
		
			String sql = "INSERT INTO `j430003023`.`user` (`id`, `password`) VALUES ('"+ id +"','"+user_password+"')";
			
		
			Statement state = connection.createStatement();
			
	
			state.executeUpdate(sql);
			
			
			state.close();
			connection.close();
			
			return "Successful";
			
		}catch(ClassNotFoundException e) {
		
			e.printStackTrace();
		
			return "Not Found";
		
		} catch(SQLException e) {
		
			e.printStackTrace();
		
			return e.getMessage();
		
		}
	}
}
