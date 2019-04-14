package com.divya.learning;

public class Helper {
    void checkTimeOut(long first) throws InterruptedException{
        long second = System.currentTimeMillis();
        long timer = second - first;
        if (timer > 31000) {
            System.out.println("Sorry you are too late. You have 30 Seconds to give answer");
            Thread.sleep(1500);

            System.exit(1);
        }
    }

    void lifeLineOptions(){
        System.out.print("------------------------------------------------------");
        System.out.print("\n|\t\t    Lifeline\t\t\t     |\n");
        System.out.println("------------------------------------------------------");
        System.out.println("1.Audience poll \t\t2.Phone a friend");
        System.out.println("3.Fifty fifty   \t\t4.Flip The question");
        System.out.println("5.Power paplu   \t\t6.Ask an expert");
        System.out.println("7.Double Dip");
        spacing();
    }

    public void lifelineAlreadyUsed(int i, LifeLine lifeline){
        System.out.println("You have already used this lifeline");
        lifeline.lifeline(i);
    }

    public void spacing(){
        for (int space = 1; space <= 23; space++) {
            System.out.println("");
        }
    }
}
