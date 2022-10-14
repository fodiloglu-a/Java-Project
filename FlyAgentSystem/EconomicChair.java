package Weak3.WeakThreeWorkTwo;

public class EconomicChair extends Armchair  {


    public EconomicChair(String name, String nameCod, int armNum) {
        super(name, nameCod, armNum);
    }


    public void PropertiesDomestic() {
        System.out.println("___Economic Class Properties___");
        System.out.println("-------------------------");
        System.out.println("* Drink");
        System.out.println("-------------------------");
        System.out.println("Price:100$");
    }


    public void PropertiesInternational() {
        System.out.println("___Economic Class Properties___");
        System.out.println("-------------------------");
        System.out.println("* Drink");
        System.out.println("* Dinner");
        System.out.println("-------------------------");
        System.out.println("Price:200$");

    }
}
