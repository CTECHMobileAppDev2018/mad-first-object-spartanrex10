
public class StartGame {
  
  public static void main(String[] args) {
   
    Player player1 = new Player();
    player1.setName("Mr. Bartucz");
    Player player2 = new Player();
    player2.setName("Zach");
    
    System.out.println("Player1 name is: " + player1.getName());
    System.out.println(player1.getName() + " is at: " + player1.getHealth() + "Hp");
    System.out.println("Player2 name is: " + player2.getName());
    System.out.println(player2.getName() + " is at: " + player2.getHealth() + "Hp");
    // this won't work until you create a getHealth method in your object. Uncomment it when you do.
    // System.out.println(player1.getName() + "'s health is: " + player1.getHealth());
  }  
  
}