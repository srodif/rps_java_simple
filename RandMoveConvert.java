

public class RandMoveConvert {
  private String convertedRandMove;
  private Double rockyNum;
  private Double paperNum;
  
  //constructor
  public RandMoveConvert() {
    
  }
  
  
  //converterMethod
  public void moveConvert(Double rand) {
    System.out.println("Let's convert the " + rand + "!");
    if (rand < rockyNum) {
      convertedRandMove = "rock";
    } else if (rand < paperNum) {
      convertedRandMove = "paper";
    } else {
      convertedRandMove = "scissors";
    }
    System.out.println("The move is " + convertedRandMove + "!");
  }

  
  //setters
  public void setRockyNum(Double rockThreshold) {
    this.rockyNum = rockThreshold;
  }
  public void setPaperNum(Double paperThreshold) {
    this.paperNum = paperThreshold;
  }
  
  //getters
  public String getConvertedRandMove() {
    return convertedRandMove;
  }
}
