package codechef;

import java.io.*;
import java.util.*;

public class MinimumSum {

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

    public static FastReader sc;
    public static StringBuilder str  ;

    public static void main(String[] args) {

        sc = new FastReader();
        str = new StringBuilder();

        int ntc = sc.nextInt();

        while(ntc -- > 0) {
            solve();
        }

        System.out.println(str.toString());

    }

    public static void solve() {

        int N = sc.nextInt();

        int [] A = new int[N];

        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }

        int val = gcd(A[0], A[0]);

        for (int i = 1; i <A.length ; i++) {
            val = gcd(val, A[i]);
        }

        str.append(N * 1L * val).append("\n");
    }
    public static int gcd(int a, int b) {

        if(a == 0) {
            return b;
        }

        return gcd(b%a , a);

    }
}
