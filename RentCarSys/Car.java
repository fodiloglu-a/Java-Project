package WeakTwo.RentCarSys;

public class Car {
    byte ID;
    String modelName;
    String modelType;
    String modelfuel;
    int rentDay;
    int sum;


    //araçların kiralanmadan önce gösterimi
    void carPrint(){
        System.out.println("=======================");
        System.out.println("ID\t:"+ID);
        System.out.println("Model Name\t:"+modelName);
        System.out.println("Model Type\t:"+modelType);
        System.out.println("Model Fuel\t:"+modelfuel);
        System.out.println("Rent Day\t:"+rentDay);

    }
    //Kiralandıktan sonra araç bilgileri ve toplamı yazdırılır
    void carPrint(int ID){
        System.out.println("=======================");
        System.out.println("ID\t:"+ID);
        System.out.println("Model Name\t:"+modelName);
        System.out.println("Model Type\t:"+modelType);
        System.out.println("Model Fuel\t:"+modelfuel);
        System.out.println("Rent Sum\t:"+sum+"TL");
        System.out.println("You have successfully rented this car::"+modelName);

    }
    //Toplam kiralama bedeli hesaplanır
    void calculator(int id,int day ){
        int d=day;

        if (id==1){

             this.sum=d*this.rentDay;


        }else if (id==2){
            this.sum=d*this.rentDay;

        }else if (id==3){
            this.sum=d*this.rentDay;


        }else  {
            this.sum=d*this.rentDay;


        }


    }

    //İndirim hesabı yapılır
    void discound(int enter){
        if (enter==1){
            int disc=(this.sum*20)/100;
            this.sum-=disc;
            System.out.println(">>>Subscriber Discount:"+disc+"TL");

        }
    }







}
