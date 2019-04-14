package com.divya.learning;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class LastScore {
    void last(Scanner m, Statement statement) throws InterruptedException, SQLException {
        System.out.println("\t\t\t)))))))))))))))))))))))))))))))))))))))))Your high Score(((((((((((((((((((((((((((((((((((((((((((((");

        String yourname;
        int yourage, a = 0;

        System.out.println("Enter your name ");
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<\nAns:-");
        yourname = m.next();
        System.out.println("Enter you age");
        yourage = m.nextInt();

        ResultSet Res = statement.executeQuery("select * from score where name like'" + yourname + "' && age=" + yourage + ";");
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        while (Res.next()) {

            System.out.println(" Name =>" + Res.getString(2) + "    Age  =>" + Res.getInt(3) + " Total Earn=>" + Res.getInt(4));

            a++;
        }
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

    }
}
