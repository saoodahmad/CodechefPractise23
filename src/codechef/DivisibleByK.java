package codechef;

import java.io.*;
import java.util.*;

public class DivisibleByK {

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

        FastReader sc = new FastReader();

        int ntc = sc.nextInt();

        while(ntc -- > 0) {

//            boolean isPossible = isSubsetProductPossible();


            int N = sc.nextInt();

            long K = sc.nextLong();

            long [] arr = new long[N];

            for (int i = 0; i < N; i++) {
                    arr[i] = sc.nextLong();
            }


        }
    }

    static boolean isSubsetProductPossible (long arr [], int idx, long K) {

        if(idx == arr.length) {
            return false;
        }


        return false;
    }
}
