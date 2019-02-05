
// This is an example class for a player in a game
public class Player {
  
  // we don't want other objects changing these directly, so they are private
  private String name;
  private int health;
  private int mana;
  
  // this is called a "constructor". It is automatically called when someone creates a new Player object
  Player() {
    this.health = 100;
    this.mana = 100;
  }
  
  // next we have "setters" and "getters"
  // these allow us to set and get properties, including doing some error checking
  public void setName(String playerName) { 

    // first let's make sure the length of the name is longer than 0
    if (playerName.length() < 1) {
      this.name = "invalid";
      return;
    }
    
    this.name = playerName;
  }
  
  // this just gets the name 
  public String getName() {
    return this.name;
  }
  
  // this will get the health and Mana
  public int getHealth() {
    return this.health;
  }
  public int getMana() {
    return this.mana;
  }
  // here is where you should insert your setHealth and getHealth methods
  // what are some conditions that need to be checked?
  
}