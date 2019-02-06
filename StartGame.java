import java.util.Scanner;
public class StartGame {
  
  public static void main(String[] args) {
   
    //Creates the array, NOT the players
    Player[] playerArray = new Player[5];
    //Creating and naming the players
    Player player1 = new Player();
    Player player2 = new Player();
    for (int i = 1; i <= 2; i++) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Please input the name of Player" + i + ":");
    String name = sc.nextLine();
    if (i == 1) {
    player1.setName(name);
    }
    if (i == 2) {
    player2.setName(name);
    }
    }
    //Putting the players in the array
    playerArray[0] = player1;
    playerArray[1] = player2;
    
 for (int i = 0; i < playerArray.length; i++) {
 if (playerArray[i] != null) { // we have to check to see if there is a player object in the array
    System.out.println("Player" + i + " name is: " + playerArray[i].getName());
    System.out.println(playerArray[i].getHealth() + "Hp");
    System.out.println(playerArray[i].getMana() + "Mp");
    }
   }
    
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
    System.out.print("The " + sword1.getName() + " deals: ");
    System.out.printf("%.2f", damagePerSecond1);
    System.out.println("/s");
    System.out.print("The " + sword2.getName() + " deals: ");
    System.out.printf("%.2f", damagePerSecond2);
    System.out.println("/s");
    
    if (damagePerSecond1 > damagePerSecond2) {
      System.out.println(player1.getName() + " slashes " + player2.getName() + " across the chest, killing them.");
      System.out.println(player1.getName() + " Wins!");
    }
    if (damagePerSecond1 < damagePerSecond2) {
      System.out.println(player2.getName() + " slashes " + player1.getName() + " across the chest, killing them.");
      System.out.println(player2.getName() + " Wins!");
    }
    // System.out.println(player1.getName() + "'s health is: " + player1.getHealth());
  }  
  
}