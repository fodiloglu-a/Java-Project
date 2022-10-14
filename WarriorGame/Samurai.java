package WeakTwo.WarriorGame;

public class Samurai extends CharacterWar implements IMethots{
    public Samurai(String charName, int damage, int money, int health) {
        super(charName, damage, money, health);
    }

    @Override
    public String selectChar(){
        System.out.println("You are select>>"+getCharName());
        return null;
    }
}
