package WarriorGame;

import java.util.Scanner;

public class Player {

    private  int damage;
    private int money;
    private int health;
    private String name;
    private  String charName;


    public Player(String name) {
        this.name = name;
    }


    public  void selectChar( ){
        System.out.println("ID:1-Samurai :\tDamage:5\tHealth:21\tMoney:15\t ");
        System.out.println("ID:2-Archer  :\tDamage:7\tHealth:18\tMoney:21\t ");
        System.out.println("ID:3-Chivalry:\tDamage:8\tHealth:24\tMoney:5\t ");




    }


    //GET UND SET METHOT
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCharName() {
        return charName;
    }

    public void setCharName(String charName) {
        this.charName = charName;
    }


}
