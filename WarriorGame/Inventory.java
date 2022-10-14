package WeakTwo.WarriorGame;

public abstract class Inventory {
    private String InvName;
    private String InvType;
    private int Id;
    private int damage;
    private int money;

    public Inventory( String invType,String invName, int id, int damage, int money) {
        InvName = invName;
        InvType = invType;
        Id = id;
        this.damage = damage;
        this.money = money;
    }
}
