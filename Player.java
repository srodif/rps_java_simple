

public class Player {
	private String playerName;
	private String playerMove;
	
	//constructor 
	public Player() {
		
	}
  	public Player(String name) {
    		this.playerName = name;
  	}
	
	//setters
	public void setPlayerMove(String move) {
		this.playerMove = move;
	}
  	public void setPlayerName(String name) {
    		this.playerName = name;
  	}
	
	//getters 
	public String getPlayerName() {
		return playerName;
	}
	public String getPlayerMove() {
		return playerMove;
	}
}
