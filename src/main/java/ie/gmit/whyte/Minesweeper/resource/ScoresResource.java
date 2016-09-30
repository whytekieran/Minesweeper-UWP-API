package ie.gmit.whyte.Minesweeper.resource;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import ie.gmit.whyte.Minesweeper.data.Database;
import ie.gmit.whyte.Minesweeper.model.HighScore;

@Path("/scores")
public class ScoresResource 
{
	Database db = new Database();
	ResultSet results;
	List<HighScore> scoreList;
	
	@GET
	@Path("/escore6")
    @Produces(MediaType.APPLICATION_JSON)
	//Start GET Request end point in API for EScore6 Table
    public List<HighScore> getE6Scores() 
    {
		db.getConnection();
		scoreList = new ArrayList<HighScore>();
		results = db.getResults("SELECT Id, Username, Userscore FROM escore6 ORDER BY Userscore DESC");
		
		try 
		{
			while(results.next())
			{
				HighScore score = new HighScore(Integer.parseInt(results.getString(1)), results.getString(2),
						Integer.parseInt(results.getString(3)));
				scoreList.add(score);
			}
		} 
		catch(SQLException e) 
		{
			System.out.println("Something went wrong looping over data");
		}
		
		db.closeConnection();
		
		return scoreList;
    }//End GET Request end point in API for EScore6 Table
	
	@POST
	@Path("/escore6")
	@Consumes(MediaType.APPLICATION_JSON)
	//Start POST Request end point in API for EScore6 Table
	public void insertE6Score(HighScore newScore)
	{
		db.getConnection();
		db.executeStatement("INSERT INTO escore6 (Username, Userscore) VALUES "
				+ "('"+newScore.getUsername()+"', "+newScore.getUserscore()+")");
		db.closeConnection();
	}//End POST Request end point in API for EScore6 Table
	
	@GET
	@Path("/escore8")
    @Produces(MediaType.APPLICATION_JSON)
	//Start GET Request end point in API for EScore8 Table
    public List<HighScore> getE8Scores() 
    {
		db.getConnection();
		scoreList = new ArrayList<HighScore>();
		results = db.getResults("SELECT Id, Username, Userscore FROM escore8 ORDER BY Userscore DESC");
		
		try 
		{
			while(results.next())
			{
				HighScore score = new HighScore(Integer.parseInt(results.getString(1)), results.getString(2),
						Integer.parseInt(results.getString(3)));
				
				scoreList.add(score);
			}
		} 
		catch(SQLException e) 
		{
			System.out.println("Something went wrong looping over data");
		}
		
		return scoreList;
    }//End GET Request end point in API for EScore8 Table
	
	@POST
	@Path("/escore8")
	@Consumes(MediaType.APPLICATION_JSON)
	//Start POST Request end point in API for EScore8 Table
	public void insertE8Score(HighScore newScore)
	{
		db.getConnection();
		db.executeStatement("INSERT INTO escore8 (Username, Userscore) VALUES "
				+ "('"+newScore.getUsername()+"', "+newScore.getUserscore()+")");
		db.closeConnection();
	}//End POST Request end point in API for EScore8 Table
	
	@GET
	@Path("/escore10")
    @Produces(MediaType.APPLICATION_JSON)
	//Start GET Request end point in API for EScore10 Table
    public List<HighScore> getE10Scores() 
    {
		db.getConnection();
		scoreList = new ArrayList<HighScore>();
		results = db.getResults("SELECT Id, Username, Userscore FROM escore10 ORDER BY Userscore DESC");
		
		try 
		{
			while(results.next())
			{
				HighScore score = new HighScore(Integer.parseInt(results.getString(1)), results.getString(2),
						Integer.parseInt(results.getString(3)));
				
				scoreList.add(score);
			}
		} 
		catch(SQLException e) 
		{
			System.out.println("Something went wrong looping over data");
		}
		
		return scoreList;
    }//End GET Request end point in API for EScore10 Table
	
	@POST
	@Path("/escore10")
	@Consumes(MediaType.APPLICATION_JSON)
	//Start POST Request end point in API for EScore10 Table
	public void insertE10Score(HighScore newScore)
	{
		db.getConnection();
		db.executeStatement("INSERT INTO escore10 (Username, Userscore) VALUES "
				+ "('"+newScore.getUsername()+"', "+newScore.getUserscore()+")");
		db.closeConnection();
	}//End POST Request end point in API for EScore10 Table
	
	@GET
	@Path("/mscore6")
    @Produces(MediaType.APPLICATION_JSON)
	//Start GET Request end point in API for MScore6 Table
    public List<HighScore> getM6Scores() 
    {
		db.getConnection();
		scoreList = new ArrayList<HighScore>();
		results = db.getResults("SELECT Id, Username, Userscore FROM mscore6 ORDER BY Userscore DESC");
		
		try 
		{
			while(results.next())
			{
				HighScore score = new HighScore(Integer.parseInt(results.getString(1)), results.getString(2),
						Integer.parseInt(results.getString(3)));
				
				scoreList.add(score);
			}
		} 
		catch(SQLException e) 
		{
			System.out.println("Something went wrong looping over data");
		}
		
		return scoreList;
    }//End GET Request end point in API for MScore6 Table
	
	@POST
	@Path("/mscore6")
	@Consumes(MediaType.APPLICATION_JSON)
	//Start POST Request end point in API for MScore6 Table
	public void insertM6Score(HighScore newScore)
	{
		db.getConnection();
		db.executeStatement("INSERT INTO mscore6 (Username, Userscore) VALUES "
				+ "('"+newScore.getUsername()+"', "+newScore.getUserscore()+")");
		db.closeConnection();
	}//End POST Request end point in API for MScore6 Table
	
	@GET
	@Path("/mscore8")
    @Produces(MediaType.APPLICATION_JSON)
	//Start GET Request end point in API for MScore8 Table
    public List<HighScore> getM8Scores() 
    {
		db.getConnection();
		scoreList = new ArrayList<HighScore>();
		results = db.getResults("SELECT Id, Username, Userscore FROM mscore8 ORDER BY Userscore DESC");
		
		try 
		{
			while(results.next())
			{
				HighScore score = new HighScore(Integer.parseInt(results.getString(1)), results.getString(2),
						Integer.parseInt(results.getString(3)));
				
				scoreList.add(score);
			}
		} 
		catch(SQLException e) 
		{
			System.out.println("Something went wrong looping over data");
		}
		
		return scoreList;
    }//End GET Request end point in API for MScore8 Table
	
	@POST
	@Path("/mscore8")
	@Consumes(MediaType.APPLICATION_JSON)
	//Start POST Request end point in API for MScore8 Table
	public void insertM8Score(HighScore newScore)
	{
		db.getConnection();
		db.executeStatement("INSERT INTO mscore8 (Username, Userscore) VALUES "
				+ "('"+newScore.getUsername()+"', "+newScore.getUserscore()+")");
		db.closeConnection();
	}//End POST Request end point in API for MScore8 Table
	
	@GET
	@Path("/mscore10")
    @Produces(MediaType.APPLICATION_JSON)
	//Start GET Request end point in API for MScore10 Table
    public List<HighScore> getM10Scores() 
    {
		db.getConnection();
		scoreList = new ArrayList<HighScore>();
		results = db.getResults("SELECT Id, Username, Userscore FROM mscore10 ORDER BY Userscore DESC");
		
		try 
		{
			while(results.next())
			{
				HighScore score = new HighScore(Integer.parseInt(results.getString(1)), results.getString(2),
						Integer.parseInt(results.getString(3)));
				
				scoreList.add(score);
			}
		} 
		catch(SQLException e) 
		{
			System.out.println("Something went wrong looping over data");
		}
		
		return scoreList;
    }//End GET Request end point in API for MScore10 Table
	
	@POST
	@Path("/mscore10")
	@Consumes(MediaType.APPLICATION_JSON)
	//Start POST Request end point in API for MScore10 Table
	public void insertM10Score(HighScore newScore)
	{
		db.getConnection();
		db.executeStatement("INSERT INTO mscore10 (Username, Userscore) VALUES "
				+ "('"+newScore.getUsername()+"', "+newScore.getUserscore()+")");
		db.closeConnection();
	}//End POST Request end point in API for MScore10 Table
	
	@GET
	@Path("/hscore6")
    @Produces(MediaType.APPLICATION_JSON)
	//Start GET Request end point in API for HScore6 Table
    public List<HighScore> getH6Scores() 
    {
		db.getConnection();
		scoreList = new ArrayList<HighScore>();
		results = db.getResults("SELECT Id, Username, Userscore FROM hscore6 ORDER BY Userscore DESC");
		
		try 
		{
			while(results.next())
			{
				HighScore score = new HighScore(Integer.parseInt(results.getString(1)), results.getString(2),
						Integer.parseInt(results.getString(3)));
				
				scoreList.add(score);
			}
		} 
		catch(SQLException e) 
		{
			System.out.println("Something went wrong looping over data");
		}
		
		return scoreList;
    }//End GET Request end point in API for HScore6 Table
	
	@POST
	@Path("/hscore6")
	@Consumes(MediaType.APPLICATION_JSON)
	//Start POST Request end point in API for HScore6 Table
	public void insertH6Score(HighScore newScore)
	{
		db.getConnection();
		db.executeStatement("INSERT INTO hscore6 (Username, Userscore) VALUES "
				+ "('"+newScore.getUsername()+"', "+newScore.getUserscore()+")");
		db.closeConnection();
	}//End POST Request end point in API for HScore6 Table
	
	@GET
	@Path("/hscore8")
    @Produces(MediaType.APPLICATION_JSON)
	//Start GET Request end point in API for EScore6 Table
    public List<HighScore> getH8Scores() 
    {
		db.getConnection();
		scoreList = new ArrayList<HighScore>();
		results = db.getResults("SELECT Id, Username, Userscore FROM hscore8 ORDER BY Userscore DESC");
		
		try 
		{
			while(results.next())
			{
				HighScore score = new HighScore(Integer.parseInt(results.getString(1)), results.getString(2),
						Integer.parseInt(results.getString(3)));
				
				scoreList.add(score);
			}
		} 
		catch(SQLException e) 
		{
			System.out.println("Something went wrong looping over data");
		}
		
		return scoreList;
    }//End GET Request end point in API for HScore8 Table
	
	@POST
	@Path("/hscore8")
	@Consumes(MediaType.APPLICATION_JSON)
	//Start POST Request end point in API for HScore8 Table
	public void insertH8Score(HighScore newScore)
	{
		db.getConnection();
		db.executeStatement("INSERT INTO hscore8 (Username, Userscore) VALUES "
				+ "('"+newScore.getUsername()+"', "+newScore.getUserscore()+")");
		db.closeConnection();
	}//End POST Request end point in API for HScore8 Table
	
	@GET
	@Path("/hscore10")
    @Produces(MediaType.APPLICATION_JSON)
	//Start GET Request end point in API for HScore10 Table
    public List<HighScore> getH10Scores() 
    {
		db.getConnection();
		scoreList = new ArrayList<HighScore>();
		results = db.getResults("SELECT Id, Username, Userscore FROM hscore10 ORDER BY Userscore DESC");
		
		try 
		{
			while(results.next())
			{
				HighScore score = new HighScore(Integer.parseInt(results.getString(1)), results.getString(2),
						Integer.parseInt(results.getString(3)));
				
				scoreList.add(score);
			}
		} 
		catch(SQLException e) 
		{
			System.out.println("Something went wrong looping over data");
		}
		
		return scoreList;
    }//End GET Request end point in API for HScore10 Table
	
	@POST
	@Path("/hscore10")
	@Consumes(MediaType.APPLICATION_JSON)
	//Start POST Request end point in API for HScore10 Table
	public void insertH10Score(HighScore newScore)
	{
		db.getConnection();
		db.executeStatement("INSERT INTO Hscore10 (Username, Userscore) VALUES "
				+ "('"+newScore.getUsername()+"', "+newScore.getUserscore()+")");
		db.closeConnection();
	}//End POST Request end point in API for HScore10 Table
}
