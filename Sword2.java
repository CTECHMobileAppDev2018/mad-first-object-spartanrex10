public class Sword2 {
 private String name;
 private int damage;
 private float attackSpeed;
//Setters
 Sword2() {
   this.damage = (int)(Math.random() * 5 + 15);
   this.attackSpeed = (float)(Math.random() * 0.5 + 1);
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
}