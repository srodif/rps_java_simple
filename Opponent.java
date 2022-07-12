

public class Opponent extends Player {
  private Double rockThreshold = 0.33;
  private Double paperThreshold = 0.67;

  //constructors
  public Opponent() {
    
  }
  public Opponent(String name) {
    super(name);
  }
  

  //setters
  public void setRockThreshold(Double rt) {
    this.rockThreshold = rt;
  }
  public void setPaperThreshold(Double pt) {
    this.paperThreshold = pt;
  }
  
  //getter for move will be inherited
  public Double getRockThreshold() {
    return rockThreshold;
  }
  public Double getPaperThreshold() {
    return paperThreshold;
  }
}