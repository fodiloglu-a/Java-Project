package WeakTwo.RentCarSys;

import java.util.Scanner;

public class index {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);

//Car sınıfında bulunan  nitelikleri tanımlama
        Car honda=new Car();
        honda.ID=1;
        honda.modelName="Honda";
        honda.modelType="Hatchback";
        honda.modelfuel="Disel";
        honda.rentDay=100;


        Car audi=new Car();
        audi.ID=2;
        audi.modelName="Audi";
        audi.modelType="Sedan";
        audi.modelfuel="Gasoline";
        audi.rentDay=200;


        Car bmw=new Car();
        bmw.ID=3;
        bmw.modelName="BMW";
        bmw.modelType="Sedan";
        bmw.modelfuel="Gas";
        bmw.rentDay=150;


        Car mercedes=new Car();
        mercedes.ID=4;
        mercedes.modelName="Mercedes";
        mercedes.modelType="Hatchback";
        mercedes.modelfuel="Disel";
        mercedes.rentDay=250;




//Giris ekranı

        System.out.println("==============================");
        System.out.println("Kodluyoruz Rent a Car");
        System.out.println("---------------------");

//Abone olan kullanıcılara %20indirim uygulanır
        System.out.println("1-Abone girişi için (1)");
        System.out.println("2-Abone olmayan için (2)");

        System.out.print("Lütfen giriş yöntemini giriniz:");
        byte enter= input.nextByte();


//Abone olan kullanıcılar her aracı kiralayabilir
        if (enter==1){
            System.out.println("Kiralayabileceğiniz Araçlar");
            honda.carPrint();
            audi.carPrint();
            bmw.carPrint();
            mercedes.carPrint();


//Abone olmayan kullanıcılar sadece iki araca ulaşabilirler
        }else if (enter==2){
            honda.carPrint();
            mercedes.carPrint();
        }else {
            System.out.println("Hatalı giriş yaptınız!");
            System.exit(0);
        }


//Araçlar Id numarası ve kiralanacak gün sayısı alınıp her araca göre ayrı fiyat çıkartılır
        System.out.println("==============================");
        System.out.println("Kiralamak istediğiniz aracın ID No:");
        byte ID= input.nextByte();
        System.out.println("==============================");
        System.out.println("Kiralama Gününü Giriniz:");
        int day=input.nextInt();


//Seçilen ID numarasına göre yapılan işlemler

        switch (ID){
            case 1:System.out.println("==============================");
            honda.calculator(1,day);
            honda.discound(enter);
            honda.carPrint(1);
            break;
            case 2:System.out.println("==============================");
            audi.calculator(2,day);
            audi.discound(enter);
            audi.carPrint(2);
            break;
            case 3:System.out.println("==============================");
            bmw.calculator(3,day);
            bmw.discound(enter);
            bmw.carPrint(3);
            break;
            case 4:System.out.println("==============================");
            mercedes.calculator(4,day);
            mercedes.discound(enter);
            mercedes.carPrint(4);
            break;
            default:System.out.println("==============================");
            System.out.println("Hatalı ID Numarası Girdimiz!!!");
            break;

        }










    }


}
