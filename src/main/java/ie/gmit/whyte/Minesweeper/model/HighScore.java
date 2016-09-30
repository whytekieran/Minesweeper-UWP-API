package ie.gmit.whyte.Minesweeper.model;

public class HighScore 
{
	private int id;
	private String username;
	private int userscore;
	
	public HighScore()
	{
		
	}
	
	public HighScore(int id, String username, int userscore) 
	{
		this.id = id;
		this.username = username;
		this.userscore = userscore;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public int getUserscore() {
		return userscore;
	}

	public void setUserscore(int userscore) {
		this.userscore = userscore;
	}
}
