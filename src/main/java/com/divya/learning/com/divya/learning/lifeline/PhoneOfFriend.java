package com.divya.learning.com.divya.learning.lifeline;

import java.util.Scanner;

public class PhoneOfFriend {

    private void init(){
        System.out.println("Choose any friend to call for help");
        System.out.println(" _________          _________            _________         _________  ");
        System.out.println("|         |\\       |         |\\         |         |\\      |         |\\");
        System.out.println("| RAM     | |      |  RAHIM  | |        |  RAJAN  | |     |  ROHIT  | |");
        System.out.println("|_________| |      |_________| |        |_________| |     |_________| |");
        System.out.println(" \\|________\\|      \\|_________\\|        \\|_________\\|     \\|_________\\|");
        System.out.println("Enter any one name for calling");
        for (int space = 1; space <= 24; space++) {
            System.out.println("");
        }
    }

    public void phoneOfFriendHelp(int options, Scanner m) throws InterruptedException{
                init();
                String call = m.next();
                switch (call) {

                    case "Ram":
                    case "RAM":
                    case "ram":
                    case "Rahim":
                    case "rahim":
                    case "RAHIM":
                    case "Rajan":
                    case "rajan":
                    case "RAJAN":
                    case "Rohit":
                    case "rohit":
                    case "ROHIT":

                        System.out.print("Call is Diverting to " + call);

                        for(int i=1; i<10; i++){
                            Thread.sleep(1000);
                            System.out.print(".");
                        }
                        System.out.println("Hello");
                        String as = m.next();

                        System.out.println("Enter your question");
                        String a = m.next();
                        System.out.println("give me option");
                        String asa = m.next();
                        switch (options){
                            case 1:
                                System.out.println("I think A is True");
                                break;
                            case 2:
                                System.out.println("I think B is True");
                                break;
                            case 3:
                                System.out.println("I think C is True");
                                break;
                            default:
                                System.out.println("I think D is True");
                                break;
                        }
                        break;

                }
        }

    }
