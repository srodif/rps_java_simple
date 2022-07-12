import java.util.Scanner;
import java.util.Random;

public class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");

    //name player
		Scanner userInput = new Scanner(System.in);
		System.out.print("Please enter your desired name: ");
		Player myPlayer = new Player(userInput.next());
		System.out.println("Welcome " + myPlayer.getPlayerName() + "!");


    
		// choose opponent
    System.out.println("Time to select your opponent!");
    System.out.println("Choose between normal, Rocky, Paperarm or Scyther !");
    System.out.println("Careful spelling at names please :)");
    boolean validName;
    String chosenName;
    Opponent myOpponent = new Opponent("normal");
    //System.out.println(myOpponent.getPlayerName());
    
    do {
      System.out.print("Opponent Name: ");
      chosenName = userInput.next();
      myOpponent.setPlayerName(chosenName);
      switch(chosenName) {
        case "normal":
          myOpponent.setRockThreshold(0.33);
          myOpponent.setPaperThreshold(0.67);
          validName = false;
          break;
        case "Rocky":
          myOpponent.setRockThreshold(0.6);
          myOpponent.setPaperThreshold(0.8);
          validName = false;
          break;
        case "Paperarm":
          myOpponent.setRockThreshold(0.2);
          myOpponent.setPaperThreshold(0.8);
          validName = false;
          break;
        case "Scyther":
          myOpponent.setRockThreshold(0.2);
          myOpponent.setPaperThreshold(0.4);
          validName = false;
          break;
        default:
          System.out.println("Please use a correct opponent name!");
          validName = true;
      }
    } while (validName);
    System.out.println("You selected:" + myOpponent.getPlayerName() + "!");
    
    
    
		//choose player move
		System.out.println("Please enter your move below.");
		System.out.println("Remember! Your move has to be either rock, paper or scissors.");
		System.out.println("Careful spelling please :)");
		//check player move
		boolean validMove;
		String chosenMove;
    do {
			System.out.println("Move: ");
      chosenMove = userInput.next();
      switch(chosenMove) {
			  case "rock":
				  myPlayer.setPlayerMove(chosenMove);
				  validMove = false;
				  break;
			  case "paper":
				  myPlayer.setPlayerMove(chosenMove);
				  validMove = false;
				  break;
			  case "scissors":
				  myPlayer.setPlayerMove(chosenMove);
				  validMove = false;
				  break;
			  default:
				  System.out.println("Please use a correct move!");
				  validMove = true;
			  }
      } while (validMove);
		System.out.println("You selected: " + myPlayer.getPlayerMove() + "!");


    
    //randomize move
    Random rand = new Random();
    RandMoveConvert randOppMove = new RandMoveConvert();
    randOppMove.setRockyNum(myOpponent.getRockThreshold());
    randOppMove.setPaperNum(myOpponent.getPaperThreshold());
    
    System.out.println("Ready to rand");
    randOppMove.moveConvert(rand.nextDouble());

    myOpponent.setPlayerMove(randOppMove.getConvertedRandMove());
    System.out.println("Opponent selects: " + myOpponent.getPlayerMove() + "!");


    /*
    //initialize opponent
    Player opponentPlayer = new Player("Opposition"); opponentPlayer.setPlayerMove(randOppMove.getConvertedRandMove());
    System.out.println("Opponent selects: " + opponentPlayer.getPlayerMove() + "!");
    */
    
		// call game 
		Game myGame = new Game();
		// check
		//System.out.println(myGame.getResult());
    myGame.moveComparison(
      myPlayer.getPlayerMove(),
      myOpponent.getPlayerMove()
    );		
		System.out.println(myGame.getResult());
		System.out.println("Thank you for playing!");
	}
}