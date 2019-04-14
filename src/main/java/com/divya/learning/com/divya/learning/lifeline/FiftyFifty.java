package com.divya.learning.com.divya.learning.lifeline;

public class FiftyFifty {
    public void fiftyFiftyHelp(int options){
        switch (options){
            case 1:
                System.out.println("Fifty fifty");
                System.out.println("You Answer may be :-");
                System.out.println("A.     ");
                System.out.println("\t\tC.");
                for (int move = 1; move <= 27; move++) {
                    System.out.println("");
                }
                break;
            case 2:
                System.out.println("Fifty fifty");
                System.out.println("You Answer may be :-");
                System.out.println("\t\tB.");
                System.out.println("C.");
                for (int move = 1; move <= 27; move++) {
                    System.out.println("");
                }
                break;
            case 4:
                System.out.println("Fifty fifty");
                System.out.println("You Answer may be :-");
                System.out.println("A.     ");
                System.out.println("\t\tC.");
                for (int move = 1; move <= 27; move++) {
                    System.out.println("");
                }
                break;
            default:
                System.out.println("Fifty fifty");
                System.out.println("You Answer may be :-");
                System.out.println("\t\tB.     ");
                System.out.println("C.");
                for (int move = 1; move <= 26; move++) {
                    System.out.println();
                }
                break;
        }
    }
}
