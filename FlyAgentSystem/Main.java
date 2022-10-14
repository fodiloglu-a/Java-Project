package Weak3.WeakThreeWorkTwo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Company thy = new THY("Thy");
        Company pegasus = new Pegasus("Pegasus");
        Company anadoluJet = new AnadoluJet("Anadolu Jet");
        Armchair business = new BusinessChair("Business", "BUS", 5);
        Armchair firstClass = new FirstClassChair("First Class", "FCL", 5);
        Armchair economic = new EconomicChair("Economic", "ECO", 10);


        System.out.println("---------------------------------------------------------");
        System.out.println("|              Welcome to FLY-TİCKET Agent              |");
        System.out.println("---------------------------------------------------------");
        System.out.println("");
        System.out.println("");
        System.out.println("---------------------------------------------------------");
        System.out.println("Please Enter Name:");
        String name = input.nextLine();
        User user = new User(name);
        System.out.println("---------------------------------------------------------");
        int enterType;
        while (true) {

            System.out.println("Please Select type of flight");
            System.out.println("");
            System.out.println("1-Domestic flights     ");
            System.out.println("2-International flights");
            System.out.println("");
            System.out.print("Enter:");
            enterType = input.nextInt();
            //Domestic flight
            if (enterType == 1) {//Domestic Choose Process...
                do {
                    System.out.println("Welcome to Domestic flights  ");
                    System.out.println("-----------------------------");
                    System.out.println("");
                    System.out.println("Please Choose Fly Company");
                    System.out.println("-----------------------------");
                    System.out.println("1-THY");
                    System.out.println("");
                    System.out.println("2-Pegasus");
                    System.out.println("");
                    System.out.println("3-Anadolu Jet");
                    System.out.println("");
                    System.out.println("Enter:");
                    int enterComp = input.nextInt();
                    System.out.println("");
                    System.out.println("---------------------------------------------------------");
                    switch (enterComp) {
                        case 1:
                            System.out.println("Welcome to THY");

                            System.out.println("---------------------------------------------------------");
                            System.out.println("");
                            System.out.println("---------------------------------------------------------");

                            business.createArmArray();
                            firstClass.createArmArray();
                            economic.createArmArray();
                            System.out.println("1->Business Class");
                            System.out.println("---------------------------------------------------------");
                            System.out.println("");
                            System.out.println("---------------------------------------------------------");
                            System.out.println("2->Economic Class");
                            System.out.println("---------------------------------------------------------");
                            System.out.println("");
                            System.out.print("Please Enter Class code:");
                            int enterClass = input.nextInt();
                            System.out.println("");
                            System.out.println("");
                            if (enterClass == 1) {
                                System.out.println("---------------------------------------------------------");
                                System.out.println("Welcome to Business Class");
                                System.out.println("---------------------------------------------------------");
                                System.out.println("");
                                business.PropertiesDomestic();
                                System.out.println("");
                                System.out.println("---------------------------------------------------------");
                                business.createArmArray();
                                business.getArmArray();
                                System.out.println("");
                                System.out.println("---------------------------------------------------------");
                                System.out.println("Please Enter Armchair code {Exam:1-BUS}");
                                System.out.println("---------------------------------------------------------");
                                System.out.println("");
                                System.out.println("Enter:");
                                input.nextLine();
                                String code = input.nextLine();
                                business.controlArmChair(code, user);
                                System.out.println("");
                                System.out.println("---------------------------------------------------------");
                                break;

                            } else if (enterClass == 2) {
                                System.out.println("---------------------------------------------------------");
                                System.out.println("Welcome to Economic Class");
                                System.out.println("---------------------------------------------------------");
                                System.out.println("");
                                economic.PropertiesDomestic();
                                System.out.println("");
                                System.out.println("---------------------------------------------------------");
                                economic.createArmArray();
                                economic.getArmArray();
                                System.out.println("");
                                System.out.println("---------------------------------------------------------");
                                System.out.println("Please Enter Armchair code {Exam:1-ECO}");
                                System.out.println("---------------------------------------------------------");
                                System.out.println("");
                                System.out.println("Enter:");
                                input.nextLine();
                                String code = input.nextLine();
                                economic.controlArmChair(code, user);
                                System.out.println("");
                                System.out.println("---------------------------------------------------------");
                                break;}  else {
                                System.out.println("Wrong Enter");
                            }

                        case 2:System.out.println("Welcome to Pegasus");

                            System.out.println("---------------------------------------------------------");
                            System.out.println("");
                            System.out.println("---------------------------------------------------------");

                            business.createArmArray();
                            firstClass.createArmArray();
                            economic.createArmArray();
                            System.out.println("1->Business Class");
                            System.out.println("---------------------------------------------------------");
                            System.out.println("");
                            System.out.println("---------------------------------------------------------");
                            System.out.println("2->Economic Class");
                            System.out.println("---------------------------------------------------------");
                            System.out.println("");
                            System.out.println("---------------------------------------------------------");

                            System.out.print("Please Enter Class code:");
                             enterClass = input.nextInt();
                            System.out.println("");
                            System.out.println("");
                            if (enterClass == 1) {
                                System.out.println("---------------------------------------------------------");
                                System.out.println("Welcome to Business Class");
                                System.out.println("---------------------------------------------------------");
                                System.out.println("");
                                business.PropertiesDomestic();
                                System.out.println("");
                                System.out.println("---------------------------------------------------------");
                                business.createArmArray();
                                business.getArmArray();
                                System.out.println("");
                                System.out.println("---------------------------------------------------------");
                                System.out.println("Please Enter Armchair code {Exam:1-BUS}");
                                System.out.println("---------------------------------------------------------");
                                System.out.println("");
                                System.out.println("Enter:");
                                input.nextLine();
                                String code = input.nextLine();
                                business.controlArmChair(code, user);
                                System.out.println("");
                                System.out.println("---------------------------------------------------------");
                                break;

                            } else if (enterClass == 2) {
                                System.out.println("---------------------------------------------------------");
                                System.out.println("Welcome to Economic Class");
                                System.out.println("---------------------------------------------------------");
                                System.out.println("");
                                economic.PropertiesDomestic();
                                System.out.println("");
                                System.out.println("---------------------------------------------------------");
                                economic.createArmArray();
                                economic.getArmArray();
                                System.out.println("");
                                System.out.println("---------------------------------------------------------");
                                System.out.println("Please Enter Armchair code {Exam:1-ECO}");
                                System.out.println("---------------------------------------------------------");
                                System.out.println("");
                                System.out.println("Enter:");
                                input.nextLine();
                                String code = input.nextLine();
                                economic.controlArmChair(code, user);
                                System.out.println("");
                                System.out.println("---------------------------------------------------------");
                                break;

                            }  else {
                                System.out.println("Wrong Enter");
                            }



                        case 3:
                            System.out.println("Welcome to Anadolu Jet");

                            System.out.println("---------------------------------------------------------");
                            System.out.println("");
                            System.out.println("---------------------------------------------------------");

                            business.createArmArray();
                            firstClass.createArmArray();
                            economic.createArmArray();


                            System.out.println("");

                            System.out.println("1->Economic Class");
                            System.out.println("---------------------------------------------------------");
                            System.out.println("");
                            System.out.print("Please Enter Class code:");
                            enterClass = input.nextInt();
                            System.out.println("");
                            System.out.println("");
                            if (enterClass == 1) {
                                System.out.println("---------------------------------------------------------");
                                System.out.println("Welcome to Economic Class");
                                System.out.println("---------------------------------------------------------");
                                System.out.println("");
                                economic.PropertiesDomestic();
                                System.out.println("");
                                System.out.println("---------------------------------------------------------");
                                economic.createArmArray();
                                economic.getArmArray();
                                System.out.println("");
                                System.out.println("---------------------------------------------------------");
                                System.out.println("Please Enter Armchair code {Exam:1-ECO}");
                                System.out.println("---------------------------------------------------------");
                                System.out.println("");
                                System.out.println("Enter:");
                                input.nextLine();
                                String code = input.nextLine();
                                economic.controlArmChair(code, user);
                                System.out.println("");
                                System.out.println("---------------------------------------------------------");
                                break;


                            }  else {
                                System.out.println("Wrong Enter");
                            }



                        default:
                            System.out.println("Wrong Enter");

                     }


                }
                while (true);



            }
            //International flight
            else if (enterType==2) {
                do {
                    System.out.println("Welcome to International flights  ");
                    System.out.println("-----------------------------");
                    System.out.println("");
                    System.out.println("Please Choose Fly Company");
                    System.out.println("-----------------------------");
                    System.out.println("1-THY");
                    System.out.println("");
                    System.out.println("2-Pegasus");
                    System.out.println("");
                    System.out.println("3-Anadolu Jet");
                    System.out.println("");
                    System.out.println("Enter:");
                    int enterComp = input.nextInt();
                    System.out.println("");
                    System.out.println("---------------------------------------------------------");
                    switch (enterComp) {
                        case 1:
                            System.out.println("Welcome to THY");

                            System.out.println("---------------------------------------------------------");
                            System.out.println("");
                            System.out.println("---------------------------------------------------------");

                            business.createArmArray();
                            firstClass.createArmArray();
                            economic.createArmArray();
                            System.out.println("1->Business Class");
                            System.out.println("---------------------------------------------------------");
                            System.out.println("");
                            System.out.println("---------------------------------------------------------");
                            System.out.println("2->First Class");
                            System.out.println("---------------------------------------------------------");
                            System.out.println("");
                            System.out.println("---------------------------------------------------------");
                            System.out.println("3->Economic Class");
                            System.out.println("---------------------------------------------------------");
                            System.out.println("");
                            System.out.print("Please Enter Class code:");
                            int enterClass = input.nextInt();
                            System.out.println("");
                            System.out.println("");
                            if (enterClass == 1) {
                                System.out.println("---------------------------------------------------------");
                                System.out.println("Welcome to Business Class");
                                System.out.println("---------------------------------------------------------");
                                System.out.println("");
                                business.PropertiesInternational();
                                System.out.println("");
                                System.out.println("---------------------------------------------------------");
                                business.createArmArray();
                                business.getArmArray();
                                System.out.println("");
                                System.out.println("---------------------------------------------------------");
                                System.out.println("Please Enter Armchair code {Exam:1-BUS}");
                                System.out.println("---------------------------------------------------------");
                                System.out.println("");
                                System.out.println("Enter:");
                                input.nextLine();
                                String code = input.nextLine();
                                business.controlArmChair(code, user);
                                System.out.println("");
                                System.out.println("---------------------------------------------------------");
                                break;

                            } else if (enterClass == 2) {
                                System.out.println("---------------------------------------------------------");
                                System.out.println("Welcome to First Class");
                                System.out.println("---------------------------------------------------------");
                                System.out.println("");
                                firstClass.PropertiesInternational();
                                System.out.println("");
                                System.out.println("---------------------------------------------------------");
                                firstClass.createArmArray();
                                firstClass.getArmArray();
                                System.out.println("");
                                System.out.println("---------------------------------------------------------");
                                System.out.println("Please Enter Armchair code {Exam:1-FCL}");
                                System.out.println("---------------------------------------------------------");
                                System.out.println("");
                                System.out.println("Enter:");
                                input.nextLine();
                                String code = input.nextLine();
                                firstClass.controlArmChair(code, user);
                                System.out.println("");
                                System.out.println("---------------------------------------------------------");
                                break;

                            } else if (enterClass == 3) {
                                System.out.println("---------------------------------------------------------");
                                System.out.println("Welcome to Economic Class");
                                System.out.println("---------------------------------------------------------");
                                System.out.println("");
                                economic.PropertiesInternational();
                                System.out.println("");
                                System.out.println("---------------------------------------------------------");
                                economic.createArmArray();
                                economic.getArmArray();
                                System.out.println("");
                                System.out.println("---------------------------------------------------------");
                                System.out.println("Please Enter Armchair code {Exam:1-ECO}");
                                System.out.println("---------------------------------------------------------");
                                System.out.println("");
                                System.out.println("Enter:");
                                input.nextLine();
                                String code = input.nextLine();
                                economic.controlArmChair(code, user);
                                System.out.println("");
                                System.out.println("---------------------------------------------------------");
                                break;

                            } else {
                                System.out.println("Wrong Enter");
                            }

                        case 2:System.out.println("Welcome to Pegasus");

                            System.out.println("---------------------------------------------------------");
                            System.out.println("");
                            System.out.println("---------------------------------------------------------");

                            business.createArmArray();
                            firstClass.createArmArray();
                            economic.createArmArray();
                            System.out.println("1->Business Class");
                            System.out.println("---------------------------------------------------------");
                            System.out.println("");
                            System.out.println("---------------------------------------------------------");
                            System.out.println("2->Economic Class");
                            System.out.println("---------------------------------------------------------");
                            System.out.println("");
                            System.out.println("---------------------------------------------------------");
                            System.out.println("3->First Class");
                            System.out.println("---------------------------------------------------------");

                            System.out.println("");

                            System.out.print("Please Enter Class code:");
                            enterClass = input.nextInt();
                            System.out.println("");
                            System.out.println("");
                            if (enterClass == 1) {
                                System.out.println("---------------------------------------------------------");
                                System.out.println("Welcome to Business Class");
                                System.out.println("---------------------------------------------------------");
                                System.out.println("");
                                business.PropertiesInternational();
                                System.out.println("");
                                System.out.println("---------------------------------------------------------");
                                business.createArmArray();
                                business.getArmArray();
                                System.out.println("");
                                System.out.println("---------------------------------------------------------");
                                System.out.println("Please Enter Armchair code {Exam:1-BUS}");
                                System.out.println("---------------------------------------------------------");
                                System.out.println("");
                                System.out.println("Enter:");
                                input.nextLine();
                                String code = input.nextLine();
                                business.controlArmChair(code, user);
                                System.out.println("");
                                System.out.println("---------------------------------------------------------");
                                break;

                            }
                            else if (enterClass == 2) {
                                System.out.println("---------------------------------------------------------");
                                System.out.println("Welcome to Economic Class");
                                System.out.println("---------------------------------------------------------");
                                System.out.println("");
                                economic.PropertiesInternational();
                                System.out.println("");
                                System.out.println("---------------------------------------------------------");
                                economic.createArmArray();
                                economic.getArmArray();
                                System.out.println("");
                                System.out.println("---------------------------------------------------------");
                                System.out.println("Please Enter Armchair code {Exam:1-ECO}");
                                System.out.println("---------------------------------------------------------");
                                System.out.println("");
                                System.out.println("Enter:");
                                input.nextLine();
                                String code = input.nextLine();
                                economic.controlArmChair(code, user);
                                System.out.println("");
                                System.out.println("---------------------------------------------------------");
                                break;

                            }
                            else if (enterClass==3) {
                                System.out.println("---------------------------------------------------------");
                                System.out.println("Welcome to First Class");
                                System.out.println("---------------------------------------------------------");
                                System.out.println("");
                                firstClass.PropertiesInternational();
                                System.out.println("");
                                System.out.println("---------------------------------------------------------");
                                firstClass.createArmArray();
                                firstClass.getArmArray();
                                System.out.println("");
                                System.out.println("---------------------------------------------------------");
                                System.out.println("Please Enter Armchair code {Exam:1-FCL}");
                                System.out.println("---------------------------------------------------------");
                                System.out.println("");
                                System.out.println("Enter:");
                                input.nextLine();
                                String code = input.nextLine();
                                firstClass.controlArmChair(code, user);
                                System.out.println("");
                                System.out.println("---------------------------------------------------------");
                                break;

                            } else {
                                System.out.println("Wrong Enter");
                            }



                        case 3:
                            System.out.println("Welcome to Anadolu Jet");

                            System.out.println("---------------------------------------------------------");
                            System.out.println("");
                            System.out.println("---------------------------------------------------------");

                            business.createArmArray();
                            firstClass.createArmArray();
                            economic.createArmArray();


                            System.out.println("");

                            System.out.println("1->Economic Class");
                            System.out.println("---------------------------------------------------------");
                            System.out.println("");
                            System.out.println("---------------------------------------------------------");
                            System.out.println("2->Business Class");
                            System.out.println("---------------------------------------------------------");
                            System.out.println("");
                            System.out.print("Please Enter Class code:");
                            enterClass = input.nextInt();
                            System.out.println("");
                            System.out.println("");
                            if (enterClass == 1) {
                                System.out.println("---------------------------------------------------------");
                                System.out.println("Welcome to Economic Class");
                                System.out.println("---------------------------------------------------------");
                                System.out.println("");
                                economic.PropertiesDomestic();
                                System.out.println("");
                                System.out.println("---------------------------------------------------------");
                                economic.createArmArray();
                                economic.getArmArray();
                                System.out.println("");
                                System.out.println("---------------------------------------------------------");
                                System.out.println("Please Enter Armchair code {Exam:1-ECO}");
                                System.out.println("---------------------------------------------------------");
                                System.out.println("");
                                System.out.println("Enter:");
                                input.nextLine();
                                String code = input.nextLine();
                                economic.controlArmChair(code, user);
                                System.out.println("");
                                System.out.println("---------------------------------------------------------");
                                break;


                            }
                            else if (enterClass==2) {
                                System.out.println("---------------------------------------------------------");
                                System.out.println("Welcome to Business Class");
                                System.out.println("---------------------------------------------------------");
                                System.out.println("");
                                business.PropertiesInternational();
                                System.out.println("");
                                System.out.println("---------------------------------------------------------");
                                business.createArmArray();
                                business.getArmArray();
                                System.out.println("");
                                System.out.println("---------------------------------------------------------");
                                System.out.println("Please Enter Armchair code {Exam:1-BUS}");
                                System.out.println("---------------------------------------------------------");
                                System.out.println("");
                                input.nextLine();
                                String code = input.nextLine();
                                business.controlArmChair(code, user);
                                System.out.println("");
                                System.out.println("Enter:");
                                System.out.println("---------------------------------------------------------");
                                break;


                            } else {
                                System.out.println("Wrong Enter");
                            }



                        default:
                            System.out.println("Wrong Enter");

                    }


                } while (true);



            }
            else {
                System.out.println("Wrong Enter!");
            }




            }


        }
    }






