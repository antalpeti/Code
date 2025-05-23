package battlearena;

public class Main {

  @SuppressWarnings("java:S106")
  public static void main(String[] args) {
    Enemy zombie = new Enemy("Zombie", 10, 1);

    System.out.println(zombie.getTypeOfEnemy() + " has " + zombie.getHealthPoints() + " health points and " + zombie.getAttackDamage() + " attack damage.");
    zombie.talk();
    zombie.walkForward();
    zombie.attack();
  }
}
