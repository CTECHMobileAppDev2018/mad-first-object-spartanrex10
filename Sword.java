 public class Sword {
 private String name;
 private int damage;
 private boolean enchanted;
 private float attackSpeed;

 Sword() {
   this.damage = (int)(Math.random() * 15 + 1);
   this.attackSpeed = (float)(Math.random() * 3 + 1);
   
    // int random = (int)(Math.random() * 50 + 1);
 }
 }