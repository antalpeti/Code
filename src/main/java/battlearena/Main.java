package battlearena;

public class Main {

  @SuppressWarnings("java:S106")
  public static void main(String[] args) {
    Enemy zombie = new Enemy();
    zombie.typeOfEnemy = "Zombie";
    System.out.println(zombie.typeOfEnemy + " has " + zombie.healthPoints + " health points and " + zombie.attackDamage + " attack damage.");
    zombie.talk();
    zombie.walkForward();
    zombie.attack();
  }
}
