package Weak3.WeakThreeWorkOne;

public abstract  class Fruit {
    private String  name;
    private int Id;

    private int storeHouse;
    private int price;


    public Fruit(String name,  int storeHouse,int price,int Id) {
        this.name = name;
        this.Id=Id;

        this.storeHouse=storeHouse;
        this.price=price;
    }



    public void controlStoreHouse(double kg,User user,String name,int i){

         if (this.storeHouse<kg){
             System.out.println("We don't have enough products");




         }else {
             this.storeHouse-=kg;


             String product=i+"-)"+this.name+"="+kg+"kg|"+this.price*kg+"tl";
             double money=kg*this.price;
             user.addCart(product);
             user.updateCase(money);




         }


    }
    public void printProducst(){
        System.out.println("-----------------------------------------");

        System.out.println(getId()+"-) "+getName()+"   |Total Kg\t:"+getStoreHouse()+"   |1-Kg Price\t:"+getPrice()+"$|");
    }






    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }



    public int getStoreHouse() {
        return storeHouse;
    }

    public void setStoreHouse(int storeHouse) {
        this.storeHouse = storeHouse;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }
}
