package WarriorGame;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        Player player=new Player("Mutalip");

        Game game=new Game();
        game.start();
        player.selectChar();
        System.out.println("Please Enter CharId:");
        int select=input.nextInt();
        System.out.println("--------------------------------");





    }
}
