package WeakTwo.WarriorGame;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);


        Game game=new Game();
        CharacterWar samurai=new Samurai("Samurai",5,21,25);
        CharacterWar archer=new Archer("Archer",7,18,21);
        CharacterWar chivalry=new Chivalry("Chivalry",8,24,5);

        System.out.println("Welcome to Warrior Game!");
        System.out.println("");
        System.out.println("----------------------------------------------------");
        System.out.print("Please enter name:");
        //String playerName=input.nextLine();
        System.out.println("");
        System.out.println("");
        System.out.println("----------------------------------------------------");

        System.out.println("Welcome "+"Mutalip"+": There are a war word!!!");
        System.out.println("Mind your step!!!");
        System.out.println("-----------------------------------------------------");
        System.out.println("Please Select Your Character!");
        System.out.println("ID:1-Samurai :\tDamage:5\tHealth:21\tMoney:15\t ");
        System.out.println("ID:2-Archer  :\tDamage:7\tHealth:18\tMoney:21\t ");
        System.out.println("ID:3-Chivalry:\tDamage:8\tHealth:24\tMoney:5\t ");
        System.out.println("");
        System.out.println("Please Enter CharId:");
        int Id=input.nextInt();
        if (Id==1){

        }
        System.out.println("--------------------------------");






    }
}
