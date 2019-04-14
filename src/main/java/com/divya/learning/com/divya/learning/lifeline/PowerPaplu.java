package com.divya.learning.com.divya.learning.lifeline;

import com.divya.learning.LifeLine;

public class PowerPaplu {

    public void powerPapluHelp(int option, int ap, int ph, int ff, int fq, int pp, int ask, int dd, LifeLine lifeLine){
                for (int space = 1; space <= 23; space++) {
                    System.out.println("");
                }
                if (pp == 1) {
                    System.out.println("Audience poll is Renewed");
                    ap = 0;
                    lifeLine.lifeline(option);
                } else if (pp == 2) {
                    System.out.println("Phone a Friend is Renewed");
                    ph = 0;
                    lifeLine.lifeline(option);
                } else if (pp == 3) {
                    System.out.println("Fifty Fifty is Renewed");
                    ff = 0;
                    lifeLine.lifeline(option);
                } else if (pp == 4) {
                    System.out.println("Flip the Question is Renewed");
                    ask = 0;
                    lifeLine.lifeline(option);
                } else if (pp == 6) {
                    System.out.println("Ask an expert is Renewed");
                    ask = 0;
                    lifeLine.lifeline(option);
                } else {
                    System.out.println("Double dip is Renewed");
                    dd = 0;
                    lifeLine.lifeline(option);
                }


                System.out.println("Renew any lifeline");
    }
}
