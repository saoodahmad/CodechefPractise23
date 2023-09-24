package codechef;

import java.io.*;

import java.util.*;


public class PenaltyShootOut {

    static Scanner sc;
    static StringBuilder str;

    public static void main(String[] args) {

        sc = new Scanner(System.in);
        str = new StringBuilder();


        while (sc.hasNextLine()) {

            String i = sc.nextLine();

            solve(i);
        }



        System.out.println(str.toString());

    }

    private static void solve(String line) {


        char score[] = line.toCharArray();

        int chefScore = 0;

        int friendsScore = 0;

        int kicks_chef = 0;

        int kicks_friends = 0;

        String winner = "";

        int noOfShootsToWin = 0;

        // penalty shots
        for (int i = 0; i < 10; i++) {

            if (chefScore > friendsScore) {
                if (chefScore > friendsScore + (5 - kicks_friends)) {


                    // chef friend cannot win
                    winner = "TEAM-A";
                    noOfShootsToWin = i;
                    break;
                }
            } else if (friendsScore > chefScore) {

                if (friendsScore > chefScore + (5 - kicks_chef)) {

                    // chef cannot win
                    winner = "TEAM-B";
                    noOfShootsToWin = i;
                    break;
                }

            }
            if (i % 2 == 0) {
                // chef chance

                if (score[i] == '1') {
                    chefScore++;
                }
                kicks_chef++;
            } else {
                // friend chance
                if (score[i] == '1') {
                    friendsScore++;
                }
                kicks_friends++;
            }

        }
//
        if (winner.isEmpty()) {
            // no winner in penalty shoot out

            // sudden death

            int shootouts = 11;
            while (shootouts <= 20) {

                if (shootouts % 2 != 0) {
                    if (score[shootouts - 1] == '1') {
                        chefScore++;
                        kicks_chef++;
                    }
                }else {
                    if (score[shootouts - 1] == '1') {
                        friendsScore++;
                        kicks_friends++;
                    }

                    if(chefScore > friendsScore)
                    {
                        winner = "TEAM-A";
                        noOfShootsToWin = shootouts;
                        break;
                    }else if(friendsScore > chefScore)
                    {
                        winner = "TEAM-B";
                        noOfShootsToWin = shootouts;
                        break;
                    }
                }
                shootouts++;
            }
        }

        if(winner.isEmpty())
        {
            str.append("TIE").append("\n");
            return;
        }

        str.append(winner).append(" ").append(noOfShootsToWin).append("\n");

    }
}
