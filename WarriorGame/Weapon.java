package WeakTwo.WarriorGame;

public abstract class Weapon extends Inventory {
    public Weapon(String invType, String invName, int id, int damage, int money) {
        super(invType, invName, id, damage, money);
    }
}
