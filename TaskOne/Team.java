import java.util.ArrayList;

class Team{
	
	private String teamName;
	private int rank;
	public ArrayList<String> playerNames = new ArrayList<String>();
	
	public Team(String teamName){
		this.teamName = teamName;
		
	}
	
	void setRank(int rank){
		this.rank = rank;	
	}
	
	void addPlayer(String player1, String player2){		
		playerNames.add(player1);
		playerNames.add(player2);
	}
	
	public String toString(){
		return "Hold: "+teamName+": "+rank;

	}
}