package com.divya.learning;

import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class PractiseZoneKBC {
    void practise(Statement statement, Scanner m) throws SQLException, InterruptedException {
        long part = System.currentTimeMillis();
            if (part % 2 == 0) {


                for (int clr = 1; clr <= 45; clr++) {
                    System.out.println("");
                }
                System.out.println("\t\t\t\t\t\t##################Practise zone######################\n\n");
                long perm = System.currentTimeMillis();
                if (perm % 3 == 0) {
                    System.out.println("Which Bank is Banker of Bank ?");
                    System.out.println("A.State bank of india\t\t\tB.RBI\n");
                    System.out.println("C.Punjab National Bank\t\t\tD.ICIC Bank");
                    for (int clr = 1; clr <= 23; clr++) {
                        System.out.println("");
                    }
                    System.out.print(">>>>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<<<\nAns:-");
                    String prac = m.next(   );
                    switch (prac) {
                        case "B":
                        case "b":
                            System.out.println("You are right");
                            Thread.sleep(1500);
                            break;
                        case "Exit":
                        case "exit":
                            return;
                        default:
                            System.out.println("you are wrong");
                            Thread.sleep(1500);
                    }


                } else if (perm % 3 == 1) {
                    System.out.println("What is our national Animal ?");
                    System.out.println("A.Zebra\t\t\tB.Lion\n");
                    System.out.println("C.Tiger\t\t\tD.Elephant");
                    for (int clr = 1; clr <= 23; clr++) {
                        System.out.println("");
                    }
                    System.out.print(">>>>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<<<\nAns:-");
                    String prac = m.next();
                    switch (prac) {
                        case "B":
                        case "b":
                            System.out.println("You are right");
                            Thread.sleep(1500);
                            break;
                        case "Exit":
                        case "exit":
                            return;
                        default:
                            System.out.println("you are wrong");
                            Thread.sleep(1500);
                    }
                } else if (perm % 3 == 2) {
                    System.out.println("What is our national bird ?");
                    System.out.println("A.peacock\t\t\tB.crow\n");
                    System.out.println("C.parrot\t\t\tD.eagle");
                    for (int clr = 1; clr <= 23; clr++) {
                        System.out.println("");
                    }
                    System.out.print(">>>>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<<<\nAns:-");
                    String prac = m.next();
                    switch (prac) {
                        case "a":
                        case "A":
                            System.out.println("You are right");
                            Thread.sleep(1500);
                            break;
                        case "Exit":
                        case "exit":
                            return;
                        default:
                            System.out.println("you are wrong");
                            Thread.sleep(1500);
                    }
                }
                //--------------------------------------------------------------------------------------------------------------------------------------------------
                //--------------------------------------------------------------------------------------------------------------------------------------------------
                for (int clr = 1; clr <= 25; clr++) {
                    System.out.println("");
                }
                System.out.println("\t\t\t\t\t\t##################Practise zone######################\n\n");

                perm = System.currentTimeMillis();
                if (perm % 3 == 0) {
                    System.out.println("The language discovered by Gautam Bhuddha was ?");
                    System.out.println("A.Bhojpuri\t\t\tB.magadhi\n");
                    System.out.println("C.Pali\t\t\tD.Sanskrit");
                    for (int clr = 1; clr <= 23; clr++) {
                        System.out.println("");
                    }
                    System.out.print(">>>>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<<<\nAns:-");
                    String prac = m.next();
                    switch (prac) {
                        case "c":
                        case "C":
                            System.out.println("You are right");
                            Thread.sleep(1500);
                            break;
                        case "Exit":
                        case "exit":
                            return;
                        default:
                            System.out.println("you are wrong");
                            Thread.sleep(1500);
                    }


                } else if (perm % 3 == 1) {
                    System.out.println("which of the following English films was the first one to be dubbed in Hindi ?");
                    System.out.println("A.Aladdin\t\t\tB.Universal Soldier\n");
                    System.out.println("C.Speed\t\t\tD.iron man");
                    for (int clr = 1; clr <= 23; clr++) {
                        System.out.println("");
                    }
                    System.out.print(">>>>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<<<\nAns:-");
                    String prac = m.next();
                    switch (prac) {
                        case "a":
                        case "A":
                            System.out.println("You are right");
                            Thread.sleep(1500);
                            break;
                        case "Exit":
                        case "exit":
                            return;
                        default:
                            System.out.println("you are wrong");
                            Thread.sleep(1500);
                    }
                } else if (perm % 3 == 2) {
                    System.out.println("Name of the player of Indian cricket team who 4 january 2013 was named as CEAT International Cricketer of the year 2012 ?");
                    System.out.println("A.Yuvraj Singh\t\t\tB.gautam gambhir\n");
                    System.out.println("C.Sachin Tendulkar\t\t\tD.Virat Kohli");
                    for (int clr = 1; clr <= 23; clr++) {
                        System.out.println("");
                    }
                    System.out.print(">>>>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<<<\nAns:-");
                    String prac = m.next();
                    switch (prac) {
                        case "d":
                        case "D":
                            System.out.println("You are right");
                            Thread.sleep(1500);
                            break;
                        case "Exit":
                        case "exit":
                            return;
                        default:
                            System.out.println("you are wrong");
                            Thread.sleep(1500);
                    }

                }
                //33--------------------------------------------------------------------------------------------------------------------------------------------------
                //33--------------------------------------------------------------------------------------------------------------------------------------------------
                for (int clr = 1; clr <= 25; clr++) {
                    System.out.println("");
                }
                System.out.println("\t\t\t\t\t\t##################Practise zone######################\n\n");

                perm = System.currentTimeMillis();
                if (perm % 3 == 0) {
                    System.out.println("Largest continent in the world is ?");
                    System.out.println("A.Africa \t\t\tB.Asia \n");
                    System.out.println("C.Australia\t\t\tD.Antarctica");
                    for (int clr = 1; clr <= 23; clr++) {
                        System.out.println("");
                    }
                    System.out.print(">>>>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<<<\nAns:-");
                    String prac = m.next();
                    switch (prac) {
                        case "b":
                        case "B":
                            System.out.println("You are right");
                            Thread.sleep(1500);
                            break;
                        case "Exit":
                        case "exit":
                            return;
                        default:
                            System.out.println("you are wrong");
                            Thread.sleep(1500);
                    }


                } else if (perm % 3 == 1) {
                    System.out.println("The India's Largest Rainfall is reported at?");
                    System.out.println("A.sikkim\t\t\tB.Rajasthan \n");
                    System.out.println("C.Mawsynram\t\t\tD.chamba");
                    for (int clr = 1; clr <= 23; clr++) {
                        System.out.println("");
                    }
                    System.out.print(">>>>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<<<\nAns:-");
                    String prac = m.next();
                    switch (prac) {
                        case "c":
                        case "C":
                            System.out.println("You are right");
                            Thread.sleep(1500);
                            break;
                        case "Exit":
                        case "exit":
                            return;
                        default:
                            System.out.println("you are wrong");
                            Thread.sleep(1500);
                    }
                } else if (perm % 3 == 2) {
                    System.out.println("Who was the first Indian to be President of UN General assembly ?");
                    System.out.println("A.Mrs. Vijay Lakshmi Pandit\t\t\tB. Ramesh Bhandari\n");
                    System.out.println("C.Natwar Singh\t\t\tD.Krishna Menon");
                    for (int clr = 1; clr <= 23; clr++) {
                        System.out.println("");
                    }
                    System.out.print(">>>>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<<<\nAns:-");
                    String prac = m.next();
                    switch (prac) {
                        case "a":
                        case "A":
                            System.out.println("You are right");
                            Thread.sleep(1500);
                            break;
                        case "Exit":
                        case "exit":
                            return;
                        default:
                            System.out.println("you are wrong");
                            Thread.sleep(1500);
                    }

                }
                //44--------------------------------------------------------------------------------------------------------------------------------------------------
                //44--------------------------------------------------------------------------------------------------------------------------------------------------
                for (int clr = 1; clr <= 25; clr++) {
                    System.out.println("");
                }
                System.out.println("\t\t\t\t\t\t##################Practise zone######################\n\n");

                perm = System.currentTimeMillis();
                if (perm % 3 == 0) {
                    System.out.println("which king belongs the Lion capital at sarnath?");
                    System.out.println("A.Chandragupta\t\t\tB.Kanishka\n");
                    System.out.println("C.Harsha\t\t\tD.Ashoka");
                    for (int clr = 1; clr <= 23; clr++) {
                        System.out.println("");
                    }
                    System.out.print(">>>>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<<<\nAns:-");
                    String prac = m.next();
                    switch (prac) {
                        case "d":
                        case "D":
                            System.out.println("You are right");
                            Thread.sleep(1500);
                            break;
                        case "Exit":
                        case "exit":
                            return;
                        default:
                            System.out.println("you are wrong");
                            Thread.sleep(1500);
                    }


                } else if (perm % 3 == 1) {
                    System.out.println("The member of the Rajya sabha are elected by?");
                    System.out.println("A.People\t\t\tB.Elected members of the legislative council \n");
                    System.out.println("C.Elected members of legislative assembly\t\t\tD.Lok sabha");
                    for (int clr = 1; clr <= 23; clr++) {
                        System.out.println("");
                    }
                    System.out.print(">>>>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<<<\nAns:-");
                    String prac = m.next();
                    switch (prac) {
                        case "c":
                        case "C":
                            System.out.println("You are right");
                            Thread.sleep(1500);
                            break;
                        case "Exit":
                        case "exit":
                            return;
                        default:
                            System.out.println("you are wrong");
                            Thread.sleep(1500);
                    }
                } else if (perm % 3 == 2) {
                    System.out.println("The first women in space was ?");
                    System.out.println("A.Valentina tereshkova\t\t\tB.kalpana Chawla\n");
                    System.out.println("C.Tamara Press\t\t\tD.Sally Ride");
                    for (int clr = 1; clr <= 23; clr++) {
                        System.out.println("");
                    }
                    System.out.print(">>>>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<<<\nAns:-");
                    String prac = m.next();
                    switch (prac) {
                        case "d":
                        case "D":
                            System.out.println("You are right");
                            Thread.sleep(1500);
                            break;
                        case "Exit":
                        case "exit":
                            return;
                        default:
                            System.out.println("you are wrong");
                            Thread.sleep(1500);
                    }

                }
                //55--------------------------------------------------------------------------------------------------------------------------------------------------
                //55--------------------------------------------------------------------------------------------------------------------------------------------------
                for (int clr = 1; clr <= 25; clr++) {
                    System.out.println("");
                }
                System.out.println("\t\t\t\t\t\t##################Practise zone######################\n\n");

                perm = System.currentTimeMillis();
                if (perm % 3 == 0) {
                    System.out.println("Plant bends towards the source of light on account of the movement of curvature known as?");
                    System.out.println("A.Geotropism\t\t\tB.Thigmotropism\n");
                    System.out.println("C.Chemotropism\t\t\tD.Phototropism");
                    for (int clr = 1; clr <= 23; clr++) {
                        System.out.println("");
                    }
                    System.out.print(">>>>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<<<\nAns:-");
                    String prac = m.next();
                    switch (prac) {
                        case "d":
                        case "D":
                            System.out.println("You are right");
                            Thread.sleep(1500);
                            break;
                        case "Exit":
                        case "exit":
                            return;
                        default:
                            System.out.println("you are wrong");
                            Thread.sleep(1500);
                    }


                } else if (perm % 3 == 1) {
                    System.out.println("The first recipient of Rajiv Gandhi's 'Khel Ratna' award was?");
                    System.out.println("A. Vishwanathan Anand\t\t\tB.Leander Peas\n");
                    System.out.println("C.Kapil Dev\t\t\tD.Limba Ram");
                    for (int clr = 1; clr <= 23; clr++) {
                        System.out.println("");
                    }
                    System.out.print(">>>>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<<<\nAns:-");
                    String prac = m.next();
                    switch (prac) {
                        case "a":
                        case "A":
                            System.out.println("You are right");
                            Thread.sleep(1500);
                            break;
                        case "Exit":
                        case "exit":
                            return;
                        default:
                            System.out.println("you are wrong");
                            Thread.sleep(1500);
                    }


                } else if (perm % 3 == 2) {
                    System.out.println("Name the Cricketer who has became the youngest Batsman to score  10000 Runs in test Cricket ?");
                    System.out.println("A. Alastair Cook\t\t\tB.Sachin Tendulkar\n");
                    System.out.println("C.Daniel Vettori\t\t\tD.Ricky Ponting");
                    for (int clr = 1; clr <= 23; clr++) {
                        System.out.println("");
                    }
                    System.out.print(">>>>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<<<\nAns:-");
                    String prac = m.next();
                    switch (prac) {
                        case "a":
                        case "A":
                            System.out.println("You are right");
                            Thread.sleep(1500);
                            break;
                        case "Exit":
                        case "exit":
                            return;
                        default:
                            System.out.println("you are wrong");
                            Thread.sleep(1500);
                    }

                }
                //66--------------------------------------------------------------------------------------------------------------------------------------------------
                //66--------------------------------------------------------------------------------------------------------------------------------------------------
                for (int clr = 1; clr <= 25; clr++) {
                    System.out.println("");
                }
                System.out.println("\t\t\t\t\t\t##################Practise zone######################\n\n");

                perm = System.currentTimeMillis();
                if (perm % 3 == 0) {
                    System.out.println("The leading state in Producing Paper is");
                    System.out.println("A.Bihar\t\t\tB.West bengal\n");
                    System.out.println("C.Kerala\t\t\tD.orissa");
                    for (int clr = 1; clr <= 23; clr++) {
                        System.out.println("");
                    }
                    System.out.print(">>>>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<<<\nAns:-");
                    String prac = m.next();
                    switch (prac) {
                        case "b":
                        case "B":
                            System.out.println("You are right");
                            Thread.sleep(1500);
                            break;
                        case "Exit":
                        case "exit":
                            return;
                        default:
                            System.out.println("you are wrong");
                            Thread.sleep(1500);
                    }


                } else if (perm % 3 == 1) {
                    System.out.println("Central Drug research Institute is located at ");
                    System.out.println("A.Delhi\t\t\tB.Nagpur\n");
                    System.out.println("C.Mysore\t\t\tD.Lukhnow");
                    for (int clr = 1; clr <= 23; clr++) {
                        System.out.println("");
                    }
                    System.out.print(">>>>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<<<\nAns:-");
                    String prac = m.next();
                    switch (prac) {
                        case "d":
                        case "D":
                            System.out.println("You are right");
                            Thread.sleep(1500);
                            break;
                        case "Exit":
                        case "exit":
                            return;
                        default:
                            System.out.println("you are wrong");
                            Thread.sleep(1500);
                    }


                } else if (perm % 3 == 2) {
                    System.out.println("The peroson who is also known as flying sikh of India ?");
                    System.out.println("A.Mohinder singh\t\t\tB.Joginder singh\n");
                    System.out.println("C.Milkha singh\t\t\tD.Ajit singh");
                    for (int clr = 1; clr <= 23; clr++) {
                        System.out.println("");
                    }
                    System.out.print(">>>>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<<<\nAns:-");
                    String prac = m.next();
                    switch (prac) {
                        case "c":
                        case "C":
                            System.out.println("You are right");
                            Thread.sleep(1500);
                            break;
                        case "Exit":
                        case "exit":
                            return;
                        default:
                            System.out.println("you are wrong");
                            Thread.sleep(1500);
                    }

                }
                //77--------------------------------------------------------------------------------------------------------------------------------------------------
                //77--------------------------------------------------------------------------------------------------------------------------------------------------
                for (int clr = 1; clr <= 25; clr++) {
                    System.out.println("");
                }
                System.out.println("\t\t\t\t\t\t##################Practise zone######################\n\n");

                perm = System.currentTimeMillis();
                if (perm % 3 == 0) {
                    System.out.println("Which city is known as garden city of india");
                    System.out.println("A.Chandigarh\t\t\tB.Imphal\n");
                    System.out.println("C.Shimla\t\t\tD.Banglore");
                    for (int clr = 1; clr <= 23; clr++) {
                        System.out.println("");
                    }
                    System.out.print(">>>>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<<<\nAns:-");
                    String prac = m.next();
                    switch (prac) {
                        case "d":
                        case "D":
                            System.out.println("You are right");
                            Thread.sleep(1500);
                            break;
                        case "Exit":
                        case "exit":
                            return;
                        default:
                            System.out.println("you are wrong D.Banglore is right");
                            Thread.sleep(1500);
                    }


                } else if (perm % 3 == 1) {
                    System.out.println("The first indian to recive the nobel prize in literature was");
                    System.out.println("A.Rabindranath Tagore\t\t\tB.C.V Raman\n");
                    System.out.println("C.Sarojni neidu\t\t\tD.Mother teresa");
                    for (int clr = 1; clr <= 23; clr++) {
                        System.out.println("");
                    }
                    System.out.print(">>>>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<<<\nAns:-");
                    String prac = m.next();
                    switch (prac) {
                        case "a":
                        case "A":
                            System.out.println("You are right ");
                            Thread.sleep(1500);
                            break;
                        case "Exit":
                        case "exit":
                            return;
                        default:
                            System.out.println("you are wrong A.RabinderNath Tagore");
                            Thread.sleep(1500);
                    }


                } else if (perm % 3 == 2) {
                    System.out.println("Who is the first Asian winner of nobel prize ?");
                    System.out.println("A.Rajiv Gandi\t\t\tB.Mother teresa\n");
                    System.out.println("C. C.V raman\t\t\tD.Rabindernath Tagore");
                    for (int clr = 1; clr <= 23; clr++) {
                        System.out.println("");
                    }
                    System.out.print(">>>>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<<<\nAns:-");
                    String prac = m.next();
                    switch (prac) {
                        case "c":
                        case "C":
                            System.out.println("You are right");
                            Thread.sleep(1500);
                            break;
                        case "Exit":
                        case "exit":
                            return;
                        default:
                            System.out.println("you are wrong C. C.V Raman is right");
                            Thread.sleep(1500);
                    }

                }


                //88--------------------------------------------------------------------------------------------------------------------------------------------------
                //88--------------------------------------------------------------------------------------------------------------------------------------------------
                for (int clr = 1; clr <= 25; clr++) {
                    System.out.println("");
                }
                System.out.println("\t\t\t\t\t\t##################Practise zone######################\n\n");

                perm = System.currentTimeMillis();
                if (perm % 3 == 0) {
                    System.out.println("Which city is known as Big Apple");
                    System.out.println("A.Tokoyo\t\t\tB.London\n");
                    System.out.println("C.New York\t\t\tD.Banglore");
                    for (int clr = 1; clr <= 23; clr++) {
                        System.out.println("");
                    }
                    System.out.print(">>>>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<<<\nAns:-");
                    String prac = m.next();
                    switch (prac) {
                        case "c":
                        case "C":
                            System.out.println("You are right");
                            Thread.sleep(1500);
                            break;
                        case "Exit":
                        case "exit":
                            return;
                        default:
                            System.out.println("you are wrong C.New York is right");
                            Thread.sleep(1500);
                    }


                } else if (perm % 3 == 1) {
                    System.out.println("which is the Largest Airport in the world ?");
                    System.out.println("A.Dubbai International Airport\t\t\tB.King Khalid International\n");
                    System.out.println("C.Sarojni neidu\t\t\tD.Mother teresa");
                    for (int clr = 1; clr <= 23; clr++) {
                        System.out.println("");
                    }
                    System.out.print(">>>>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<<<\nAns:-");
                    String prac = m.next();
                    switch (prac) {
                        case "b":
                        case "B":
                            System.out.println("You are right ");
                            Thread.sleep(1500);
                            break;
                        case "Exit":
                        case "exit":
                            return;
                        default:
                            System.out.println("you are wrong A.RabinderNath Tagore");
                            Thread.sleep(1500);
                    }


                } else if (perm % 3 == 2) {
                    System.out.println("Who is the first Asian winner of nobel prize ?");
                    System.out.println("A.Rajiv Gandi\t\t\tB.Mother teresa\n");
                    System.out.println("C. C.V raman\t\t\tD.Rabindernath Tagore");
                    for (int clr = 1; clr <= 23; clr++) {
                        System.out.println("");
                    }
                    System.out.print(">>>>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<<<\nAns:-");
                    String prac = m.next();
                    switch (prac) {
                        case "c":
                        case "C":
                            System.out.println("You are right");
                            Thread.sleep(1500);
                            break;
                        case "Exit":
                        case "exit":
                            return;
                        default:
                            System.out.println("you are wrong C. C.V Raman is right");
                            Thread.sleep(1500);
                    }
                }
                //99--------------------------------------------------------------------------------------------------------------------------------------------------
                //99--------------------------------------------------------------------------------------------------------------------------------------------------
                for (int clr = 1; clr <= 25; clr++) {
                    System.out.println("");
                }
                System.out.println("\t\t\t\t\t\t##################Practise zone######################\n\n");

                perm = System.currentTimeMillis();
                if (perm % 3 == 0) {
                    System.out.println("How many languages and dialects are spoken by people all over the world? ");
                    System.out.println("A. 6,000\t\t\tB. 9,000\n");
                    System.out.println("C. 4,000\t\t\tD. 1,000 ");
                    for (int clr = 1; clr <= 23; clr++) {
                        System.out.println("");
                    }
                    System.out.print(">>>>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<<<\nAns:-");
                    String prac = m.next();
                    switch (prac) {
                        case "b":
                        case "B":
                            System.out.println("You are right");
                            Thread.sleep(1500);
                            break;
                        case "Exit":
                        case "exit":
                            return;
                        default:
                            System.out.println("you are wrong B. 9000 is right");
                            Thread.sleep(1500);
                    }


                } else if (perm % 3 == 1) {
                    System.out.println("Approximately, how many people speak Chinese language? ");
                    System.out.println("A. 1 billion\t\t\tB. 1 million\n");
                    System.out.println("C. 1 lakh   \t\t\tD. 1 thousand");
                    for (int clr = 1; clr <= 23; clr++) {
                        System.out.println("");
                    }
                    System.out.print(">>>>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<<<\nAns:-");
                    String prac = m.next();
                    switch (prac) {
                        case "a":
                        case "A":
                            System.out.println("You are right ");
                            Thread.sleep(1500);
                            break;
                        case "Exit":
                        case "exit":
                            return;
                        default:
                            System.out.println("you are wrong A.1 Billion is true");
                            Thread.sleep(1500);
                    }


                } else if (perm % 3 == 2) {
                    System.out.println("The language with the richest vocabulary is: ");
                    System.out.println("A. Hindi  \t\t\tB. French \n");
                    System.out.println("C. English\t\t\tD. German");
                    for (int clr = 1; clr <= 23; clr++) {
                        System.out.println("");
                    }
                    System.out.print(">>>>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<<<\nAns:-");
                    String prac = m.next();
                    switch (prac) {
                        case "c":
                        case "C":
                            System.out.println("You are right");
                            Thread.sleep(1500);
                            break;
                        case "Exit":
                        case "exit":
                            return;
                        default:
                            System.out.println("you are wrong C. English is right");
                            Thread.sleep(1500);
                    }

                }
                //10--------------------------------------------------------------------------------------------------------------------------------------------------
                //10--------------------------------------------------------------------------------------------------------------------------------------------------
                for (int clr = 1; clr <= 25; clr++) {
                    System.out.println("");
                }
                System.out.println("\t\t\t\t\t\t##################Practise zone######################\n\n");

                perm = System.currentTimeMillis();
                if (perm % 3 == 0) {
                    System.out.println("Which book has been printed in the maximum number of languages and these scripts");
                    System.out.println("A. The Bible\t\t\tB. Hiraka Sutra\n");
                    System.out.println("C. The Super Book\t\t\tGuliver Travel");
                    for (int clr = 1; clr <= 23; clr++) {
                        System.out.println("");
                    }
                    System.out.print(">>>>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<<<\nAns:-");
                    String prac = m.next();
                    switch (prac) {
                        case "a":
                        case "A":
                            System.out.println("You are right");
                            Thread.sleep(1500);
                            break;
                        case "Exit":
                        case "exit":
                            return;
                        default:
                            System.out.println("you are wrong A.The Bible is true");
                            Thread.sleep(1500);
                    }


                } else if (perm % 3 == 1) {
                    System.out.println("The only religious book ever printed in a shorthand scripts is ");
                    System.out.println("A. The Ramayana\t\t\tB. The Mahabharata\n");
                    System.out.println("C. The bible   \t\t\tD. Guru Granth Sahib ");
                    for (int clr = 1; clr <= 23; clr++) {
                        System.out.println("");
                    }
                    System.out.print(">>>>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<<<\nAns:-");
                    String prac = m.next();
                    switch (prac) {
                        case "c":
                        case "C":
                            System.out.println("You are right ");
                            Thread.sleep(1500);
                            break;
                        case "Exit":
                        case "exit":
                            return;
                        default:
                            System.out.println("you are wrong C.The Bible is true");
                            Thread.sleep(1500);
                    }


                } else if (perm % 3 == 2) {
                    System.out.println("The oldest printed work in the world, which dates back to AD 868 is:");
                    System.out.println("A. The Bible   \t\t\tB. The Hirake Sutra\n");
                    System.out.println("C. The Ramayana\t\t\tD. The Mahabharata   ");
                    for (int clr = 1; clr <= 23; clr++) {
                        System.out.println("");
                    }
                    System.out.print(">>>>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<<<\nAns:-");
                    String prac = m.next();
                    switch (prac) {
                        case "b":
                        case "B":
                            System.out.println("You are right");
                            Thread.sleep(1500);
                            break;
                        case "Exit":
                        case "exit":
                            return;
                        default:
                            System.out.println("you are wrong B.The Hirake Sutra is right");
                            Thread.sleep(1500);
                    }

                }
            }
//+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
//+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
        else if (part % 2 == 1) {

            for (int clr = 1; clr <= 45; clr++) {
                System.out.println("");
            }
            System.out.println("\t\t\t\t\t\t##################Practise zone######################\n\n");
            long perm = System.currentTimeMillis();
            if (perm % 3 == 0) {
                System.out.println("The American General who led the revolt against the British & declared American independence was");
                System.out.println("A. George Washington\t\t\tB. Bill Clinton \n");
                System.out.println("C. George Bush      \t\t\tD. Brack Obama");
                for (int clr = 1; clr <= 23; clr++) {
                    System.out.println("");
                }
                System.out.print(">>>>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<<<\nAns:-");
                String prac = m.next();
                switch (prac) {
                    case "a":
                    case "A":
                        System.out.println("You are right");
                        Thread.sleep(1500);
                        break;
                    case "Exit":
                    case "exit":
                        return;
                    default:
                        System.out.println("you are wrong A.Gorge washington is true");
                        Thread.sleep(1500);
                }


            } else if (perm % 3 == 1) {
                System.out.println("Who is known as the father of English poetry? ");
                System.out.println("A. Geoffrey Chaucer\t\t\tB. John Milton\n");
                System.out.println("C. John Keats      \t\t\tD. James Jeans");
                for (int clr = 1; clr <= 23; clr++) {
                    System.out.println("");
                }
                System.out.print(">>>>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<<<\nAns:-");
                String prac = m.next();
                switch (prac) {
                    case "a":
                    case "A":
                        System.out.println("You are right");
                        Thread.sleep(1500);
                        break;
                    case "Exit":
                    case "exit":
                        return;
                    default:
                        System.out.println("you are wrong A. Geoffrey Chaucer is write answer");
                        Thread.sleep(1500);
                }
            } else if (perm % 3 == 2) {
                System.out.println("Who was first to reach the South Pole");
                System.out.println("A. Rear Admiral\t\t\tB. Capt. Amundsen  \n");
                System.out.println("C. J.J Thomas  \t\t\tD. Sir Edmund Hillary");
                for (int clr = 1; clr <= 23; clr++) {
                    System.out.println("");
                }
                System.out.print(">>>>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<<<\nAns:-");
                String prac = m.next();
                switch (prac) {
                    case "b":
                    case "":
                        System.out.println("You are right");
                        Thread.sleep(1500);
                        break;
                    case "Exit":
                    case "exit":
                        return;
                    default:
                        System.out.println("you are wrong B. Capt. Amundsen is write answer");
                        Thread.sleep(1500);
                }
            }
            //--------------------------------------------------------------------------------------------------------------------------------------------------
            //--------------------------------------------------------------------------------------------------------------------------------------------------
            for (int clr = 1; clr <= 25; clr++) {
                System.out.println("");
            }
            System.out.println("\t\t\t\t\t\t##################Practise zone######################\n\n");

            perm = System.currentTimeMillis();
            if (perm % 3 == 0) {
                System.out.println("The language discovered by Gautam Bhuddha was ?");
                System.out.println("A.Bhojpuri\t\t\tB.magadhi\n");
                System.out.println("C.Pali\t\t\tD.Sanskrit");
                for (int clr = 1; clr <= 23; clr++) {
                    System.out.println("");
                }
                System.out.print(">>>>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<<<\nAns:-");
                String prac = m.next();
                switch (prac) {
                    case "c":
                    case "C":
                        System.out.println("You are right");
                        Thread.sleep(1500);
                        break;
                    case "Exit":
                    case "exit":
                        return;
                    default:
                        System.out.println("you are wrong C.pali is right Answer");
                        Thread.sleep(1500);
                }


            } else if (perm % 3 == 1) {
                System.out.println("which of the following English films was the first one to be dubbed in Hindi ?");
                System.out.println("A.Aladdin\t\t\tB.Universal Soldier\n");
                System.out.println("C.Speed\t\t\tD.iron man");
                for (int clr = 1; clr <= 23; clr++) {
                    System.out.println("");
                }
                System.out.print(">>>>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<<<\nAns:-");
                String prac = m.next();
                switch (prac) {
                    case "a":
                    case "A":
                        System.out.println("You are right");
                        Thread.sleep(1500);
                        break;
                    case "Exit":
                    case "exit":
                        return;
                    default:
                        System.out.println("you are wrong A.Aladdin is right Answer");
                        Thread.sleep(1500);
                }
            } else if (perm % 3 == 2) {
                System.out.println("Name of the player of Indian cricket team who 4 january 2013 was named as CEAT International Cricketer of the year 2012 ?");
                System.out.println("A.Yuvraj Singh\t\t\tB.gautam gambhir\n");
                System.out.println("C.Sachin Tendulkar\t\t\tD.Virat Kohli");
                for (int clr = 1; clr <= 23; clr++) {
                    System.out.println("");
                }
                System.out.print(">>>>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<<<\nAns:-");
                String prac = m.next();
                switch (prac) {
                    case "d":
                    case "D":
                        System.out.println("You are right");
                        Thread.sleep(1500);
                        break;
                    case "Exit":
                    case "exit":
                        return;
                    default:
                        System.out.println("you are wrong D.virat Kohli is wright Answer");
                        Thread.sleep(1500);
                }

            }
            //33--------------------------------------------------------------------------------------------------------------------------------------------------
            //33--------------------------------------------------------------------------------------------------------------------------------------------------
            for (int clr = 1; clr <= 25; clr++) {
                System.out.println("");
            }
            System.out.println("\t\t\t\t\t\t##################Practise zone######################\n\n");

            perm = System.currentTimeMillis();
            if (perm % 3 == 0) {
                System.out.println("Largest continent in the world is ?");
                System.out.println("A.Africa \t\t\tB.Asia \n");
                System.out.println("C.Australia\t\t\tD.Antarctica");
                for (int clr = 1; clr <= 23; clr++) {
                    System.out.println("");
                }
                System.out.print(">>>>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<<<\nAns:-");
                String prac = m.next();
                switch (prac) {
                    case "b":
                    case "B":
                        System.out.println("You are right");
                        Thread.sleep(1500);
                        break;
                    case "Exit":
                    case "exit":
                        return;
                    default:
                        System.out.println("you are wrong B.Asia is wright Answer");
                        Thread.sleep(1500);
                }


            } else if (perm % 3 == 1) {
                System.out.println("The India's Largest Rainfall is reported at?");
                System.out.println("A.sikkim\t\t\tB.Rajasthan \n");
                System.out.println("C.Mawsynram\t\t\tD.chamba");
                for (int clr = 1; clr <= 23; clr++) {
                    System.out.println("");
                }
                System.out.print(">>>>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<<<\nAns:-");
                String prac = m.next();
                switch (prac) {
                    case "c":
                    case "C":
                        System.out.println("You are right");
                        Thread.sleep(1500);
                        break;
                    case "Exit":
                    case "exit":
                        return;
                    default:
                        System.out.println("you are wrong C.Mawsynram is wright Answer");
                        Thread.sleep(1500);
                }
            } else if (perm % 3 == 2) {
                System.out.println("Who was the first Indian to be President of UN General assembly ?");
                System.out.println("A.Mr. Vijay Lakshmi Pandit\t\t\tB. Ramesh Bhandari\n");
                System.out.println("C.Natwar Singh\t\t\tD.Krishna Menon");
                for (int clr = 1; clr <= 23; clr++) {
                    System.out.println("");
                }
                System.out.print(">>>>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<<<\nAns:-");
                String prac = m.next();
                switch (prac) {
                    case "a":
                    case "A":
                        System.out.println("You are right");
                        Thread.sleep(1500);
                        break;
                    case "Exit":
                    case "exit":
                        return;
                    default:
                        System.out.println("you are wrong A.Mr.Vijay Lakshmi Pandit");
                        Thread.sleep(1500);
                }

            }
            //44--------------------------------------------------------------------------------------------------------------------------------------------------
            //44--------------------------------------------------------------------------------------------------------------------------------------------------
            for (int clr = 1; clr <= 25; clr++) {
                System.out.println("");
            }
            System.out.println("\t\t\t\t\t\t##################Practise zone######################\n\n");

            perm = System.currentTimeMillis();
            if (perm % 3 == 0) {
                System.out.println("which king belongs the Lion capital at sarnath?");
                System.out.println("A.Chandragupta\t\t\tB.Kanishka\n");
                System.out.println("C.Harsha\t\t\tD.Ashoka");
                for (int clr = 1; clr <= 23; clr++) {
                    System.out.println("");
                }
                System.out.print(">>>>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<<<\nAns:-");
                String prac = m.next();
                switch (prac) {
                    case "d":
                    case "D":
                        System.out.println("You are right");
                        Thread.sleep(1500);
                        break;
                    case "Exit":
                    case "exit":
                        return;
                    default:
                        System.out.println("you are wrong D.Ashoka is right answer");
                        Thread.sleep(1500);
                }


            } else if (perm % 3 == 1) {
                System.out.println("The member of the Rajya sabha are elected by?");
                System.out.println("A.People\t\t\tB.Elected members of the legislative council \n");
                System.out.println("C.Elected members of legislative assembly\t\t\tD.Lok sabha");
                for (int clr = 1; clr <= 23; clr++) {
                    System.out.println("");
                }
                System.out.print(">>>>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<<<\nAns:-");
                String prac = m.next();
                switch (prac) {
                    case "c":
                    case "C":
                        System.out.println("You are right");
                        Thread.sleep(1500);
                        break;
                    case "Exit":
                    case "exit":
                        return;
                    default:
                        System.out.println("you are wrong C.Elected member of legistative assembly is right Asnswer ");
                        Thread.sleep(1500);
                }
            } else if (perm % 3 == 2) {
                System.out.println("The first women in space was ?");
                System.out.println("A.Valentina tereshkova\t\t\tB.kalpana Chawla\n");
                System.out.println("C.Tamara Press\t\t\tD.Sally Ride");
                for (int clr = 1; clr <= 23; clr++) {
                    System.out.println("");
                }
                System.out.print(">>>>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<<<\nAns:-");
                String prac = m.next();
                switch (prac) {
                    case "d":
                    case "D":
                        System.out.println("You are right");
                        Thread.sleep(1500);
                        break;
                    case "Exit":
                    case "exit":
                        return;
                    default:
                        System.out.println("you are wrong d.Sally Ride is wright Answer");
                        Thread.sleep(1500);
                }

            }
            //55--------------------------------------------------------------------------------------------------------------------------------------------------
            //55--------------------------------------------------------------------------------------------------------------------------------------------------
            for (int clr = 1; clr <= 25; clr++) {
                System.out.println("");
            }
            System.out.println("\t\t\t\t\t\t##################Practise zone######################\n\n");

            perm = System.currentTimeMillis();
            if (perm % 3 == 0) {
                System.out.println("Plant bends towards the source of light on account of the movement of curvature known as?");
                System.out.println("A.Geotropism\t\t\tB.Thigmotropism\n");
                System.out.println("C.Chemotropism\t\t\tD.Phototropism");
                for (int clr = 1; clr <= 23; clr++) {
                    System.out.println("");
                }
                System.out.print(">>>>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<<<\nAns:-");
                String prac = m.next();
                switch (prac) {
                    case "d":
                    case "D":
                        System.out.println("You are right");
                        Thread.sleep(1500);
                        break;
                    case "Exit":
                    case "exit":
                        return;
                    default:
                        System.out.println("you are wrong D.phototropism is right Answer");
                        Thread.sleep(1500);
                }


            } else if (perm % 3 == 1) {
                System.out.println("The first recipient of Rajiv Gandhi's 'Khel Ratna' award was?");
                System.out.println("A. Vishwanathan Anand\t\t\tB.Leander Peas\n");
                System.out.println("C.Kapil Dev\t\t\tD.Limba Ram");
                for (int clr = 1; clr <= 23; clr++) {
                    System.out.println("");
                }
                System.out.print(">>>>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<<<\nAns:-");
                String prac = m.next();
                switch (prac) {
                    case "a":
                    case "A":
                        System.out.println("You are right");
                        Thread.sleep(1500);
                        break;
                    case "Exit":
                    case "exit":
                        return;
                    default:
                        System.out.println("you are wrong A.Vishwanathan Anand is right");
                        Thread.sleep(1500);
                }


            } else if (perm % 3 == 2) {
                System.out.println("Name the Cricketer who has became the youngest Batsman to score  10000 Runs in test Cricket ?");
                System.out.println("A. Alastair Cook\t\t\tB.Sachin Tendulkar\n");
                System.out.println("C.Daniel Vettori\t\t\tD.Ricky Ponting");
                for (int clr = 1; clr <= 23; clr++) {
                    System.out.println("");
                }
                System.out.print(">>>>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<<<\nAns:-");
                String prac = m.next();
                switch (prac) {
                    case "a":
                    case "A":
                        System.out.println("You are right");
                        Thread.sleep(1500);
                        break;
                    case "Exit":
                    case "exit":
                        return;
                    default:
                        System.out.println("you are wrong");
                        Thread.sleep(1500);
                }

            }
            //66--------------------------------------------------------------------------------------------------------------------------------------------------
            //66--------------------------------------------------------------------------------------------------------------------------------------------------
            for (int clr = 1; clr <= 25; clr++) {
                System.out.println("");
            }
            System.out.println("\t\t\t\t\t\t##################Practise zone######################\n\n");

            perm = System.currentTimeMillis();
            if (perm % 3 == 0) {
                System.out.println("The leading state in Producing Paper is");
                System.out.println("A.Bihar\t\t\tB.West bengal\n");
                System.out.println("C.Kerala\t\t\tD.orissa");
                for (int clr = 1; clr <= 23; clr++) {
                    System.out.println("");
                }
                System.out.print(">>>>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<<<\nAns:-");
                String prac = m.next();
                switch (prac) {
                    case "b":
                    case "B":
                        System.out.println("You are right");
                        Thread.sleep(1500);
                        break;
                    case "Exit":
                    case "exit":
                        return;
                    default:
                        System.out.println("you are wrong");
                        Thread.sleep(1500);
                }


            } else if (perm % 3 == 1) {
                System.out.println("Central Drug research Institute is located at ");
                System.out.println("A.Delhi\t\t\tB.Nagpur\n");
                System.out.println("C.Mysore\t\t\tD.Lukhnow");
                for (int clr = 1; clr <= 23; clr++) {
                    System.out.println("");
                }
                System.out.print(">>>>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<<<\nAns:-");
                String prac = m.next();
                switch (prac) {
                    case "d":
                    case "D":
                        System.out.println("You are right");
                        Thread.sleep(1500);
                        break;
                    case "Exit":
                    case "exit":
                        return;
                    default:
                        System.out.println("you are wrong");
                        Thread.sleep(1500);
                }


            } else if (perm % 3 == 2) {
                System.out.println("The peroson who is also known as flying sikh of India ?");
                System.out.println("A.Mohinder singh\t\t\tB.Joginder singh\n");
                System.out.println("C.Milkha singh\t\t\tD.Ajit singh");
                for (int clr = 1; clr <= 23; clr++) {
                    System.out.println("");
                }
                System.out.print(">>>>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<<<\nAns:-");
                String prac = m.next();
                switch (prac) {
                    case "c":
                    case "C":
                        System.out.println("You are right");
                        Thread.sleep(1500);
                        break;
                    case "Exit":
                    case "exit":
                        return;
                    default:
                        System.out.println("you are wrong");
                        Thread.sleep(1500);
                }

            }
            //77--------------------------------------------------------------------------------------------------------------------------------------------------
            //77--------------------------------------------------------------------------------------------------------------------------------------------------
            for (int clr = 1; clr <= 25; clr++) {
                System.out.println("");
            }
            System.out.println("\t\t\t\t\t\t##################Practise zone######################\n\n");

            perm = System.currentTimeMillis();
            if (perm % 3 == 0) {
                System.out.println("Which city is known as garden city of india");
                System.out.println("A.Chandigarh\t\t\tB.Imphal\n");
                System.out.println("C.Shimla\t\t\tD.Banglore");
                for (int clr = 1; clr <= 23; clr++) {
                    System.out.println("");
                }
                System.out.print(">>>>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<<<\nAns:-");
                String prac = m.next();
                switch (prac) {
                    case "d":
                    case "D":
                        System.out.println("You are right");
                        Thread.sleep(1500);
                        break;
                    case "Exit":
                    case "exit":
                        return;
                    default:
                        System.out.println("you are wrong D.Banglore is right");
                        Thread.sleep(1500);
                }


            } else if (perm % 3 == 1) {
                System.out.println("The first indian to recive the nobel prize in literature was");
                System.out.println("A.Rabindranath Tagore\t\t\tB.C.V Raman\n");
                System.out.println("C.Sarojni neidu\t\t\tD.Mother teresa");
                for (int clr = 1; clr <= 23; clr++) {
                    System.out.println("");
                }
                System.out.print(">>>>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<<<\nAns:-");
                String prac = m.next();
                switch (prac) {
                    case "a":
                    case "A":
                        System.out.println("You are right ");
                        Thread.sleep(1500);
                        break;
                    case "Exit":
                    case "exit":
                        return;
                    default:
                        System.out.println("you are wrong A.RabinderNath Tagore");
                        Thread.sleep(1500);
                }


            } else if (perm % 3 == 2) {
                System.out.println("Who is the first Asian winner of nobel prize ?");
                System.out.println("A.Rajiv Gandi\t\t\tB.Mother teresa\n");
                System.out.println("C. C.V raman\t\t\tD.Rabindernath Tagore");
                for (int clr = 1; clr <= 23; clr++) {
                    System.out.println("");
                }
                System.out.print(">>>>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<<<\nAns:-");
                String prac = m.next();
                switch (prac) {
                    case "c":
                    case "C":
                        System.out.println("You are right");
                        Thread.sleep(1500);
                        break;
                    case "Exit":
                    case "exit":
                        return;
                    default:
                        System.out.println("you are wrong C. C.V Raman is right");
                        Thread.sleep(1500);
                }

            }


            //88--------------------------------------------------------------------------------------------------------------------------------------------------
            //88--------------------------------------------------------------------------------------------------------------------------------------------------
            for (int clr = 1; clr <= 25; clr++) {
                System.out.println("");
            }
            System.out.println("\t\t\t\t\t\t##################Practise zone######################\n\n");

            perm = System.currentTimeMillis();
            if (perm % 3 == 0) {
                System.out.println("Which city is known as Big Apple");
                System.out.println("A.Tokoyo\t\t\tB.London\n");
                System.out.println("C.New York\t\t\tD.Banglore");
                for (int clr = 1; clr <= 23; clr++) {
                    System.out.println("");
                }
                System.out.print(">>>>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<<<\nAns:-");
                String prac = m.next();
                switch (prac) {
                    case "c":
                    case "C":
                        System.out.println("You are right");
                        Thread.sleep(1500);
                        break;
                    case "Exit":
                    case "exit":
                        return;
                    default:
                        System.out.println("you are wrong C.New York is right");
                        Thread.sleep(1500);
                }


            } else if (perm % 3 == 1) {
                System.out.println("which is the Largest Airport in the world ?");
                System.out.println("A.Dubbai International Airport\t\t\tB.King Khalid International\n");
                System.out.println("C.Sarojni neidu\t\t\tD.Mother teresa");
                for (int clr = 1; clr <= 23; clr++) {
                    System.out.println("");
                }
                System.out.print(">>>>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<<<\nAns:-");
                String prac = m.next();
                switch (prac) {
                    case "b":
                    case "B":
                        System.out.println("You are right ");
                        Thread.sleep(1500);
                        break;
                    case "Exit":
                    case "exit":
                        return;
                    default:
                        System.out.println("you are wrong A.RabinderNath Tagore");
                        Thread.sleep(1500);
                }


            } else if (perm % 3 == 2) {
                System.out.println("Who is the first Asian winner of nobel prize ?");
                System.out.println("A.Rajiv Gandi\t\t\tB.Mother teresa\n");
                System.out.println("C. C.V raman\t\t\tD.Rabindernath Tagore");
                for (int clr = 1; clr <= 23; clr++) {
                    System.out.println("");
                }
                System.out.print(">>>>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<<<\nAns:-");
                String prac = m.next();
                switch (prac) {
                    case "c":
                    case "C":
                        System.out.println("You are right");
                        Thread.sleep(1500);
                        break;
                    case "Exit":
                    case "exit":
                        return;
                    default:
                        System.out.println("you are wrong C. C.V Raman is right");
                        Thread.sleep(1500);
                }
            }
            //99--------------------------------------------------------------------------------------------------------------------------------------------------
            //99--------------------------------------------------------------------------------------------------------------------------------------------------
            for (int clr = 1; clr <= 25; clr++) {
                System.out.println("");
            }
            System.out.println("\t\t\t\t\t\t##################Practise zone######################\n\n");

            perm = System.currentTimeMillis();
            if (perm % 3 == 0) {
                System.out.println("How many languages and dialects are spoken by people all over the world? ");
                System.out.println("A. 6,000\t\t\tB. 9,000\n");
                System.out.println("C. 4,000\t\t\tD. 1,000 ");
                for (int clr = 1; clr <= 23; clr++) {
                    System.out.println("");
                }
                System.out.print(">>>>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<<<\nAns:-");
                String prac = m.next();
                switch (prac) {
                    case "b":
                    case "B":
                        System.out.println("You are right");
                        Thread.sleep(1500);
                        break;
                    case "Exit":
                    case "exit":
                        return;
                    default:
                        System.out.println("you are wrong B. 9000 is right");
                        Thread.sleep(1500);
                }


            } else if (perm % 3 == 1) {
                System.out.println("Approximately, how many people speak Chinese language? ");
                System.out.println("A. 1 billion\t\t\tB. 1 million\n");
                System.out.println("C. 1 lakh   \t\t\tD. 1 thousand");
                for (int clr = 1; clr <= 23; clr++) {
                    System.out.println("");
                }
                System.out.print(">>>>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<<<\nAns:-");
                String prac = m.next();
                switch (prac) {
                    case "a":
                    case "A":
                        System.out.println("You are right ");
                        Thread.sleep(1500);
                        break;
                    case "Exit":
                    case "exit":
                        return;
                    default:
                        System.out.println("you are wrong A.1 Billion is true");
                        Thread.sleep(1500);
                }


            } else if (perm % 3 == 2) {
                System.out.println("The language with the richest vocabulary is: ");
                System.out.println("A. Hindi  \t\t\tB. French \n");
                System.out.println("C. English\t\t\tD. German");
                for (int clr = 1; clr <= 23; clr++) {
                    System.out.println("");
                }
                System.out.print(">>>>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<<<\nAns:-");
                String prac = m.next();
                switch (prac) {
                    case "c":
                    case "C":
                        System.out.println("You are right");
                        Thread.sleep(1500);
                        break;
                    case "Exit":
                    case "exit":
                        return;
                    default:
                        System.out.println("you are wrong C. English is right");
                        Thread.sleep(1500);
                }

            }
            //10--------------------------------------------------------------------------------------------------------------------------------------------------
            //10--------------------------------------------------------------------------------------------------------------------------------------------------
            for (int clr = 1; clr <= 25; clr++) {
                System.out.println("");
            }
            System.out.println("\t\t\t\t\t\t##################Practise zone######################\n\n");

            perm = System.currentTimeMillis();
            if (perm % 3 == 0) {
                System.out.println("Which book has been printed in the maximum number of languages and these scripts");
                System.out.println("A. The Bible\t\t\tB. Hiraka Sutra\n");
                System.out.println("C. The Super Book\t\t\tGuliver Travel");
                for (int clr = 1; clr <= 23; clr++) {
                    System.out.println("");
                }
                System.out.print(">>>>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<<<\nAns:-");
                String prac = m.next();
                switch (prac) {
                    case "a":
                    case "A":
                        System.out.println("You are right");
                        Thread.sleep(1500);
                        break;
                    case "Exit":
                    case "exit":
                        return;
                    default:
                        System.out.println("you are wrong A.The Bible is true");
                        Thread.sleep(1500);
                }


            } else if (perm % 3 == 1) {
                System.out.println("The only religious book ever printed in a shorthand scripts is ");
                System.out.println("A. The Ramayana\t\t\tB. The Mahabharata\n");
                System.out.println("C. The bible   \t\t\tD. Guru Granth Sahib ");
                for (int clr = 1; clr <= 23; clr++) {
                    System.out.println("");
                }
                System.out.print(">>>>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<<<\nAns:-");
                String prac = m.next();
                switch (prac) {
                    case "c":
                    case "C":
                        System.out.println("You are right ");
                        Thread.sleep(1500);
                        break;
                    case "Exit":
                    case "exit":
                        return;
                    default:
                        System.out.println("you are wrong C.The Bible is true");
                        Thread.sleep(1500);
                }


            } else if (perm % 3 == 2) {
                System.out.println("The oldest printed work in the world, which dates back to AD 868 is:");
                System.out.println("A. The Bible   \t\t\tB. The Hirake Sutra\n");
                System.out.println("C. The Ramayana\t\t\tD. The Mahabharata   ");
                for (int clr = 1; clr <= 23; clr++) {
                    System.out.println("");
                }
                System.out.print(">>>>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<<<\nAns:-");
                String prac = m.next();
                switch (prac) {
                    case "b":
                    case "B":
                        System.out.println("You are right");
                        Thread.sleep(1500);
                        break;
                    case "Exit":
                    case "exit":
                        return;
                    default:
                        System.out.println("you are wrong B.The Hirake Sutra is right");
                        Thread.sleep(1500);
                }

            }


        }


    }
}
