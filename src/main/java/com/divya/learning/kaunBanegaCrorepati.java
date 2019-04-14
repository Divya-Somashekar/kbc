package com.divya.learning;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class kaunBanegaCrorepati {

    public static void main(String args[]) throws Exception {

        Connection connect = DriverManager.getConnection("Jdbc:mysql://localhost:3306/kbc", "root", "mysql");
        Statement statement = connect.createStatement();

        try {
            kaunBanegaCrorepati kbc = new kaunBanegaCrorepati();
            Scanner scanner = new Scanner(System.in);

            new Logo().selectLogo();


            Thread.sleep(1100);

            while(true) {
            System.out.println("++++++++++++++++++++++++++");
            System.out.println("+   Enter Your choice    +");
            System.out.println("++++++++++++++++++++++++++");
            System.out.println("+ 1.Play                 +");
            System.out.println("+ 2.Practise zone        +");
            System.out.println("+ 3.Your last Score      +");
            System.out.println("+ 4.High Score           +");
            System.out.println("+ 5.Help                 +");
            System.out.println("+ 6.Exit                 +");
            System.out.println("++++++++++++++++++++++++++");

            System.out.print(">>>>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<<<\n");
            int enter = scanner.nextInt();
                switch (enter) {
                    case 1:
                        PlayKBC playKBC = new PlayKBC();
                        playKBC.play(statement, scanner);
                        break;
                    case 2:
                        PractiseZoneKBC practiseZoneKBC = new PractiseZoneKBC();
                        practiseZoneKBC.practise(statement, scanner);
                        break;
                    case 3:
                        LastScore lastScore = new LastScore();
                        lastScore.last(scanner, statement);
                        break;
                    case 4:
                        HighScore highScore = new HighScore();
                        highScore.high(statement);
                        break;
                    case 5:
                        HelpKBC helpKBC = new HelpKBC();
                        helpKBC.help();
                        break;
                    default:
                        return;
                }
            }
        } catch (InterruptedException exc) {
            System.out.println("sleep\\wait is not working");
        }

    }

}

