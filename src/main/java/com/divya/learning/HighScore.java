package com.divya.learning;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class HighScore {
    void high(Statement statement) throws SQLException {
        int a = 0;

        ResultSet Res = statement.executeQuery("select * from score order by score desc;");
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("+                                High Score                                       +");
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        while (Res.next()) {

            System.out.println(" Name =>" + Res.getString(2) + " Age  =>" + Res.getInt(3) + " Total Earn=>" + Res.getInt(4));
            System.out.println();

            a += 2;
        }
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

    }
}
