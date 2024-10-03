class Main{
	

	
	public static void main(String[] args){
		Team team1 = new Team("A");
		team1.setRank(1);
		team1.addPlayer("Allan","Anders");
		System.out.println(team1.toString());
		for(String names : team1.playerNames){
			System.out.println(names);
		}
		
		Team team2 = new Team("B");
		team1.setRank(2);
		team1.toString();
		
		Team team3 = new Team("C");
		team1.setRank(3);
		team1.toString();
		
		Team team4 = new Team("D");
		team1.setRank(4);
		team1.toString();
		
		Team team5 = new Team("E");
		team1.setRank(5);
		team1.toString();
		
	}
}