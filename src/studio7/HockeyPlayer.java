package studio7;

public class HockeyPlayer {
	private String name;
	private int jerseyNumber; 
	private String shootingHand; //right, left, either
	private String dominantHand; //right or left
	
	
	private int totalGoals;
	private int totalAssists;
	private int totalPoints;
	private int gamesPlayed;
	
	public HockeyPlayer (String name, int jerseyNumber, String shootingHand, String dominantHand) {
		this.name = name; 
		this.jerseyNumber = jerseyNumber;
		this.shootingHand = shootingHand;
		this.dominantHand = dominantHand;
		this.totalGoals = 0;
		this.totalAssists = 0;
		this.totalPoints = 0;
		this.gamesPlayed = 0;
	}
	public void CompletedGame(int goals, int assists) { 
		this.totalGoals += goals;
		this.totalAssists += assists;
		this.totalPoints = (goals + assists);
		this.gamesPlayed++;
		
	}
	public int getTotalGoals() {
	return totalGoals;
	}
	public int getTotalAssists() {
		return totalAssists;
	}
	public int getTotalPoints() {
		return totalPoints;
	}
	public int getGamesPlayed() {
		return gamesPlayed;
	}
	public String getName() {
	return name;
	}
	public int getjerseyNumber() {
		return jerseyNumber;
		
	}
	public String getshootingHand() {
		return shootingHand;
	}
	public String getdominantHand() {
		return dominantHand;
	}
}
