package WeakTwo.WarriorGame;

public abstract  class CharacterWar implements IMethots {

    private  int damage;
    private int money;
    private int health;

    private  String charName;

    public CharacterWar(String charName,int damage, int money, int health) {
        this.damage = damage;
        this.money = money;
        this.health = health;
        this.charName = charName;
    }
    //Methods
    @Override
    public String selectChar(){
        return null;
    }






    //GET UND SET METHOD

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }



    public String getCharName() {
        return charName;
    }

    public void setCharName(String charName) {
        this.charName = charName;
    }


}
