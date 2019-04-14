package com.divya.learning.com.divya.learning.lifeline;

public class FlipQuestion {
    public void flipQuestionHelp(int options){
        switch (options){
            case 1:
                System.out.println("Flip the Question");
                System.out.println("According to the Mahabharata, who made Gandiva, the famous bow of Arjuna?");
                System.out.println("(A) Brahma                            (B) Indra ");
                System.out.println("(C) Chandra                           (D) Prajapati");
                for (int clr = 1; clr <= 25; clr++) {
                    System.out.println("");
                }

                System.out.print(">>>>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<<<\nAns:-");

                break;
            case 2:
                System.out.println("Flip the Question");
                System.out.println("In Cricket, “round the wicket” and “over the wicket” represent what ?");
                System.out.println("(A) Wicket-keeping                    (B) Bowling ");
                System.out.println("(C) Batting                           (D) Commentary");
                for (int clr = 1; clr <= 25; clr++) {
                    System.out.println("");
                }

                System.out.print(">>>>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<<<\nAns:-");
                break;
            case 3:
                System.out.println("Flip the Question");
                System.out.println("Which of these Indian cricketers made his Test Debut in 2012?");
                System.out.println("(A) Abhinav Mukund                    (B) Ajankia Rahane ");
                System.out.println("(C) Ravindra Jadeja                   (D) Rohit Sharma");
                for (int clr = 1; clr <= 25; clr++) {
                    System.out.println("");
                }

                System.out.print(">>>>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<<<\nAns:-");
                break;
            case 4:
                System.out.println("Flip the Question");
                System.out.println("Which of the only planet of our Solar System that rotates in a clockwise direction around its own axis?");
                System.out.println("(A) Earth                             (B) Jupiter ");
                System.out.println("(C) Mars                              (D) Venus");
                for (int clr = 1; clr <= 25; clr++) {
                    System.out.println("");
                }

                System.out.print(">>>>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<<<\nAns:-");
                break;
            default:
                break;
        }
    }
}
