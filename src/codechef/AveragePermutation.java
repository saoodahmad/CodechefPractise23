package codechef;

import java.util.*;
import java.io.*;

public class AveragePermutation {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        StringBuilder str = new StringBuilder();

        int ntc = sc.nextInt();

        while(ntc -- > 0) {
            int n = sc.nextInt();

            int num = n;

            int ans [] = new int[n];

            ans[0] = num;

            ans[n - 1] = num - 1;

            num = num -2;

            for(int i = n - 2; i >= Math.ceil(n/2); i= i - 1) {

                    if(i == n - i - 1) {
                        ans[i] = num;
                    }else {
                        ans[i] = num ;
                        ans[n - i - 1] = num - 1;
                        num -= 2;
                    }
            }


            for(int i =0; i<ans.length; i++) {
                str.append(ans[i]).append(" ");
            }

            str.append("\n");
        }

        System.out.println(str.toString());

    }
}
