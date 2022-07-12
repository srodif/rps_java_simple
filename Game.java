

public class Game {
	private String result;
	// constructor
	public Game() {
	  //result = "No Game yet!";
	}
	
	// method moveComparison
	public void moveComparison(
				String playerMove,
				String opponentMove) 
  	{
		System.out.println("Selection: " + playerMove + ". Good luck!");
		switch (playerMove) {
		case "rock":
			switch(opponentMove) {
			case "rock":
				result = "Draw";
				break;
			case "paper":
				result = "Player Loss";
				break;
			case "scissors":
				result = "Player win!";
				break;
			}
			break;
		case "paper":
			switch(opponentMove) {
			case "paper":
				result = "Draw";
				break;
			case "scissors":
				result = "Player Loss";
				break;
			case "rock":
				result = "Player win!";
				break;
			}
			break;
		case "scissors":
			switch(opponentMove) {
			case "scissors":
				result = "Draw";
				break;
			case "rock":
				result = "Player Loss";
				break;
			case "paper":
				result = "Player win!";
				break;
			}
			break;
		}
	}
	
	// getter
	public String getResult() {
		return result;
	}
}
