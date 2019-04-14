package com.divya.learning;

import com.divya.learning.com.divya.learning.lifeline.*;

import java.util.Scanner;

public class LifeLine {
    private int ap = 0, ph = 0, ff = 0, fq = 0, pp = 0, ask = 0, dd = 0;

    private Helper helper;
    private AudiencePoll audiencePoll;
    private PhoneOfFriend phoneOfFriend;
    private FiftyFifty fiftyFifty;
    private FlipQuestion flipQuestion;
    private PowerPaplu powerPaplu;
    private AskExperts askExperts;

    LifeLine() {
        this.audiencePoll = new AudiencePoll();
        this.phoneOfFriend = new PhoneOfFriend();
        this.fiftyFifty = new FiftyFifty();
        this.flipQuestion = new FlipQuestion();
        this.helper = new Helper();
        this.powerPaplu = new PowerPaplu();
        this.askExperts = new AskExperts();
    }

    public void lifeline(int option) {
        Scanner m = new Scanner(System.in);

                try {
                    helper.lifeLineOptions();
                    helper.spacing();
                    int lifeline = m.nextInt();
                    System.out.println();
                    System.out.println();
                    switch (lifeline) {
                        case 1:
                            try {
                                ap = ap + 1;
                                if (ap == 1) {
                                    switch (option){
                                        case 1:
                                            audiencePoll.audienceHelp(1);
                                            break;
                                        case 2:
                                            audiencePoll.audienceHelp(2);
                                            break;
                                        case 3:
                                            audiencePoll.audienceHelp(3);
                                            break;
                                        case 4:
                                            audiencePoll.audienceHelp(4);
                                            break;
                                    }
                                } else {
                                    lifeLineUsed(option);
                                }
                            } catch (InterruptedException exc) {
                                System.out.println("!!!!!!!!!!!!!!!!!!!!RESTART!!!!!!!!!!!!!!!!!!!");
                            }
                            break;
                        case 2:
                            for (int space = 1; space <= 25; space++) {
                                System.out.println("");
                            }
                            ph = ph + 1;
                            if (ph == 1) {
                                switch (option){
                                    case 1:
                                        phoneOfFriend.phoneOfFriendHelp(1, m);
                                        break;
                                    case 2:
                                        phoneOfFriend.phoneOfFriendHelp(2, m);
                                        break;
                                    case 3:
                                        phoneOfFriend.phoneOfFriendHelp(3, m);
                                        break;
                                    case 4:
                                        phoneOfFriend.phoneOfFriendHelp(4, m);
                                        break;
                                }
                            } else {
                                lifeline(option);
                            }
                            break;
                        case 3:
                            for (int move = 1; move <= 30; move++) {
                                System.out.println("");
                            }
                            ff = ff + 1;
                            if (ff == 1) {
                                switch (option){
                                    case 1:
                                        fiftyFifty.fiftyFiftyHelp(1);
                                        break;
                                    case 2:
                                        fiftyFifty.fiftyFiftyHelp(2);
                                        break;
                                    case 3:
                                        fiftyFifty.fiftyFiftyHelp(3);
                                        break;
                                    case 4:
                                        fiftyFifty.fiftyFiftyHelp(4);
                                        break;
                                }
                            } else {
                                lifeline(option);
                            }
                            break;
                        case 4:
                            fq = fq + 1;
                            if (fq == 1) {
                                switch (option){
                                    case 1:
                                        flipQuestion.flipQuestionHelp(1);
                                        break;
                                    case 2:
                                        flipQuestion.flipQuestionHelp(2);
                                        break;
                                    case 3:
                                        flipQuestion.flipQuestionHelp(3);
                                        break;
                                    case 4:
                                        flipQuestion.flipQuestionHelp(4);
                                        break;
                                }
                            } else {
                                lifeline(option);
                            }
                            break;
                        case 5:
                            pp = pp + 1;
                            if (pp == 1) {
                                helper.lifeLineOptions();
                                int pp = m.nextInt();
                                switch (option){
                                    case 1:
                                        powerPaplu.powerPapluHelp(1, ap, ph, ff, fq, pp, ask, dd, this);
                                        break;
                                    case 2:
                                        powerPaplu.powerPapluHelp(2, ap, ph, ff, fq, pp, ask, dd, this);
                                        break;
                                    case 3:
                                        powerPaplu.powerPapluHelp(3, ap, ph, ff, fq, pp, ask, dd, this);
                                        break;
                                    case 4:
                                        powerPaplu.powerPapluHelp(4, ap, ph, ff, fq, pp, ask, dd, this);
                                        break;
                                }
                            } else {
                                lifeline(option);
                            }
                            break;
                        case 6:
                            ask = ask + 1;
                            if (ask == 1) {
                                switch (option){
                                    case 1:
                                        askExperts.askExportsHelp(1);
                                        break;
                                    case 2:
                                        askExperts.askExportsHelp(2);
                                        break;
                                    case 3:
                                        askExperts.askExportsHelp(3);
                                        break;
                                    case 4:
                                        askExperts.askExportsHelp(4);
                                        break;
                                }
                            } else {
                                lifeline(option);
                            }
                            break;
                        case 7:
                            dd = dd + 1;
                            if (dd == 1) {
                                System.out.println("Double dip");
                                System.out.println("Enter Two Option 1 by 1");
                                helper.spacing();
                                String as;
                                as = m.next();
                                switch (as) {
                                    case "a":
                                    case "A":
                                        System.out.println("A is right Enter once again");
                                        break;
                                    default:
                                        System.out.println("Answer is wrong try again");
                                }
                            } else {
                                lifeline(option);
                            }
                            break;
                        default:
                            System.out.println("you have enter wrong choice");
                            lifeline(1);
                            break;
                    }
                } catch (InterruptedException exc) {
                    System.out.println("!!!!!!!!!!!!!!!!!!!!RESTART!!!!!!!!!!!!!!!!!!!");
                }

            }

    private void lifeLineUsed(int option) {
        switch (option){
            case 1:
                helper.lifelineAlreadyUsed(1, this);
                break;
            case 2:
                helper.lifelineAlreadyUsed(2, this);
                break;
            case 3:
                helper.lifelineAlreadyUsed(3, this);
                break;
            case 4:
                helper.lifelineAlreadyUsed(4, this);
                break;
        }
    }

}

