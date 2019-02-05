 public class Sword {
 private String name;
 private int damage;
 private boolean enchanted;
 private float attackSpeed;
//Setters
 Sword() {
   this.damage = (int)(Math.random() * 15 + 1);
   this.attackSpeed = (float)(Math.random() * 3 + 1);
 }
   //Sword name setter
   public void setName(String swordName) { 

    // first let's make sure the length of the name is longer than 0
    if (swordName.length() < 1) {
      this.name = "invalid";
      return;
    }
    
    this.name = swordName;
  }
   //Getters
   public int getDamage() {
    return this.damage;
   }
   public float getAttackSpeed() {
     return this.attackSpeed;
   }
  public String getName() {
    return this.name;
  }
       //Hope, this will prevent ridiculously long decimals.
     /* if (playerName.length() < 1) {
      this.name = "invalid";
      return;
      
      System.out.printf("%.2f", val);
    }*/
    // int random = (int)(Math.random() * 50 + 1);
 }