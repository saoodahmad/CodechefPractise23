package codechef;

import java.util.*;

public class ChocolateDistribution {

    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);

        int ntc = sc.nextInt();

        while(ntc -- >0) {

            int N = sc.nextInt();

            int mid = N/2 ;

            if(N % 2 != 0) {
                System.out.println(mid + " " + (mid + 1) + " " + mid);
            }else {

                if(N % 3 == 0) {
                    int c = (N/3) - 1;
                    int rem = N - (3 * c);

                    if(rem % 2  != 0) {
                        System.out.println( c+ rem  + " "  + c  + " " +  c);
                    }else {
                        System.out.println( (c + rem/2) + " " + c  + " " + (c + rem/2));
                    }

//                    System.out.println(c + " " + (N - (3 * c))  + " " + c);
                }else {

                    int c = N/3;

                    System.out.println("c " + c);

                    int rem = N - (3 * c);

                    if(rem % 2  != 0) {
                        System.out.println( c+ rem  + " "  + c  + " " +  c);
                    }else {
                        System.out.println( (c + rem/2) + " " + c  + " " + (c + rem/2));
                    }



                }


            }

        }
    }
}
