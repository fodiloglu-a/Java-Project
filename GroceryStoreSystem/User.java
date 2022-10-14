package Weak3.WeakThreeWorkOne;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String userName;
    private List cart =new ArrayList<>();
    private double casa=0.0;


    public User(String userName) {
        this.userName = userName;
    }
    public double updateCase(double money){
        this.casa+=money;

        return this.casa;
    }
    public void addCart(String product){
        cart.add(product);
    }
    public void getCart(){
        System.out.println("Your Cart ");
        System.out.println("----------");
        for (Object str : cart)
        {
            System.out.println("-*"+ str);
        }
        System.out.println("----------------------");
        System.out.println("Total Case:"+this.casa+"tl");
        System.out.println("*******************************");
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
