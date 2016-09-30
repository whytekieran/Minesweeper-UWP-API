package ie.gmit.whyte.Minesweeper.data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Database 
{
	private Connection con;
	private PreparedStatement stmnt;
	private ResultSet results;
		
	public void getConnection()
	{
		try
		{
			//Create a connection object for the database
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/minesweeperscores", "root", "");
		}
		catch(SQLException e)
		{
			System.out.println("There has been a problem connecting to the database");
		}
		catch(Exception e)
		{
			e.printStackTrace();
			System.out.println("Something is wrong");
		}
	}
	
	public void closeConnection()
	{
		try
		{
	       if(stmnt!=null)
	       {
	    	   stmnt.close();
	       }
	    }
		catch(SQLException se)
		{
			System.out.println("Failed to close statement");
 		}
		try
		{
	       if(con!=null)
	       {
	    	   con.close();
	       }
		}
	    catch(SQLException se)
   	    {
	    	System.out.println("Failed to close connection");
	    }
	}
	
	//Used for executing SQL select insert, update and delete statements
	public void executeStatement(String statement)
	{
		try
		{
			stmnt = con.prepareStatement(statement);//Prepare the statement
			stmnt.executeUpdate(statement);//execute the statement
		}
		catch (SQLException e)
		{
			System.out.println("Something is wrong");
		}
	}
		
	//used for executing SQL select statements, returns a result set
	public ResultSet getResults(String statement)
	{
		try
		{
			stmnt = con.prepareStatement(statement);//Prepare the statement
			results = stmnt.executeQuery();         //execute it
		}
		catch (SQLException e)
		{
			System.out.println("Something wrong with db");
		}
		return results;
	}//end getResults Method
}
