package com.divya.learning;

import java.util.Scanner;

public class FastestFingerQuestion {
    void question(int option, Scanner m) {
        String ffq;

        switch (option){
            case 1:
                System.out.println("Arrange these words in the correct order to form a Hindi Proverb–");
                System.out.println("A Dum                            B Karna \n");
                System.out.println("C Naak                           D Mein    ");

                System.out.print(">>>>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<<<\nAns:-");
                ffq = m.next();
                switch (ffq) {
                    case "CDAB":
                    case "cdab":
                        break;
                    default:
                        System.out.println("Wrong option selected");
                        System.exit(1);
                }
                break;
            case 2:
                System.out.println("Arrange these words in the correct order to form the slogan of the Pulse Polio campaign in India ?");
                System.out.println("(A) Zindagi                       (B) Do  \n");
                System.out.println("(C) Boond                         (D) Ki    ");

                System.out.print(">>>>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<<<\nAns:-");
                ffq = m.next();
                switch (ffq) {
                    case "bcad":
                    case "BCAD":
                        break;
                    default:
                        System.out.println("Wrong option selected");
                        System.exit(1);
                }
                break;
            default:
                System.out.println("Starting with the earliest, arrange the following events in Narendra Modi’s life in chronological order.");
                System.out.println("(A) CM of Gujarat                 (B) Took oath as PM \n");
                System.out.println("(C) Joined BJP                    (D) Became RSS Pracharak    ");

                System.out.print(">>>>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<<<\nAns:-");
                ffq = m.next();
                switch (ffq) {
                    case "DCAB":
                    case "dcab":
                        break;
                    default:
                        System.out.println("Wrong option selected");
                        System.exit(1);
                }
                break;
        }
    }
}
