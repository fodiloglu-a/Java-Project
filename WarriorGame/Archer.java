package WeakTwo.WarriorGame;

public class Archer extends CharacterWar{
    public Archer(String charName, int damage, int money, int health) {
        super(charName, damage, money, health);
    }
    @Override
    public String selectChar(){
        System.out.println("You are select>>"+getCharName());
        return null;
    }
}
