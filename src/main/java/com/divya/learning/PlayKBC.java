package com.divya.learning;

import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

class PlayKBC {

    private String sname;
    private int age;
    private LifeLine lifeLine;
    private Helper helper;

    PlayKBC() {
        this.lifeLine = new LifeLine();
        this.helper = new Helper();
    }

    void play(Statement statement, Scanner m) throws InterruptedException, SQLException{

        System.out.println("\nTo Register for the game full fill the requirement");
        System.out.println("\nEnter your name:-");
        sname = m.next();

        System.out.println("Enter your Age:-");
        age = m.nextInt();
        int rs = statement.executeUpdate("insert into score(name,age) values('" + sname + "'," + age + ");");
        int sc = statement.executeUpdate("update score set score=0 where name like '" + sname + "' && age=" + age + ";");


        System.out.println("Hello " + sname + " welcome to K.B.C");

        System.out.print("Game loading!!  ");
        for(int i=1; i<10;i++){
            System.out.print("* * * * * * * * * ");
            Thread.sleep(1000);
        }
        System.out.println("Done!!!");

        if (age < 100) {
            System.out.println("\n\n\n\n\t\t\t" + Constant.FAST_FINGER_QUESTION);
            long fq = System.currentTimeMillis();
            int option = (int)fq % 3 ;

            FastestFingerQuestion fastestFingerQuestion = new FastestFingerQuestion();
            fastestFingerQuestion.question(option, m);

            move:
            {
                long change = System.currentTimeMillis();
                if (change % 2 == 0) {
                    System.out.println("\t\t\t\t\t\t _____________________________");
                    System.out.println("\t\t\t\t\t\t|your Question for Rs 5000 is |");
                    System.out.println("Which of the following name means “Person of long age “?                               \t\t|-----------Lifeline------------|");
                    System.out.println("(A) Abhitabh                  (B) Arunodaya                                           \t\t| Type lifeline                 |");
                    System.out.println("                                                                                      \t\t|-------------------------------|");
                    System.out.println("(C) Abhishek                  (D) Ayushmaan");
                } else {
                    System.out.println("\t\t\t\t\t\t _____________________________");
                    System.out.println("\t\t\t\t\t\t|your Question for Rs 5000 is |");
                    System.out.println("In the game of ludo the discs or tokens are of how many colours? “?                    \t\t|-----------Lifeline------------|");
                    System.out.println("(A) Three                           (B) Two                                            \t\t| Type lifeline                 |");
                    System.out.println("                                                                                       \t\t|-------------------------------|");
                    System.out.println("(c) One                             (D) Four");

                }

                System.out.print(">>>>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<<<\nAns:-");
                long first = System.currentTimeMillis();
                String sss = m.next();
                helper.checkTimeOut(first);
                switch (sss) {
                    case "d":
                    case "D":

                        System.out.println("yes you are right you won Rs.5,000");
                        Thread.sleep(1600);
                        System.out.println("\nYour next question for Rs.10,000");
                        Thread.sleep(2000);
                        for (int asd = 1; asd <= 1000; asd++) {
                            System.out.println("\b");
                        }
                        break move;
                    case "LIFELINE":
                    case "Lifeline":
                    case "lifeline":
                        for (int asd = 1; asd <= 1000; asd++) {
                            System.out.println("\b");
                        }
                        lifeLine.lifeline(4);
                        System.out.print(">>>>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<<<\nAns:-");
                        first = System.currentTimeMillis();
                        sss = m.next();
                        helper.checkTimeOut(first);

                        switch (sss) {
                            case "d":
                            case "D":

                                System.out.println("yes you are right you won Rs.5,000");
                                Thread.sleep(1600);
                                System.out.println("\nYour next question for Rs.10,000");
                                Thread.sleep(2000);
                                for (int asd = 1; asd <= 1000; asd++) {
                                    System.out.println("\b");
                                }
                                break move;
                            case "LIFELINE":
                            case "Lifeline":
                            case "lifeline":
                                for (int asd = 1; asd <= 1000; asd++) {
                                    System.out.println("\b");
                                }
                                lifeLine.lifeline(4);
                                System.out.print(">>>>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<<<\nAns:-");
                                first = System.currentTimeMillis();
                                sss = m.next();
                                helper.checkTimeOut(first);

                                switch (sss) {
                                    case "d":
                                    case "D":


                                        System.out.println("yes you are right you won Rs.5,000");
                                        Thread.sleep(1600);
                                        System.out.println("\nYour next question for Rs.10,000");
                                        Thread.sleep(2000);
                                        for (int asd = 1; asd <= 1000; asd++) {
                                            System.out.println("\b");
                                        }
                                        break move;
                                    default:
                                        System.out.println("Sorry You are wrong today you won Nothing");
                                        return;
                                }
                            default:
                                System.out.println("Sorry You are wrong today you won Nothing");
                                return;
                        }
                    default:
                        System.out.println("Sorry You are wrong today you won Nothing");
                        return;
                }


            }

            move1:
            {
                long change = System.currentTimeMillis();
                if (change % 2 == 1) {
                    System.out.println("\t\t\t\t\t\t _____________________________");
                    System.out.println("\t\t\t\t\t\t|your Question for Rs 10,000 is |");
                    System.out.println("How is the call of a chicken usually expressed?                                       \t\t|-----------Lifeline------------|");
                    System.out.println("(A) Denchu Dencu             (B) Kukro Koo                                            \t\t|Type lifeline\t\t\t|");
                    System.out.println("                                                                                      \t\t|-------------------------------|");
                    System.out.println("(C) Peehu Peehu              (D) Guta Goo");
                } else {
                    System.out.println("\t\t\t\t\t\t _____________________________");
                    System.out.println("\t\t\t\t\t\t|your Question for Rs 10,000 is |");
                    System.out.println("How many rings are there in an Olympic Flag?                                          \t\t|-----------Lifeline------------|");
                    System.out.println("(A) 2              (B) 5                                                              \t\t|Type lifeline\t\t\t|");
                    System.out.println("                                                                                      \t\t|-------------------------------|");
                    System.out.println("(C) 3              (D) 4");
                }

                for (int clr = 1; clr <= 25; clr++) {
                    System.out.println("");
                }

                System.out.print(">>>>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<<<\nAns:-");
                long first = System.currentTimeMillis();
                String sss = m.next();
                long second = System.currentTimeMillis();
                long timer = second - first;
                if (timer > 31000) {
                    System.out.println("Sorry you are too late. You have 30 Seconds to give answer");
                    Thread.sleep(1500);

                    return;
                }
                switch (sss) {
                    case "b":
                    case "B":


                        System.out.println("yes you are right you won Rs.10,000");
                        Thread.sleep(1600);
                        System.out.println("\nYour next question for Rs.20,000");
                        Thread.sleep(2000);
                        for (int asd = 1; asd <= 1000; asd++) {
                            System.out.println("\b");
                        }
                        break move1;
                    case "LIFELINE":
                    case "Lifeline":
                    case "lifeline":
                        for (int asd = 1; asd <= 1000; asd++) {
                            System.out.println("\b");
                        }
                        System.out.print(">>>>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<<<\nAns:-");
                        lifeLine.lifeline(2);
                        first = System.currentTimeMillis();
                        sss = m.next();
                        helper.checkTimeOut(first);
                        switch (sss) {
                            case "b":
                            case "B":

                                System.out.println("yes you are right you won Rs.10,000");
                                Thread.sleep(1600);
                                System.out.println("\nYour next question for Rs.20,000");
                                Thread.sleep(2000);
                                for (int asd = 1; asd <= 1000; asd++) {
                                    System.out.println("\b");
                                }
                                break move1;
                            case "LIFELINE":
                            case "Lifeline":
                            case "lifeline":
                                for (int asd = 1; asd <= 100; asd++) {
                                    System.out.println("");
                                }
                                lifeLine.lifeline(2);
                                System.out.print(">>>>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<<<\nAns:-");
                                first = System.currentTimeMillis();
                                sss = m.next();
                                second = System.currentTimeMillis();
                                timer = second - first + timer;
                                if (timer > 31000) {
                                    System.out.println("Sorry you are too late. You have 30 Seconds to give answer");
                                    return;
                                }
                                switch (sss) {
                                    case "b":
                                    case "B":

                                        System.out.println("yes you are right you won Rs.10,000");
                                        Thread.sleep(1600);
                                        System.out.println("\nYour next question for Rs.20,000");
                                        Thread.sleep(2000);
                                        for (int asd = 1; asd <= 1000; asd++) {
                                            System.out.println("\b");
                                        }
                                        break move1;
                                    default:
                                        System.out.println("Sorry You are wrong today you won nothing");
                                        return;
                                }
                            default:
                                System.out.println("Sorry You are wrong today you won nothing");
                                return;
                        }
                    default:
                        System.out.println("Sorry You are wrong today you won nothing");
                        return;
                }
            }


            //********************************************************************************************************************************************
            //********************************************************************************************************************************************

            move2:
            {
                long change = System.currentTimeMillis();
                if (change % 2 == 1) {
                    System.out.println("\t\t\t\t\t\t _____________________________");
                    System.out.println("\t\t\t\t\t\t|your Question for Rs 20,000 is |");
                    System.out.println("Seeds of which of these flowers are used to produce a edible oil ?                    \t\t|-----------Lifeline------------|");
                    System.out.println("(A) Genda                            (B) Guldaudi                                     \t\t|Type lifeline\t\t\t|");
                    System.out.println("                                                                                      \t\t|-------------------------------|");
                    System.out.println("(C) Arhul                            (D) Surajmukhi");
                } else {
                    System.out.println("\t\t\t\t\t\t _____________________________");
                    System.out.println("\t\t\t\t\t\t|your Question for Rs 20,000 is |");
                    System.out.println("In which commonwealth games did flying Sikh Milkha Singh win the first gold medal for India?   \t\t|-----------Lifeline------------|");
                    System.out.println("(A) 1934. London                     (B) 1938. Sidney                                          \t\t|Type lifeline\t\t\t|");
                    System.out.println("                                                                                               \t\t|-------------------------------|");
                    System.out.println("(C) 1950. Auckland                   (D) 1958. Cardiff ");

                }

                for (int clr = 1; clr <= 25; clr++) {
                    System.out.println("");
                }

                System.out.print(">>>>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<<<\nAns:-");
                long first = System.currentTimeMillis();
                String sss = m.next();
                long second = System.currentTimeMillis();
                long timer = second - first;
                if (timer > 31000) {
                    System.out.println("Sorry you are too late. You have 30 Seconds to give answer");
                    Thread.sleep(1500);

                    return;
                }
                switch (sss) {
                    case "d":
                    case "D":

                        System.out.println("yes you are right you won Rs.20,000");
                        Thread.sleep(1600);
                        System.out.println("\nYour next question for Rs.40,000");
                        Thread.sleep(2000);
                        for (int asd = 1; asd <= 1000; asd++) {
                            System.out.println("\b");
                        }
                        break move2;
                    case "LIFELINE":
                    case "Lifeline":
                    case "lifeline":
                        for (int asd = 1; asd <= 1000; asd++) {
                            System.out.println("\b");
                        }
                        lifeLine.lifeline(4);
                        System.out.print(">>>>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<<<\nAns:-");
                        first = System.currentTimeMillis();
                        sss = m.next();
                        helper.checkTimeOut(first);
                        switch (sss) {
                            case "d":
                            case "D":

                                System.out.println("yes you are right you won Rs.20,000");
                                Thread.sleep(1600);
                                System.out.println("\nYour next question for Rs.40,000");
                                Thread.sleep(2000);
                                for (int asd = 1; asd <= 1000; asd++) {
                                    System.out.println("\b");
                                }
                                break move2;
                            case "LIFELINE":
                            case "Lifeline":
                            case "lifeline":
                                for (int asd = 1; asd <= 1000; asd++) {
                                    System.out.println("\b");
                                }
                                lifeLine.lifeline(4);
                                System.out.print(">>>>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<<<\nAns:-");
                                first = System.currentTimeMillis();
                                sss = m.next();
                                second = System.currentTimeMillis();
                                timer = second - first + timer;
                                if (timer > 31000) {
                                    System.out.println("Sorry you are too late. You have 30 Seconds to give answer");
                                    return;
                                }
                                switch (sss) {
                                    case "d":
                                    case "D":

                                        System.out.println("yes you are right you won Rs.20,000");
                                        Thread.sleep(1600);
                                        System.out.println("\nYour next question for Rs.40,000");
                                        Thread.sleep(2000);
                                        for (int asd = 1; asd <= 1000; asd++) {
                                            System.out.println("\b");
                                        }
                                        break move2;
                                    default:
                                        System.out.println("Sorry You are wrong today you won nothing");
                                        return;
                                }
                            default:
                                System.out.println("Sorry You are wrong today you won nothing");
                                return;
                        }
                    default:
                        System.out.println("Sorry You are wrong today you won nothing");
                        return;
                }
            }
            //********************************************************************************************************************************************
            //********************************************************************************************************************************************

            move3:
            {
                long change = System.currentTimeMillis();
                if (change % 2 == 1) {
                    System.out.println("\t\t\t\t\t\t _______________________________");
                    System.out.println("\t\t\t\t\t\t|your Question for Rs 40,000 is |");
                    System.out.println("According to a TV ad, Which duo goes to the tailor and says ,“Masterji, pitaji ki patloon ek bilang chhoti kar do” ?\t\t|-----------Lifeline------------|");
                    System.out.println("(A) Hari – Harish                             (B) Ramesh – Suresh                                                   \t\t|Type lifeline\t\t\t|");
                    System.out.println("                                                                                                                    \t\t|-------------------------------|");
                    System.out.println("(C) Santa – Banta                             (D) Ajay – Vijay");
                } else {
                    System.out.println("\t\t\t\t\t\t _______________________________");
                    System.out.println("\t\t\t\t\t\t|your Question for Rs 40,000 is |");
                    System.out.println("When and where will Nineteenth Commonwealth games be held ?                     \t\t|-----------Lifeline------------|");
                    System.out.println("(A)2010 Melbourne                    (B) 2010 New Delhi                         \t\t|Type lifeline\t\t\t|");
                    System.out.println("                                                                                \t\t|-------------------------------|");
                    System.out.println("(C) 2010 Canada                      (D) 2010 Pakistan ");
                }
                for (int clr = 1; clr <= 25; clr++) {
                    System.out.println("");
                }

                System.out.print(">>>>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<<<\nAns:-");
                long first = System.currentTimeMillis();
                String sss = m.next();
                long second = System.currentTimeMillis();
                long timer = second - first;
                if (timer > 31000) {
                    System.out.println("Sorry you are too late. You have 30 Seconds to give answer");
                    Thread.sleep(1500);

                    return;
                }
                switch (sss) {
                    case "b":
                    case "B":
                        int sc1 = statement.executeUpdate("update score set score=80000 where name like '" + sname + "' && age=" + age + ";");
                        System.out.println("yes you are right you won Rs.40,000");
                        Thread.sleep(1600);
                        System.out.println("\nYour next question for Rs.80,000");
                        Thread.sleep(2000);
                        for (int asd = 1; asd <= 1000; asd++) {
                            System.out.println("\b");
                        }
                        break move3;
                    case "LIFELINE":
                    case "Lifeline":
                    case "lifeline":
                        for (int asd = 1; asd <= 1000; asd++) {
                            System.out.println("\b");
                        }
                        lifeLine.lifeline(2);
                        System.out.print(">>>>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<<<\nAns:-");
                        first = System.currentTimeMillis();
                        sss = m.next();
                        helper.checkTimeOut(first);
                        switch (sss) {
                            case "b":
                            case "B":

                                sc1 = statement.executeUpdate("update score set score=40000 where name like '" + sname + "' && age=" + age + ";");
                                System.out.println("yes you are right you won Rs.40,000");
                                Thread.sleep(1600);
                                System.out.println("\nYour next question for Rs.80,000");
                                Thread.sleep(2000);
                                for (int asd = 1; asd <= 1000; asd++) {
                                    System.out.println("\b");
                                }
                                break move3;
                            case "LIFELINE":
                            case "Lifeline":
                            case "lifeline":
                                for (int asd = 1; asd <= 1000; asd++) {
                                    System.out.println("\b");
                                }
                                lifeLine.lifeline(2);
                                System.out.print(">>>>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<<<\nAns:-");
                                first = System.currentTimeMillis();
                                sss = m.next();
                                second = System.currentTimeMillis();
                                timer = second - first + timer;
                                if (timer > 31000) {
                                    System.out.println("Sorry you are too late. You have 30 Seconds to give answer");
                                    return;
                                }
                                switch (sss) {
                                    case "b":
                                    case "B":
                                        sc1 = statement.executeUpdate("update score set score=40000 where name like '" + sname + "' && age=" + age + ";");
                                        System.out.println("yes you are right you won Rs.40,000");
                                        Thread.sleep(1600);
                                        System.out.println("\nYour next question for Rs.80,000");
                                        Thread.sleep(2000);
                                        for (int asd = 1; asd <= 1000; asd++) {
                                            System.out.println("\b");
                                        }
                                        break move3;
                                    default:
                                        System.out.println("Sorry You are wrong today you won nothing");
                                        return;
                                }
                            default:
                                System.out.println("Sorry You are wrong today you won nothing");
                                return;
                        }
                    default:
                        System.out.println("Sorry You are wrong today you won nothing");
                        return;
                }
            }
            //********************************************************************************************************************************************
            //********************************************************************************************************************************************

            move4:
            {
                long change = System.currentTimeMillis();

                if (change % 2 == 1) {
                    System.out.println("\t\t\t\t\t\t _____________________________");
                    System.out.println("\t\t\t\t\t\t|your Question for Rs 80,000 is |");
                    System.out.println("In which sport has Jwala Gutta been a 13-time National Champion?                      \t\t|-----------Lifeline------------|");
                    System.out.println("(A) Badminton                       (B) Chess                                         \t\t|Type lifeline\t\t\t|");
                    System.out.println("                                                                                      \t\t|-------------------------------|");
                    System.out.println("(C) Squash                          (D) Table Tennis");
                } else {
                    System.out.println("\t\t\t\t\t\t _____________________________");
                    System.out.println("\t\t\t\t\t\t|your Question for Rs 80,000 is |");
                    System.out.println("On which date is Nobel Prize awarded?                                                 \t\t|-----------Lifeline------------|");
                    System.out.println("(A) December 10                     (B) January 10                                    \t\t|Type lifeline\t\t\t|");
                    System.out.println("                                                                                      \t\t|-------------------------------|");
                    System.out.println("(C) April 10                        (D) July 10");
                }
                for (int clr = 1; clr <= 25; clr++) {
                    System.out.println("");
                }

                System.out.print(">>>>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<<<\nAns:-");
                long first = System.currentTimeMillis();
                String sss = m.next();
                long second = System.currentTimeMillis();
                long timer = second - first;
                if (timer > 31000) {
                    System.out.println("Sorry you are too late. You have 30 Seconds to give answer");
                    Thread.sleep(1500);

                    return;
                }
                switch (sss) {
                    case "a":
                    case "A":
                        System.out.println("yes you are right you won Rs.80,000");
                        Thread.sleep(1600);
                        System.out.println("\nYour next question for Rs.1,60,000");
                        Thread.sleep(2000);
                        for (int asd = 1; asd <= 1000; asd++) {
                            System.out.println("\b");
                        }
                        break move4;
                    case "LIFELINE":
                    case "Lifeline":
                    case "lifeline":
                        for (int asd = 1; asd <= 1000; asd++) {
                            System.out.println("\b");
                        }
                        lifeLine.lifeline(1);
                        System.out.print(">>>>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<<<\nAns:-");

                        first = System.currentTimeMillis();
                        sss = m.next();
                        helper.checkTimeOut(first);
                        switch (sss) {
                            case "a":
                            case "A":
                                System.out.println("yes you are right you won Rs.80,000");
                                Thread.sleep(1600);
                                System.out.println("\nYour next question for Rs.1,60,000");
                                Thread.sleep(2000);
                                for (int asd = 1; asd <= 1000; asd++) {
                                    System.out.println("\b");
                                }
                                break move4;
                            case "LIFELINE":
                            case "Lifeline":
                            case "lifeline":
                                for (int asd = 1; asd <= 1000; asd++) {
                                    System.out.println("\b");
                                }
                                lifeLine.lifeline(1);
                                System.out.print(">>>>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<<<\nAns:-");
                                first = System.currentTimeMillis();
                                sss = m.next();
                                second = System.currentTimeMillis();
                                timer = second - first + timer;
                                if (timer > 31000) {
                                    System.out.println("Sorry you are too late. You have 30 Seconds to give answer");
                                    return;
                                }
                                switch (sss) {
                                    case "a":
                                    case "A":
                                        System.out.println("yes you are right you won Rs.80,000");
                                        Thread.sleep(1600);
                                        System.out.println("\nYour next question for Rs.1,60,000");
                                        Thread.sleep(2000);
                                        for (int asd = 1; asd <= 1000; asd++) {
                                            System.out.println("\b");
                                        }
                                        break move4;
                                    default:
                                        System.out.println("You are wrong today you won Only 40,000");
                                        return;
                                }
                            default:
                                System.out.println("You are wrong today you won Only 40,000");
                                return;
                        }
                    default:
                        System.out.println("You are wrong today you won Only 40,000");
                        return;
                }
            }
            //********************************************************************************************************************************************
            //********************************************************************************************************************************************

            move5:
            {
                long change = System.currentTimeMillis();
                if (change % 2 == 1) {
                    System.out.println("\t\t\t\t\t\t _________________________________");
                    System.out.println("\t\t\t\t\t\t|your Question for Rs 1,60,000 is |");
                    System.out.println("Which of these organs helps in maintaining the sense of balance or equilibrium of our body\t\t|-----------Lifeline------------|");
                    System.out.println("(A) Nose                                 (B) Ears                                         \t\t|Type lifeline\t\t\t|");
                    System.out.println("                                                                                          \t\t|-------------------------------|");
                    System.out.println("(C) Tongue                               (D) Lungs");
                } else {
                    System.out.println("\t\t\t\t\t\t _________________________________");
                    System.out.println("\t\t\t\t\t\t|your Question for Rs 1,60,000 is |");
                    System.out.println("Who was the Chairman of the Drafting committee of the Constituent of India?               \t\t|-----------Lifeline------------|");
                    System.out.println("(A) Rajaendra Prasad                   (B) B. R. Ambedkar                                 \t\t|Type lifeline\t\t\t|");
                    System.out.println("                                                                                          \t\t|-------------------------------|");
                    System.out.println("(C) Vallabhbhai Prasad                 (D) G. V. Mavalankar");

                }
                for (int clr = 1; clr <= 25; clr++) {
                    System.out.println("");
                }

                System.out.print(">>>>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<<<\nAns:-");
                long first = System.currentTimeMillis();
                String sss = m.next();
                long second = System.currentTimeMillis();
                long timer = second - first;
                if (timer > 31000) {
                    System.out.println("Sorry you are too late. You have 30 Seconds to give answer");
                    Thread.sleep(1500);

                    return;
                }
                switch (sss) {
                    case "b":
                    case "B":
                        System.out.println("yes you are right you won Rs.1,60,000");
                        Thread.sleep(1600);
                        System.out.println("\nYour next question for Rs.3,20,000");
                        Thread.sleep(2000);
                        for (int asd = 1; asd <= 1000; asd++) {
                            System.out.println("\b");
                        }
                        break move5;
                    case "LIFELINE":
                    case "Lifeline":
                    case "lifeline":
                        for (int asd = 1; asd <= 1000; asd++) {
                            System.out.println("\b");
                        }
                        lifeLine.lifeline(2);
                        System.out.print(">>>>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<<<\nAns:-");

                        first = System.currentTimeMillis();
                        sss = m.next();
                        helper.checkTimeOut(first);
                        switch (sss) {
                            case "b":
                            case "B":
                                System.out.println("yes you are right you won Rs.1,60,000");
                                Thread.sleep(1600);
                                System.out.println("\nYour next question for Rs.3,20,000");
                                Thread.sleep(2000);
                                for (int asd = 1; asd <= 1000; asd++) {
                                    System.out.println("\b");
                                }
                                break move5;
                            case "LIFELINE":
                            case "Lifeline":
                            case "lifeline":
                                for (int asd = 1; asd <= 1000; asd++) {
                                    System.out.println("\b");
                                }
                                lifeLine.lifeline(2);
                                first = System.currentTimeMillis();
                                sss = m.next();
                                second = System.currentTimeMillis();
                                timer = second - first + timer;
                                if (timer > 31000) {
                                    System.out.println("Sorry you are too late. You have 30 Seconds to give answer");
                                    return;
                                }
                                switch (sss) {
                                    case "b":
                                    case "B":
                                        System.out.println("yes you are right you won Rs.1,60,000");
                                        Thread.sleep(1600);
                                        System.out.println("\nYour next question for Rs.3,20,000");
                                        Thread.sleep(2000);
                                        for (int asd = 1; asd <= 1000; asd++) {
                                            System.out.println("\b");
                                        }
                                        break move5;
                                    default:
                                        System.out.println("You are wrong today you won Only 40,000");
                                        return;
                                }
                            default:
                                System.out.println("You are wrong today you won Only 40,000");
                                return;
                        }
                    default:
                        System.out.println("You are wrong today you won Only 40,000");
                        return;
                }
            }

            //********************************************************************************************************************************************
            //********************************************************************************************************************************************

            move4:
            {
                long change = System.currentTimeMillis();
                if (change % 2 == 1) {
                    System.out.println("\t\t\t\t\t\t _________________________________");
                    System.out.println("\t\t\t\t\t\t|your Question for Rs 3,20,000 is |");
                    System.out.println("People from which of these professions are most likely to use ‘aari’, ‘basula’ and ‘burma’ at their work?\t\t|-----------Lifeline------------|");
                    System.out.println("(A) Tailor                                      (B) Washerman                                         \t\t|Type lifeline\t\t\t|");
                    System.out.println("                                                                                                      \t\t|-------------------------------|");
                    System.out.println("(C) Carpenter                                   (D) Painter");
                } else {
                    System.out.println("\t\t\t\t\t\t _________________________________");
                    System.out.println("\t\t\t\t\t\t|your Question for Rs 3,20,000 is |");
                    System.out.println("Which Bank is known as Banker of Bank(Provide support to the bank) ?                              \t\t|-----------Lifeline------------|");
                    System.out.println("(A)State bank of india                  (B) Punjab National Bank                                   \t\t|Type lifeline\t\t\t|");
                    System.out.println("                                                                                                  \t\t|-------------------------------|");
                    System.out.println("(C)Reserve Bank of India                (D) ICIC Bank");

                }
                for (int clr = 1; clr <= 25; clr++) {
                    System.out.println("");
                }

                System.out.print(">>>>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<<<\nAns:-");
                long first = System.currentTimeMillis();
                String sss = m.next();
                long second = System.currentTimeMillis();
                long timer = second - first;
                if (timer > 31000) {
                    System.out.println("Sorry you are too late. You have 30 Seconds to give answer");
                    Thread.sleep(1500);

                    return;
                }
                switch (sss) {
                    case "c":
                    case "C":
                        System.out.println("yes you are right you won Rs.3,20,000");
                        Thread.sleep(1600);
                        System.out.println("\nYour next question for Rs.6,40,000");
                        Thread.sleep(2000);
                        for (int asd = 1; asd <= 1000; asd++) {
                            System.out.println("\b");
                        }
                        break move4;
                    case "LIFELINE":
                    case "Lifeline":
                    case "lifeline":
                        for (int asd = 1; asd <= 1000; asd++) {
                            System.out.println("\b");
                        }
                        lifeLine.lifeline(3);
                        first = System.currentTimeMillis();
                        sss = m.next();
                        helper.checkTimeOut(first);
                        switch (sss) {
                            case "c":
                            case "C":
                                System.out.println("yes you are right you won Rs.3,20,000");
                                Thread.sleep(1600);
                                System.out.println("\nYour next question for Rs.6,40,000");
                                Thread.sleep(2000);
                                for (int asd = 1; asd <= 1000; asd++) {
                                    System.out.println("\b");
                                }
                                break move4;
                            case "LIFELINE":
                            case "Lifeline":
                            case "lifeline":
                                for (int asd = 1; asd <= 1000; asd++) {
                                    System.out.println("\b");
                                }
                                lifeLine.lifeline(3);
                                first = System.currentTimeMillis();
                                sss = m.next();
                                second = System.currentTimeMillis();
                                timer = second - first + timer;
                                if (timer > 31000) {
                                    System.out.println("Sorry you are too late. You have 30 Seconds to give answer");
                                    return;
                                }
                                switch (sss) {
                                    case "c":
                                    case "C":
                                        System.out.println("yes you are right you won Rs.3,20,000");
                                        Thread.sleep(1600);
                                        System.out.println("\nYour next question for Rs.6,40,000");
                                        Thread.sleep(2000);
                                        for (int asd = 1; asd <= 1000; asd++) {
                                            System.out.println("\b");
                                        }
                                        break move4;
                                    default:
                                        System.out.println("You are wrong today you won Only 40,000");
                                        return;
                                }
                            default:
                                System.out.println("You are wrong today you won Only 40,000");
                                return;
                        }
                    default:
                        System.out.println("You are wrong today you won Only 40,000");
                        return;
                }
            }
            //********************************************************************************************************************************************
            //********************************************************************************************************************************************

            move4:
            {
                long change = System.currentTimeMillis();
                if (change % 2 == 1) {
                    System.out.println("\t\t\t\t\t\t _________________________________");
                    System.out.println("\t\t\t\t\t\t|your Question for Rs 6,40,000 is |");
                    System.out.println("Which of the following animals do not have external ears?                             \t\t|-----------Lifeline------------|");
                    System.out.println("(A) Cat                               (B) Bat                                         \t\t|Type lifeline\t\t\t|");
                    System.out.println("                                                                                      \t\t|-------------------------------|");
                    System.out.println("(C) Rat                               (D) Snake");
                } else {
                    System.out.println("\t\t\t\t\t\t _________________________________");
                    System.out.println("\t\t\t\t\t\t|your Question for Rs 6,40,000 is |");
                    System.out.println("According to the song from ‘Sholay’, “Koi Haseena Jab Rooth Jaati Hai, Toh Aur Bhi_____________ ” ? \t\t|-----------Lifeline------------|");
                    System.out.println("(A) Rangeen Ho Jaati Hai                    (B) Shareef Ho Jaati Hai                              \t\t|Type lifeline\t\t\t|");
                    System.out.println("                                                                                                  \t\t|-------------------------------|");
                    System.out.println("(C) Namkeen Ho Jaati Hai                    (D) Haseen Ho Jaati Hai");

                }
                for (int clr = 1; clr <= 25; clr++) {
                    System.out.println("");
                }

                System.out.print(">>>>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<<<\nAns:-");
                long first = System.currentTimeMillis();
                String sss = m.next();
                long second = System.currentTimeMillis();
                long timer = second - first;
                if (timer > 31000) {
                    System.out.println("Sorry you are too late. You have 30 Seconds to give answer");
                    Thread.sleep(1500);

                    return;
                }
                switch (sss) {
                    case "d":
                    case "D":
                        int sc2 = statement.executeUpdate("update score set score=640000 where name like '" + sname + "' && age=" + age + ";");
                        System.out.println("yes you are right you won Rs.6,40,000");
                        Thread.sleep(1600);
                        System.out.println("\nYour next question for Rs.12,50,000");
                        Thread.sleep(2000);
                        for (int asd = 1; asd <= 1000; asd++) {
                            System.out.println("\b");
                        }
                        break move4;
                    case "LIFELINE":
                    case "Lifeline":
                    case "lifeline":
                        for (int asd = 1; asd <= 1000; asd++) {
                            System.out.println("\b");
                        }
                        lifeLine.lifeline(4);
                        first = System.currentTimeMillis();
                        sss = m.next();
                        helper.checkTimeOut(first);
                        switch (sss) {
                            case "d":
                            case "D":
                                sc2 = statement.executeUpdate("update score set score=640000 where name like '" + sname + "' && age=" + age + ";");
                                System.out.println("yes you are right you won Rs.6,40,000");
                                Thread.sleep(1600);
                                System.out.println("\nYour next question for Rs.12,50,000");
                                Thread.sleep(2000);
                                for (int asd = 1; asd <= 1000; asd++) {
                                    System.out.println("\b");
                                }
                                break move4;
                            case "LIFELINE":
                            case "Lifeline":
                            case "lifeline":
                                for (int asd = 1; asd <= 1000; asd++) {
                                    System.out.println("\b");
                                }
                                lifeLine.lifeline(4);
                                first = System.currentTimeMillis();
                                sss = m.next();
                                second = System.currentTimeMillis();
                                timer = second - first + timer;
                                if (timer > 31000) {
                                    System.out.println("Sorry you are too late. You have 30 Seconds to give answer");
                                    return;
                                }
                                switch (sss) {
                                    case "d":
                                    case "D":
                                        sc2 = statement.executeUpdate("update score set score=640000 where name like '" + sname + "' && age=" + age + ";");
                                        System.out.println("yes you are right you won Rs.6,40,000");
                                        Thread.sleep(1600);
                                        System.out.println("\nYour next question for Rs.12,50,000");
                                        Thread.sleep(2000);
                                        for (int asd = 1; asd <= 1000; asd++) {
                                            System.out.println("\b");
                                        }
                                        break move4;
                                    default:
                                        System.out.println("You are wrong today you won Only 40,000");
                                        return;
                                }
                            default:
                                System.out.println("You are wrong today you won Only 40,000");
                                return;
                        }
                    default:
                        System.out.println("You are wrong today you won Only 40,000");
                        return;
                }
            }
            //********************************************************************************************************************************************
            //********************************************************************************************************************************************

            move4:
            {
                System.out.println("\t\t\t\t\t\t __________________________________");
                System.out.println("\t\t\t\t\t\t|your Question for Rs 12,50,000 is |");
                System.out.println("Which of these national parks, reserved for tigers, is named after a river?           \t\t|-----------Lifeline------------|");
                System.out.println("(A) Indrawati                         (B) Sunderbans                                  \t\t|Type lifeline\t\t\t|");
                System.out.println("                                                                                      \t\t|-------------------------------|");
                System.out.println("(C) Dudhwa                            (D) Kanha");
                for (int clr = 1; clr <= 25; clr++) {
                    System.out.println("");
                }

                System.out.print(">>>>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<<<\nAns:-");
                long first = System.currentTimeMillis();
                String sss = m.next();
                long second = System.currentTimeMillis();
                long timer = second - first;
                if (timer > 31000) {
                    System.out.println("Sorry you are too late. You have 30 Seconds to give answer");
                    Thread.sleep(1500);

                    return;
                }
                switch (sss) {
                    case "a":
                    case "A":

                        System.out.println("yes you are right you won Rs.12,50,000");
                        Thread.sleep(1600);
                        System.out.println("\nYour next question for Rs.25,00,000");
                        Thread.sleep(2000);
                        for (int asd = 1; asd <= 1000; asd++) {
                            System.out.println("\b");
                        }
                        break move4;
                    case "LIFELINE":
                    case "Lifeline":
                    case "lifeline":
                        for (int asd = 1; asd <= 1000; asd++) {
                            System.out.println("\b");
                        }
                        lifeLine.lifeline(1);
                        first = System.currentTimeMillis();
                        sss = m.next();
                        helper.checkTimeOut(first);
                        switch (sss) {
                            case "a":
                            case "A":

                                System.out.println("yes you are right you won Rs.12,50,000");
                                Thread.sleep(1600);
                                System.out.println("\nYour next question for Rs.25,00,000");
                                Thread.sleep(2000);
                                for (int asd = 1; asd <= 1000; asd++) {
                                    System.out.println("\b");
                                }
                                break move4;
                            case "LIFELINE":
                            case "Lifeline":
                            case "lifeline":
                                for (int asd = 1; asd <= 1000; asd++) {
                                    System.out.println("\b");
                                }
                                lifeLine.lifeline(1);
                                first = System.currentTimeMillis();
                                sss = m.next();
                                second = System.currentTimeMillis();
                                timer = second - first + timer;
                                if (timer > 31000) {
                                    System.out.println("Sorry you are too late. You have 30 Seconds to give answer");
                                    return;
                                }
                                switch (sss) {
                                    case "a":
                                    case "A":

                                        System.out.println("yes you are right you won Rs.12,50,000");
                                        Thread.sleep(1600);
                                        System.out.println("\nYour next question for Rs.25,00,000");
                                        Thread.sleep(2000);
                                        for (int asd = 1; asd <= 1000; asd++) {
                                            System.out.println("\b");
                                        }
                                        break move4;
                                    default:
                                        System.out.println("You are wrong today you won Only Rs.6,40,000/-");
                                        return;
                                }
                            default:
                                System.out.println("You are wrong today you won Only 6,40,000/-");
                                return;
                        }
                    default:
                        System.out.println("You are wrong today you won Only 6,40,000/-");
                        return;
                }
            }
            //********************************************************************************************************************************************
            //********************************************************************************************************************************************

            move4:
            {
                System.out.println("\t\t\t\t\t\t __________________________________");
                System.out.println("\t\t\t\t\t\t|your Question for Rs 25,00,000 is |");
                System.out.println("Who was the Chairman of the Drafting committee of the Constituent of India?           \t\t|-----------Lifeline------------|");
                System.out.println("(A) Rajaendra Prasad                  (B) B. R. Ambedkar                              \t\t|Type lifeline\t\t\t|");
                System.out.println("                                                                                      \t\t|-------------------------------|");
                System.out.println("(C) Vallabhbhai Prasad                (D) G. V. Mavalankar");
                for (int clr = 1; clr <= 25; clr++) {
                    System.out.println("");
                }

                System.out.print(">>>>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<<<\nAns:-");
                long first = System.currentTimeMillis();
                String sss = m.next();
                long second = System.currentTimeMillis();
                long timer = second - first;
                if (timer > 31000) {
                    System.out.println("Sorry you are too late. You have 30 Seconds to give answer");
                    Thread.sleep(1500);

                    return;
                }
                switch (sss) {
                    case "b":
                    case "B":
                        System.out.println("yes you are right you won Rs.12,50,000");
                        Thread.sleep(1600);
                        System.out.println("\nYour next question for Rs.25,00,000");
                        Thread.sleep(2000);
                        for (int asd = 1; asd <= 1000; asd++) {
                            System.out.println("\b");
                        }
                        break move4;
                    case "LIFELINE":
                    case "Lifeline":
                    case "lifeline":
                        for (int asd = 1; asd <= 1000; asd++) {
                            System.out.println("\b");
                        }
                        lifeLine.lifeline(2);
                        first = System.currentTimeMillis();
                        sss = m.next();
                        helper.checkTimeOut(first);
                        switch (sss) {
                            case "b":
                            case "B":
                                System.out.println("yes you are right you won Rs.12,50,000");
                                Thread.sleep(1600);
                                System.out.println("\nYour next question for Rs.25,00,000");
                                Thread.sleep(2000);
                                for (int asd = 1; asd <= 1000; asd++) {
                                    System.out.println("\b");
                                }
                                break move4;
                            case "LIFELINE":
                            case "Lifeline":
                            case "lifeline":
                                for (int asd = 1; asd <= 1000; asd++) {
                                    System.out.println("\b");
                                }
                                lifeLine.lifeline(2);
                                first = System.currentTimeMillis();
                                sss = m.next();
                                second = System.currentTimeMillis();
                                timer = second - first + timer;
                                if (timer > 31000) {
                                    System.out.println("Sorry you are too late. You have 30 Seconds to give answer");
                                    return;
                                }
                                switch (sss) {
                                    case "b":
                                    case "B":
                                        System.out.println("yes you are right you won Rs.12,50,000");
                                        Thread.sleep(1600);
                                        System.out.println("\nYour next question for Rs.25,00,000");
                                        Thread.sleep(2000);
                                        for (int asd = 1; asd <= 1000; asd++) {
                                            System.out.println("\b");
                                        }
                                        break move4;
                                    default:
                                        System.out.println("You are wrong today you won Only Rs.6,40,000/-");
                                        return;
                                }
                            default:
                                System.out.println("You are wrong today you won Only 6,40,000/-");
                                return;
                        }
                    default:
                        System.out.println("You are wrong today you won Only 6,40,000/-");
                        return;
                }
            }
            //********************************************************************************************************************************************
            //********************************************************************************************************************************************


            //********************************************************************************************************************************************
            //********************************************************************************************************************************************

            move4:
            {
                System.out.println("\t\t\t\t\t\t _____________________________");
                System.out.println("\t\t\t\t\t\t|your Question for Rs 60,00,000 is |");
                System.out.println("The wife of which of these famous sportspersons was once captain of Indian volleyball team?   \t\t|-----------Lifeline------------|");
                System.out.println("(A) K.D.Jadav                             (B) Milkha Singh                                     \t\t|Type lifeline\t\t\t|");
                System.out.println("                                                                                              \t\t|-------------------------------|");
                System.out.println("(C)Dhyan Chand                            (D) Prakash Padukone");
                for (int clr = 1; clr <= 25; clr++) {
                    System.out.println("");
                }

                System.out.print(">>>>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<<<\nAns:-");
                long first = System.currentTimeMillis();
                String sss = m.next();
                long second = System.currentTimeMillis();
                long timer = second - first;
                if (timer > 31000) {
                    System.out.println("Sorry you are too late. You have 30 Seconds to give answer");
                    Thread.sleep(1500);

                    return;
                }
                switch (sss) {
                    case "b":
                    case "B":
                        System.out.println("yes you are right you won Rs.60,00,000");
                        Thread.sleep(1600);
                        System.out.println("\nYour next question for Rs.1 Crore");
                        Thread.sleep(2000);
                        for (int asd = 1; asd <= 1000; asd++) {
                            System.out.println("\b");
                        }
                        break move4;
                    case "LIFELINE":
                    case "Lifeline":
                    case "lifeline":
                        for (int asd = 1; asd <= 1000; asd++) {
                            System.out.println("\b");
                        }
                        lifeLine.lifeline(2);
                        first = System.currentTimeMillis();
                        sss = m.next();
                        helper.checkTimeOut(first);
                        switch (sss) {
                            case "b":
                            case "B":
                                System.out.println("yes you are right you won Rs.60,00,000");
                                Thread.sleep(1600);
                                System.out.println("\nYour next question for Rs.1 Crore");
                                Thread.sleep(2000);
                                for (int asd = 1; asd <= 1000; asd++) {
                                    System.out.println("\b");
                                }
                                break move4;
                            case "LIFELINE":
                            case "Lifeline":
                            case "lifeline":
                                for (int asd = 1; asd <= 1000; asd++) {
                                    System.out.println("\b");
                                }
                                lifeLine.lifeline(2);
                                first = System.currentTimeMillis();
                                sss = m.next();
                                second = System.currentTimeMillis();
                                timer = second - first + timer;
                                if (timer > 31000) {
                                    System.out.println("Sorry you are too late. You have 30 Seconds to give answer");
                                    return;
                                }
                                switch (sss) {
                                    case "b":
                                    case "B":
                                        System.out.println("yes you are right you won Rs.60,00,000");
                                        Thread.sleep(1600);
                                        System.out.println("\nYour next question for Rs.1 Crore");
                                        Thread.sleep(2000);
                                        for (int asd = 1; asd <= 1000; asd++) {
                                            System.out.println("\b");
                                        }
                                        break move4;
                                    default:
                                        System.out.println("You are wrong today you won Only Rs.6,40,000/-");
                                        return;
                                }
                            default:
                                System.out.println("You are wrong today you won Only 6,40,000/-");
                                return;
                        }
                    default:
                        System.out.println("You are wrong today you won Only 6,40,000/-");
                        return;
                }
            }
            //********************************************************************************************************************************************
            //********************************************************************************************************************************************

            move4:
            {
                System.out.println("\t\t\t\t\t\t _____________________________");
                System.out.println("\t\t\t\t\t\t|your Question for Rs 1 Crore is |");
                System.out.println("Who was the first Indian to be President of UN General assembly ?                     \t\t|-----------Lifeline------------|");
                System.out.println("(A) Mrs. Vijay Lakshmi Pandit          (B) Ramesh Bhandari                            \t\t|Type lifeline\t\t\t|");
                System.out.println("                                                                                      \t\t|-------------------------------|");
                System.out.println("(C) Natwar Singh                       (D) Krishna Menon");
                System.out.println("Who was the first Indian to be President of UN General assembly ?");
                System.out.println("A.Mrs. Vijay Lakshmi Pandit\t\t\tB. Ramesh Bhandari\n");
                System.out.println("C.Natwar Singh\t\t\tD.Krishna Menon");
                for (int clr = 1; clr <= 25; clr++) {
                    System.out.println("");
                }

                System.out.print(">>>>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<<<\nAns:-");
                long first = System.currentTimeMillis();
                String sss = m.next();
                long second = System.currentTimeMillis();
                long timer = second - first;
                if (timer > 31000) {
                    System.out.println("Sorry you are too late. You have 30 Seconds to give answer");
                    Thread.sleep(1500);

                    return;
                }
                switch (sss) {
                    case "a":
                    case "A":
                        int sc3 = statement.executeUpdate("update score set score=10000000 where name like '" + sname + "' && age=" + age + ";");
                        System.out.println("yes you are right you won Rs.1 Crore");
                        Thread.sleep(1600);
                        System.out.println("\nYour next question for Rs.3 Crore");
                        Thread.sleep(2000);
                        for (int asd = 1; asd <= 1000; asd++) {
                            System.out.println("\b");
                        }
                        break move4;
                    case "LIFELINE":
                    case "Lifeline":
                    case "lifeline":
                        for (int asd = 1; asd <= 1000; asd++) {
                            System.out.println("\b");
                        }
                        lifeLine.lifeline(1);
                        first = System.currentTimeMillis();
                        sss = m.next();
                        helper.checkTimeOut(first);
                        switch (sss) {
                            case "a":
                            case "A":
                                sc3 = statement.executeUpdate("update score set score=10000000 where name like '" + sname + "' && age=" + age + ";");
                                System.out.println("yes you are right you won Rs.1 Crore");
                                Thread.sleep(1600);
                                System.out.println("\nYour next question for Rs.3 Crore");
                                Thread.sleep(2000);
                                for (int asd = 1; asd <= 1000; asd++) {
                                    System.out.println("\b");
                                }
                                break move4;
                            case "LIFELINE":
                            case "Lifeline":
                            case "lifeline":
                                for (int asd = 1; asd <= 1000; asd++) {
                                    System.out.println("\b");
                                }
                                lifeLine.lifeline(1);
                                first = System.currentTimeMillis();
                                sss = m.next();
                                second = System.currentTimeMillis();
                                timer = second - first + timer;
                                if (timer > 31000) {
                                    System.out.println("Sorry you are too late. You have 30 Seconds to give answer");
                                    return;
                                }
                                switch (sss) {
                                    case "a":
                                    case "A":
                                        sc3 = statement.executeUpdate("update score set score=10000000 where name like '" + sname + "' && age=" + age + ";");
                                        System.out.println("yes you are right you won Rs.1 Crore");
                                        Thread.sleep(1600);
                                        System.out.println("\nYour next question for Rs.3 Crore");
                                        Thread.sleep(2000);
                                        for (int asd = 1; asd <= 1000; asd++) {
                                            System.out.println("\b");
                                        }
                                        break move4;
                                    default:
                                        System.out.println("You are wrong today you won Only Rs.6,40,000/-");
                                        return;
                                }
                            default:
                                System.out.println("You are wrong today you won Only 6,40,000/-");
                                return;
                        }
                    default:
                        System.out.println("You are wrong today you won Only 6,40,000/-");
                        return;
                }
            }
            //********************************************************************************************************************************************
            //********************************************************************************************************************************************

            move4:
            {
                System.out.println("\t\t\t\t\t\t _____________________________");
                System.out.println("\t\t\t\t\t\t|your Question for Rs 3 Crore is |");
                System.out.println("Which Indian Scientist has had the distinction of receiving not only the Nobel Prize, but also Bharat Ratna ?\t\t|-----------Lifeline------------|");
                System.out.println("(A) Dr. Mitali Mukherjee                       (B) A.P.J Abdul Kalam                                         \t\t|Type lifeline\t\t\t|");
                System.out.println("                                                                                                             \t\t|-------------------------------|");
                System.out.println("(C) Narayan Murthy                             (D)Dr. C. V. Raman");
                for (int clr = 1; clr <= 25; clr++) {
                    System.out.println("");
                }

                System.out.print(">>>>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<<<\nAns:-");
                long first = System.currentTimeMillis();
                String sss = m.next();
                long second = System.currentTimeMillis();
                long timer = second - first;
                if (timer > 31000) {
                    System.out.println("Sorry you are too late. You have 30 Seconds to give answer");
                    Thread.sleep(1500);

                    return;
                }
                switch (sss) {
                    case "d":
                    case "D":

                        System.out.println("yes you are right you won Rs.3 Crore");
                        Thread.sleep(1600);
                        System.out.println("\nYour next question for Rs.5 Crore");
                        Thread.sleep(2000);
                        for (int asd = 1; asd <= 1000; asd++) {
                            System.out.println("\b");
                        }
                        break move4;
                    case "LIFELINE":
                    case "Lifeline":
                    case "lifeline":
                        for (int asd = 1; asd <= 1000; asd++) {
                            System.out.println("\b");
                        }
                        lifeLine.lifeline(4);
                        first = System.currentTimeMillis();
                        sss = m.next();
                        helper.checkTimeOut(first);
                        switch (sss) {
                            case "d":
                            case "D":

                                System.out.println("yes you are right you won Rs.3 Crore");
                                Thread.sleep(1600);
                                System.out.println("\nYour next question for Rs.5 Crore");
                                Thread.sleep(2000);
                                for (int asd = 1; asd <= 1000; asd++) {
                                    System.out.println("\b");
                                }
                                break move4;
                            case "LIFELINE":
                            case "Lifeline":
                            case "lifeline":
                                for (int asd = 1; asd <= 1000; asd++) {
                                    System.out.println("\b");
                                }
                                lifeLine.lifeline(4);
                                first = System.currentTimeMillis();
                                sss = m.next();
                                second = System.currentTimeMillis();
                                timer = second - first + timer;
                                if (timer > 31000) {
                                    System.out.println("Sorry you are too late. You have 30 Seconds to give answer");
                                    return;
                                }
                                switch (sss) {
                                    case "d":
                                    case "D":

                                        System.out.println("yes you are right you won Rs.3 Crore");
                                        Thread.sleep(1600);
                                        System.out.println("\nYour next question for Rs.5 Crore");
                                        Thread.sleep(2000);
                                        for (int asd = 1; asd <= 1000; asd++) {
                                            System.out.println("\b");
                                        }
                                        break move4;
                                    default:
                                        System.out.println("You are wrong today you won Only Rs.1 Crore/-");
                                        return;
                                }
                            default:
                                System.out.println("You are wrong today you won Only Rs.1 Crore/-");
                                return;
                        }
                    default:
                        System.out.println("You are wrong today you won Only Rs.1 Crore/-");
                        return;
                }
            }
            //********************************************************************************************************************************************
            //********************************************************************************************************************************************

            move4:
            {
                System.out.println("\t\t\t\t\t\t _____________________________");
                System.out.println("\t\t\t\t\t\t|your Question for Rs 5 Crore is |");
                System.out.println(" Who was the Indian who won the gold medal for the first time in Olympic in shooting event.     \t\t|-----------Lifeline------------|");
                System.out.println("(A) K.D. Jadhav                        (B) Major Rajyawardhan Rathor                            \t\t|Type lifeline\t\t\t|");
                System.out.println("                                                                                                \t\t|-------------------------------|");
                System.out.println("(C) Abhinav Bindra                     (D) Samser Jang ");
                for (int clr = 1; clr <= 25; clr++) {
                    System.out.println("");
                }

                System.out.print(">>>>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<<<\nAns:-");
                long first = System.currentTimeMillis();
                String sss = m.next();
                long second = System.currentTimeMillis();
                long timer = second - first;
                if (timer > 31000) {
                    System.out.println("Sorry you are too late. You have 30 Seconds to give answer");
                    Thread.sleep(1500);

                    return;
                }
                switch (sss) {
                    case "c":
                    case "C":
                        System.out.println("yes you are right you won Rs.5 Crore");
                        Thread.sleep(1600);
                        System.out.println("\nYour next question for Rs.7 Crore");
                        Thread.sleep(2000);
                        for (int asd = 1; asd <= 1000; asd++) {
                            System.out.println("\b");
                        }
                        break move4;
                    case "LIFELINE":
                    case "Lifeline":
                    case "lifeline":
                        for (int asd = 1; asd <= 1000; asd++) {
                            System.out.println("\b");
                        }
                        lifeLine.lifeline(3);
                        first = System.currentTimeMillis();
                        sss = m.next();
                        helper.checkTimeOut(first);
                        switch (sss) {
                            case "c":
                            case "C":
                                System.out.println("yes you are right you won Rs.5 Crore");
                                Thread.sleep(1600);
                                System.out.println("\nYour Last question for Rs.7 Crore");
                                Thread.sleep(2000);
                                for (int asd = 1; asd <= 1000; asd++) {
                                    System.out.println("\b");
                                }
                                break move4;
                            case "LIFELINE":
                            case "Lifeline":
                            case "lifeline":
                                for (int asd = 1; asd <= 1000; asd++) {
                                    System.out.println("\b");
                                }
                                lifeLine.lifeline(3);
                                sss = m.next();
                                switch (sss) {
                                    case "c":
                                    case "C":
                                        System.out.println("yes you are right you won Rs.5 Crore");
                                        Thread.sleep(1600);
                                        System.out.println("\nYour next question for Rs.7 Crore");
                                        Thread.sleep(2000);
                                        for (int asd = 1; asd <= 1000; asd++) {
                                            System.out.println("\b");
                                        }
                                        break move4;
                                    default:
                                        System.out.println("You are wrong today you won Only Rs.1 Crore");
                                        return;
                                }
                            default:
                                System.out.println("You are wrong today you won Only Rs.1Crore");
                                return;
                        }
                    default:
                        System.out.println("You are wrong today you won Only Rs.1 Crore/-");
                        return;
                }
            }
            /* */

            //********************************************************************************************************************************************
            //********************************************************************************************************************************************
            move4:
            {
                System.out.println("\t\t\t\t\t\t ________________________________");
                System.out.println("\t\t\t\t\t\t|your Question for Rs 7 Crore is |");
                System.out.println("Who was the first Indian woman to take part in Olympic Games?                         \t\t|-----------Lifeline------------|");
                System.out.println("(A) Merry La RO                 (B) P.T.Usha                                          \t\t|Type lifeline\t\t\t|");
                System.out.println("                                                                                      \t\t|-------------------------------|");
                System.out.println("(B) Anju B.G.                   (D) K.Malleshwree ");
                for (int clr = 1; clr <= 25; clr++) {
                    System.out.println("");
                }

                System.out.print(">>>>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<<<\nAns:-");
                long first = System.currentTimeMillis();
                String sss = m.next();
                long second = System.currentTimeMillis();
                long timer = second - first;
                if (timer > 31000) {
                    System.out.println("Sorry you are too late. You have 30 Seconds to give answer");
                    Thread.sleep(1500);

                    return;
                }
                switch (sss) {
                    case "a":
                    case "A":
                        int sc4 = statement.executeUpdate("update score set score=70000000 where name like '" + sname + "' && age=" + age + ";");
                        System.out.println("yes you are right you won Rs.7 Crore\n");
                        Thread.sleep(500);
                        for (int asd = 1; asd <= 100; asd++) {
                            System.out.println("");
                        }
                        for (int win = 1; win <= 4; win++) {

                            System.out.println("\t\t\t\t************************************You Won*************************************");
                            System.out.println("\t\t\t\t*                                                                              *");
                            System.out.println("\t\t\t\t*   W       W   IIIIIIIIIIII   N       N   N       N   EEEEEEEE   RRRRRRRR     *  ");
                            System.out.println("\t\t\t\t*   W       W        II        N N     N   N N     N   EE         R       R    *  ");
                            System.out.println("\t\t\t\t*   W       W        II        N  N    N   N  N    N   EE         R       R    *  ");
                            System.out.println("\t\t\t\t*   W   W   W        II        N   N   N   N   N   N   EEEEEEEE   RRRRRRRR     *  ");
                            System.out.println("\t\t\t\t*   W  W W  W        II        N    N  N   N    N  N   EE         R R          *  ");
                            System.out.println("\t\t\t\t*   W W   W W        II        N     N N   N     N N   EE         R   R        * ");
                            System.out.println("\t\t\t\t*   WW     WW   IIIIIIIIIIII   N       N   N       N   EEEEEEEE   R     R      *  ");
                            System.out.println("\t\t\t\t*                                                                              *");
                            System.out.println("\t\t\t\t************************************You Won*************************************");
                            for (int asd = 1; asd <= 18; asd++) {
                                System.out.println("");
                            }
                            Thread.sleep(500);
                            for (int asd = 1; asd <= 18; asd++) {
                                System.out.println("");
                            }
                            System.out.println("\t\t\t\t++++++++++++++++++++++++++++++++++++You Won+++++++++++++++++++++++++++++++++++++");
                            System.out.println("\t\t\t\t+                                                                              +");
                            System.out.println("\t\t\t\t+   +       +   ++++++++++++   +       +   +       +   ++++++++   ++++++++     +  ");
                            System.out.println("\t\t\t\t+   +       +        ++        + +     +   + +     +   ++         +       +    +  ");
                            System.out.println("\t\t\t\t+   +       +        ++        +  +    +   +  +    +   ++         +       +    +  ");
                            System.out.println("\t\t\t\t+   +   +   +        ++        +   +   +   +   +   +   ++++++++   ++++++++     +  ");
                            System.out.println("\t\t\t\t+   +  + +  +        ++        +    +  +   +    +  +   ++         + +          +  ");
                            System.out.println("\t\t\t\t+   + +   + +        ++        +     + +   +     + +   ++         +   +        + ");
                            System.out.println("\t\t\t\t+   ++     ++   ++++++++++++   +       +   +       +   ++++++++   +     +      +  ");
                            System.out.println("\t\t\t\t+                                                                              +");
                            System.out.println("\t\t\t\t++++++++++++++++++++++++++++++++++++You Won+++++++++++++++++++++++++++++++++++++");
                            for (int asd = 1; asd <= 18; asd++) {
                                System.out.println("");
                            }
                            Thread.sleep(500);
                            for (int asd = 1; asd <= 18; asd++) {
                                System.out.println("");
                            }
                            System.out.println("\t\t\t\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~You Won~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                            System.out.println("\t\t\t\t~                                                                              ~");
                            System.out.println("\t\t\t\t~   ~       ~   ~~~~~~~~~~~~   ~       ~   ~       ~   ~~~~~~~~   ~~~~~~~~     ~  ");
                            System.out.println("\t\t\t\t~   ~       ~        ~~        ~ ~     ~   ~ ~     ~   ~~         ~       ~    ~  ");
                            System.out.println("\t\t\t\t~   ~       ~        ~~        ~  ~    ~   ~  ~    ~   ~~         ~       ~    ~  ");
                            System.out.println("\t\t\t\t~   ~   ~   ~        ~~        ~   ~   ~   ~   ~   ~   ~~~~~~~~   ~~~~~~~~     ~  ");
                            System.out.println("\t\t\t\t~   ~  ~ ~  ~        ~~        ~    ~  ~   ~    ~  ~   ~~         ~ ~          ~  ");
                            System.out.println("\t\t\t\t~   ~ ~   ~ ~        ~~        ~     ~ ~   ~     ~ ~   ~~         ~   ~        ~ ");
                            System.out.println("\t\t\t\t~   ~~     ~~   ~~~~~~~~~~~~   ~       ~   ~       ~   ~~~~~~~~   ~     ~      ~  ");
                            System.out.println("\t\t\t\t~                                                                              ~");
                            System.out.println("\t\t\t\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~You Won~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                            for (int asd = 1; asd <= 18; asd++) {
                                System.out.println("");
                            }
                        }
                        Thread.sleep(3000);
                        break move4;
                    case "LIFELINE":
                    case "Lifeline":
                    case "lifeline":
                        for (int asd = 1; asd <= 1000; asd++) {
                            System.out.println("\b");
                        }
                        lifeLine.lifeline(1);
                        first = System.currentTimeMillis();
                        sss = m.next();
                        helper.checkTimeOut(first);
                        switch (sss) {
                            case "a":
                            case "A":
                                sc4 = statement.executeUpdate("update score set score=70000000 where name like '" + sname + "' && age=" + age + ";");
                                System.out.println("yes you are right you won Rs.7 Crore\n");
                                Thread.sleep(5000);
                                for (int asd = 1; asd <= 100; asd++) {
                                    System.out.println("");
                                }
                                for (int win = 1; win <= 4; win++) {

                                    System.out.println("\t\t\t\t************************************You Won*************************************");
                                    System.out.println("\t\t\t\t*                                                                              *");
                                    System.out.println("\t\t\t\t*   W       W   IIIIIIIIIIII   N       N   N       N   EEEEEEEE   RRRRRRRR     *  ");
                                    System.out.println("\t\t\t\t*   W       W        II        N N     N   N N     N   EE         R       R    *  ");
                                    System.out.println("\t\t\t\t*   W       W        II        N  N    N   N  N    N   EE         R       R    *  ");
                                    System.out.println("\t\t\t\t*   W   W   W        II        N   N   N   N   N   N   EEEEEEEE   RRRRRRRR     *  ");
                                    System.out.println("\t\t\t\t*   W  W W  W        II        N    N  N   N    N  N   EE         R R          *  ");
                                    System.out.println("\t\t\t\t*   W W   W W        II        N     N N   N     N N   EE         R   R        * ");
                                    System.out.println("\t\t\t\t*   WW     WW   IIIIIIIIIIII   N       N   N       N   EEEEEEEE   R     R      *  ");
                                    System.out.println("\t\t\t\t*                                                                              *");
                                    System.out.println("\t\t\t\t************************************You Won*************************************");
                                    for (int asd = 1; asd <= 18; asd++) {
                                        System.out.println("");
                                    }
                                    Thread.sleep(800);
                                    for (int asd = 1; asd <= 18; asd++) {
                                        System.out.println("");
                                    }
                                    System.out.println("\t\t\t\t++++++++++++++++++++++++++++++++++++You Won+++++++++++++++++++++++++++++++++++++");
                                    System.out.println("\t\t\t\t+                                                                              +");
                                    System.out.println("\t\t\t\t+   +       +   ++++++++++++   +       +   +       +   ++++++++   ++++++++     +  ");
                                    System.out.println("\t\t\t\t+   +       +        ++        + +     +   + +     +   ++         +       +    +  ");
                                    System.out.println("\t\t\t\t+   +       +        ++        +  +    +   +  +    +   ++         +       +    +  ");
                                    System.out.println("\t\t\t\t+   +   +   +        ++        +   +   +   +   +   +   ++++++++   ++++++++     +  ");
                                    System.out.println("\t\t\t\t+   +  + +  +        ++        +    +  +   +    +  +   ++         + +          +  ");
                                    System.out.println("\t\t\t\t+   + +   + +        ++        +     + +   +     + +   ++         +   +        + ");
                                    System.out.println("\t\t\t\t+   ++     ++   ++++++++++++   +       +   +       +   ++++++++   +     +      +  ");
                                    System.out.println("\t\t\t\t+                                                                              +");
                                    System.out.println("\t\t\t\t++++++++++++++++++++++++++++++++++++You Won+++++++++++++++++++++++++++++++++++++");
                                    for (int asd = 1; asd <= 18; asd++) {
                                        System.out.println("");
                                    }
                                    Thread.sleep(800);
                                }
                                Thread.sleep(5000);
                                break move4;
                            case "LIFELINE":
                            case "Lifeline":
                            case "lifeline":
                                for (int asd = 1; asd <= 1000; asd++) {
                                    System.out.println("\b");
                                }
                                lifeLine.lifeline(1);
                                first = System.currentTimeMillis();
                                sss = m.next();
                                second = System.currentTimeMillis();
                                timer = second - first + timer;
                                if (timer > 31000) {
                                    System.out.println("Sorry you are too late. You have 30 Seconds to give answer");
                                    return;
                                }
                                sss = m.next();
                                switch (sss) {
                                    case "a":
                                    case "A":
                                        sc4 = statement.executeUpdate("update score set score=70000000 where name like '" + sname + "' && age=" + age + ";");
                                        System.out.println("yes you are right you won Rs.7 Crore\n");
                                        Thread.sleep(2000);
                                        for (int asd = 1; asd <= 100; asd++) {
                                            System.out.println("");
                                        }
                                        for (int win = 1; win <= 4; win++) {

                                            System.out.println("\t\t\t\t************************************You Won*************************************");
                                            System.out.println("\t\t\t\t*                                                                              *");
                                            System.out.println("\t\t\t\t*   W       W   IIIIIIIIIIII   N       N   N       N   EEEEEEEE   RRRRRRRR     *  ");
                                            System.out.println("\t\t\t\t*   W       W        II        N N     N   N N     N   EE         R       R    *  ");
                                            System.out.println("\t\t\t\t*   W       W        II        N  N    N   N  N    N   EE         R       R    *  ");
                                            System.out.println("\t\t\t\t*   W   W   W        II        N   N   N   N   N   N   EEEEEEEE   RRRRRRRR     *  ");
                                            System.out.println("\t\t\t\t*   W  W W  W        II        N    N  N   N    N  N   EE         R R          *  ");
                                            System.out.println("\t\t\t\t*   W W   W W        II        N     N N   N     N N   EE         R   R        * ");
                                            System.out.println("\t\t\t\t*   WW     WW   IIIIIIIIIIII   N       N   N       N   EEEEEEEE   R     R      *  ");
                                            System.out.println("\t\t\t\t*                                                                              *");
                                            System.out.println("\t\t\t\t************************************You Won*************************************");
                                            for (int asd = 1; asd <= 18; asd++) {
                                                System.out.println("");
                                            }
                                            Thread.sleep(800);
                                            for (int asd = 1; asd <= 18; asd++) {
                                                System.out.println("");
                                            }
                                            System.out.println("\t\t\t\t++++++++++++++++++++++++++++++++++++You Won+++++++++++++++++++++++++++++++++++++");
                                            System.out.println("\t\t\t\t+                                                                              +");
                                            System.out.println("\t\t\t\t+   +       +   ++++++++++++   +       +   +       +   ++++++++   ++++++++     +  ");
                                            System.out.println("\t\t\t\t+   +       +        ++        + +     +   + +     +   ++         +       +    +  ");
                                            System.out.println("\t\t\t\t+   +       +        ++        +  +    +   +  +    +   ++         +       +    +  ");
                                            System.out.println("\t\t\t\t+   +   +   +        ++        +   +   +   +   +   +   ++++++++   ++++++++     +  ");
                                            System.out.println("\t\t\t\t+   +  + +  +        ++        +    +  +   +    +  +   ++         + +          +  ");
                                            System.out.println("\t\t\t\t+   + +   + +        ++        +     + +   +     + +   ++         +   +        + ");
                                            System.out.println("\t\t\t\t+   ++     ++   ++++++++++++   +       +   +       +   ++++++++   +     +      +  ");
                                            System.out.println("\t\t\t\t+                                                                              +");
                                            System.out.println("\t\t\t\t++++++++++++++++++++++++++++++++++++You Won+++++++++++++++++++++++++++++++++++++");
                                            for (int asd = 1; asd <= 18; asd++) {
                                                System.out.println("");
                                            }
                                            Thread.sleep(800);
                                        }
                                        Thread.sleep(5000);
                                        for (int asd = 1; asd <= 100; asd++) {
                                            System.out.println("\b");
                                        }
                                        break move4;
                                    default:
                                        System.out.println("You are wrong today you won Only Rs.1 Crore");
                                        return;
                                }
                            default:
                                System.out.println("You are wrong today you won Only Rs.1 Crore");
                                return;
                        }
                    default:
                        System.out.println("You are wrong today you won Only Rs.1 Crore/-");
                        return;
                }
            }
            //********************************************************************************************************************************************
            //********************************************************************************************************************************************


        } else {
            System.out.println("Process under Development");
        }
    }
}
