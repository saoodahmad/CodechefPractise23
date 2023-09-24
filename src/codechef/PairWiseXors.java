package codechef;

import java.util.*;
import java.io.*;

public class PairWiseXors {

    static FastReader sc;
    static StringBuilder str;

    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        float nextFloat() {
            return Float.parseFloat(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (Exception e) {
                e.printStackTrace();
            }
            return str;
        }

        char nextChar() {

            char c = ' ';
            try {
                c = (char) br.read();
            } catch (Exception e) {
                e.printStackTrace();
            }
            return c;
        }
    }

    public static void main(String[] args) {


        sc = new FastReader();

        str = new StringBuilder();

        int ntc = sc.nextInt();

        while (ntc-- > 0) {
            solve();
        }

        System.out.println(str.toString());
    }

    private static void solve() {

        int X = sc.nextInt();

        if (X % 2 != 0) {
            str.append(-1).append("\n");
            return;
        }

        for (int i = 0; i < 30; i++) {



            boolean condition1 =((1 <<i )& (X/2)) != 0;

            boolean condition2 = (X / 2 != 1 << i);
            if (condition1 && condition2) {
                str.append(X / 2).append(" ").append(1 << i).append(" ").append(0).append("\n");
                return;
            }
        }

        str.append(-1).append("\n");


    }
}

