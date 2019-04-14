package com.divya.learning.com.divya.learning.lifeline;

public class AskExperts {
    public void askExportsHelp(int option) throws InterruptedException{
                System.out.println("Ask an Expert");
                System.out.println("our today expert is Rohit joshi");
                System.out.print("Redirecting to Rohit joshi");
                Thread.sleep(1000);
                System.out.print(".");
                Thread.sleep(1000);
                System.out.print(".");
                Thread.sleep(1000);
                System.out.print(".");
                Thread.sleep(1000);
                System.out.print(".");
                Thread.sleep(1000);
                System.out.print(".");
                switch (option){
                    case 1:
                        System.out.println("I think A is right");
                        break;
                    case 2:
                        System.out.println("I think B is right");
                        break;
                    case 3:
                        System.out.println("I think C is right");
                        break;
                    default:
                        System.out.println("I think D is right");
                        break;
                }
        }
    }
