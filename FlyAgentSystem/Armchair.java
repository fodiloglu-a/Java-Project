package Weak3.WeakThreeWorkTwo;
//for fly company

public abstract class Armchair   {
    private String name;
    private String nameCod;
    private int armNum;

    private String[] armArray;



    public Armchair(String name, String nameCod, int armNum) {
        this.name = name;
        this.nameCod = nameCod;
        this.armNum = armNum;
    }

    public void createArmArray(){//Create armchair
        this.armArray=new String[armNum];
        for (int i=0;i<5;i++){
            this.armArray[i]=i+"-"+this.nameCod;


        }
    }
    public void PropertiesDomestic(){

    }
    public void PropertiesInternational(){

    }

    public void getArmArray(){
        for (int i=0;i<5;i++){
            System.out.print("["+this.armArray[i]+"] ");


        }

    }
    public String controlArmChair(String control, User user){

        for (int i=0;i<5;i++){
             int j=0;
             if (this.armArray[i].equals(control)){
                 this.armArray[i]=i+"-Full";
                 System.out.println("Congratulations, "+user.getUserName() +" has successfully received your ticket.");
                 System.exit(0);

                 j++;
                 break;



             }
             if (i==4 && j==0){
                 System.out.println("Wrong Enter or ArmChair is Full");
             }

        }
        return "null";

    }







    public int getArmNum() {
        return armNum;
    }

    public void setArmNum(int armNum) {
        this.armNum = armNum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }






    public void setArray(String[] array,int i) {
        this.armArray = array;
    }

    public String getNameCod() {
        return nameCod;
    }

    public void setNameCod(String nameCod) {

        this.nameCod = nameCod;
    }
}
