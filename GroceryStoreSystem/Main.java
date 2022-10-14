package Weak3.WeakThreeWorkOne;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int i=1;

        Scanner input=new Scanner(System.in);

        Fruit cherry=new Cherry("Cherry",100,10,1);
        Fruit apple=new Apple("Apple",120,15,2);
        Fruit pear=new Pear("Pear",130,20,3);




        System.out.println("---------------------------");
        System.out.println("Welcome Greengrocer Maker");
        System.out.println("---------------------------");


        System.out.println("---------------------------");



        System.out.println("Please Enter Name:");

        String name=input.nextLine();
        User user=new User( name);


        System.out.println("Welcome "+user.getUserName());


        System.out.println("---------------------------");

        do {

            System.out.println("List of products");

            cherry.printProducst();
            apple.printProducst();
            pear.printProducst();
            System.out.println("4-EXİT");


            System.out.println("------------------------------");

            System.out.println("Please Select Products Id:");
            int id= input.nextInt();
            if (id==4){
                System.out.println("-----------------------------------");
                user.getCart();
                System.out.println("Thank you for choose we :)");

                break;



            }
            System.out.println("How many <kg> will you get:");
            double kg= input.nextDouble();



            switch (id) {
                case 1:
                    cherry.controlStoreHouse(kg, user, cherry.getName(),i);
                    user.getCart();

                    break;
                case 2:
                    apple.controlStoreHouse(kg, user, cherry.getName(),i);
                    user.getCart();
                    break;
                case 3:
                    pear.controlStoreHouse(kg, user, cherry.getName(),i);
                    user.getCart();
                    break;
                default:
                    System.out.println("Wrong Select!!!");
            }
            i++;




        }while (   true);
























    }
}
