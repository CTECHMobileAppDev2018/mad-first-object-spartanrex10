
public class StartGame {
  
  public static void main(String[] args) {
   
    Player player1 = new Player();
    player1.setName("Mr. Bartucz");
    Player player2 = new Player();
    player2.setName("Zach");
    
    System.out.println("Player1 name is: " + player1.getName());
    System.out.println(player1.getHealth() + "Hp");
    System.out.println(player1.getMana() + "Mp");
    System.out.println("Player2 name is: " + player2.getName());
    System.out.println(player2.getHealth() + "Hp");
    System.out.println(player2.getMana() + "Mp");
    
    Sword1 sword1 = new Sword1();
    sword1.setName("Longsword");
    Sword2 sword2 = new Sword2();
    sword2.setName("Excalibur");
    
    System.out.println(player1.getName() + " is using; a " + sword1.getName());
    System.out.print("The " + sword1.getName() + " deals " + sword1.getDamage() + "Dmg. The " + sword1.getName() + " has an attack speed of: ");
    System.out.printf("%.2f", sword1.getAttackSpeed());
    System.out.println("/s");
    
    System.out.println(player2.getName() + " is using; a " + sword2.getName());
    System.out.print("The " + sword2.getName() + " deals " + sword2.getDamage() + "Dmg. The " + sword2.getName() + " has an attack speed of: ");
    System.out.printf("%.2f", sword2.getAttackSpeed());
    System.out.println("/s");
    
    float damagePerSecond1 = sword1.getDamage()*sword1.getAttackSpeed();
    float damagePerSecond2 = sword2.getDamage()*sword2.getAttackSpeed();
    System.out.print
    System.out.printf("%.2f", damagePerSecond1);
    System.out.printf("%.2f", damagePerSecond2);
    // System.out.println(player1.getName() + "'s health is: " + player1.getHealth());
  }  
  
}