
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
    
    Sword sword1 = new Sword();
    sword1.setName("Longsword");
    
    System.out.println(player1.getName() + " is using; a " + sword1.getName());
    System.out.print("The " + sword1.getName() + " deals " + sword1.getDamage() + "Dmg. The " + sword1.getName() + " has an attack speed of: ");
    System.out.printf("%.2f", sword1.getAttackSpeed());
    System.out.println("/s");
    // System.out.println(player1.getName() + "'s health is: " + player1.getHealth());
  }  
  
}